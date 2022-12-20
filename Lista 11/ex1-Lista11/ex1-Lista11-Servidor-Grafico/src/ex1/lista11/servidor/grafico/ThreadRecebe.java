
package ex1.lista11.servidor.grafico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import javafx.collections.ObservableList;
import javafx.scene.control.Label;

public class ThreadRecebe implements Runnable {
    
    private Socket SERVER_SOCKET;
    private ObservableList mensagens;
    
    ThreadRecebe(Socket servidor, ObservableList mensagens){
        this.SERVER_SOCKET = servidor;
        this.mensagens = mensagens;
    }
    
    @Override
    public void run() {
        try{
            BufferedReader RECEBE = new BufferedReader(new InputStreamReader(SERVER_SOCKET.getInputStream()));
            String str = "";
            while(str.compareTo("BYE") != 0){
                str = RECEBE.readLine();
                mensagens.add(str);
                System.out.println(str);                         
            }

            RECEBE.close();
            
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
    
}
