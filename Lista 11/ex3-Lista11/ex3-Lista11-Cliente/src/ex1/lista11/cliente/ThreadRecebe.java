
package ex1.lista11.cliente;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ThreadRecebe implements Runnable {
    
    private Socket CLIENTE_SOCKET;
    
    ThreadRecebe(Socket cliente){
        this.CLIENTE_SOCKET = cliente;
    }
    
    @Override
    public void run() {
        try{
            BufferedReader RECEBE = new BufferedReader(new InputStreamReader(CLIENTE_SOCKET.getInputStream()));
            String str = "";
            while(str != null && str.compareTo("BYE") != 0){
                str = RECEBE.readLine();
                System.out.println(str);  
            }

            RECEBE.close();
            /*BufferedReader RECEBE = new BufferedReader(new InputStreamReader(CLIENTE_SOCKET.getInputStream()));
            String str = "";
            while(str.compareTo("BYE") != 0){
                str = RECEBE.readLine();
                System.out.println(str);                         
            }

            RECEBE.close();*/
            
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
    
}
