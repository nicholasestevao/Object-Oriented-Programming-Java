package ex1.lista11.cliente.grafico;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class TelaClienteController implements Initializable {
    
    @FXML
    private Label lbMsgServidor;
    
    @FXML
    private Label lbSuaMsg;
    
    @FXML
    private Label lbConexao;
    
    @FXML
    private Button bEnviar;
    
    @FXML
    private Button bConectar;
    
    @FXML
    private Button bSair;
    
    @FXML
    private TextField tfMsgServidor;
    
    @FXML
    private TextField tfIP;
    
    @FXML
    private TextField tfPorta;
    
    
    
    private PrintWriter ENVIA;
    
    private Socket CLIENTE_SOCKET;
    
    private Thread recebe;

    
    @FXML
    public void sair(){
        try{
            ENVIA.println("BYE");
            //this.recebe.join();
            this.ENVIA.close();
            this.CLIENTE_SOCKET.close();
            Stage stage = (Stage) this.tfMsgServidor.getScene().getWindow();
            stage.close();
        }catch( IOException e)
        {
            System.out.println("Erro: "+e.getMessage());
        } 
    }
    
    
    @FXML
    public void enviarMensagem(){
        String userInput = tfMsgServidor.getText();
        //System.out.println("Digitou: "+userInput);
        ENVIA.println("O cliente diz \"" + userInput +"\"");     
        ENVIA.flush();
    }
    
    @FXML
    public void conectar(){
        
        try {
            this.CLIENTE_SOCKET = new Socket(tfIP.getText(), Integer.parseInt(tfPorta.getText())); //8008
            lbConexao.setText("Conectou com sucesso");
            // Thread Envia
            this.ENVIA = new PrintWriter(new OutputStreamWriter(CLIENTE_SOCKET.getOutputStream()));

            //Thread Recebe
            this.recebe = new Thread(new ThreadRecebe(CLIENTE_SOCKET, lbMsgServidor, this.ENVIA)); // passa o ENVIA somente para o fechamento da conexao com "BYE"
            recebe.start();
            
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
            lbConexao.setText("Erro: " + e.getMessage());
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }      
    
}
