
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

public class TelaServidorController implements Initializable {
    
    @FXML
    private Label lblMsgCliente;
    
    @FXML
    private Button bEnviar;
    
    @FXML
    private TextField txtMsgServidor;
    
    private PrintWriter ENVIA;
    
    @FXML
    public void enviarMensagem(){
        String userInput = txtMsgServidor.getText();
        //System.out.println("Digitou: "+userInput);
        ENVIA.println("O servidor diz \"" + userInput +"\"");     
        ENVIA.flush();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            ServerSocket OUVIDO = new ServerSocket(8008);
            Socket SERVIDOR_SOCKET = OUVIDO.accept();

            // Thread Envia
            this.ENVIA = new PrintWriter(new OutputStreamWriter(SERVIDOR_SOCKET.getOutputStream()));
            
            ObservableList<String> mensagens = FXCollections.observableArrayList(new ArrayList<String>());
            mensagens.add(new String(""));
            mensagens.addListener(
                new ListChangeListener<String>() { 
                @Override
                public void onChanged(ListChangeListener.Change<? extends String> c) {
                    lblMsgCliente.setText("recebeu algo");
                }
                }
            );
            //Thread Recebe
            Thread recebe = new Thread(new ThreadRecebe(SERVIDOR_SOCKET, mensagens));
            recebe.start();
            
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        

    }    
        
}    
    

