
package ex1.lista11.servidor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ThreadRecebe implements Runnable {
    
    private Socket SERVER_SOCKET;
    
    ThreadRecebe(Socket servidor){
        this.SERVER_SOCKET = servidor;
    }
    
    @Override
    public void run() {
        try{
            BufferedReader RECEBE = new BufferedReader(new InputStreamReader(SERVER_SOCKET.getInputStream()));
            String str = "";
            while(str.compareTo("BYE") != 0){
                str = RECEBE.readLine();
                System.out.println(str);                         
            }

            RECEBE.close();
            
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
    
}
