
package ex1.lista11.cliente.grafico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ThreadRecebe implements Runnable {
    
    private Socket SERVER_SOCKET;
    private Label label;
    private PrintWriter ENVIA;
    
    ThreadRecebe(Socket servidor, Label label, PrintWriter ENVIA){
        this.SERVER_SOCKET = servidor;
        this.label = label;
        this.ENVIA = ENVIA;
    }
    
    @Override
    public void run() {
        try{
            BufferedReader RECEBE = new BufferedReader(new InputStreamReader(SERVER_SOCKET.getInputStream()));
            String str = "";
            while(str.compareTo("BYE") != 0){
                str = RECEBE.readLine();
                KeyFrame kf = new KeyFrame(Duration.millis(100), new KeyValue(label.textProperty(), str));
                Timeline t = new Timeline(kf);
                t.play();
                System.out.println(str);                         
            }
            
            ENVIA.println("BYE");
            ENVIA.flush();
            ENVIA.close();
            RECEBE.close();
            SERVER_SOCKET.close();
            
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
    
}
