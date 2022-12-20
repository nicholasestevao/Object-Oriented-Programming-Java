
package ex1.lista11.servidor.grafico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class TelaServidorController implements Initializable {
    
    @FXML
    private Label lbMsgCliente;

    @FXML
    private Label lbConexao;
    
    @FXML
    private Button bEnviar;
    
    @FXML
    private Button bSair;
    
    @FXML
    private Button bConectar;
    
    @FXML
    private TextField tfMsgServidor;
    
    /*@FXML
    private TextField tfIP;*/
    
    @FXML
    private TextField tfPorta;
    
    private PrintWriter ENVIA;
    
    private Socket SERVIDOR_SOCKET;
    
    private Thread recebe;
    
    @FXML
    public void sair(){
        try{
            ENVIA.println("BYE");
            //this.recebe.join();
            this.ENVIA.close();
            this.SERVIDOR_SOCKET.close();
            Stage stage = (Stage) this.lbMsgCliente.getScene().getWindow();
            stage.close();
        }catch( IOException e)
        {
            System.out.println("Erro: "+e.getMessage());
        } 
    }
    
    @FXML
    public void conectar(){
        try {
            ServerSocket OUVIDO = new ServerSocket(Integer.parseInt(tfPorta.getText()));
            this.SERVIDOR_SOCKET = OUVIDO.accept();
            lbConexao.setText("Conectou com sucesso!");
            System.out.println("Conectou");
            // Thread Envia
            this.ENVIA = new PrintWriter(new OutputStreamWriter(SERVIDOR_SOCKET.getOutputStream()));

            //Thread Recebe
            this.recebe = new Thread(new ThreadRecebe(SERVIDOR_SOCKET, lbMsgCliente, ENVIA));
            recebe.start();
            
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
            lbConexao.setText("Erro: " + e.getMessage());
        }
    }
    
    @FXML
    public void enviarMensagem(){
        String userInput = tfMsgServidor.getText();
        //System.out.println("Digitou: "+userInput);
        ENVIA.println("O servidor diz \"" + userInput +"\"");     
        ENVIA.flush();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    
        
}    
    

