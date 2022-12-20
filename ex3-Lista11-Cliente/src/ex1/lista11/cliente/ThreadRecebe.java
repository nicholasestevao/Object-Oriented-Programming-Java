
package ex1.lista11.cliente;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ThreadRecebe implements Runnable {
    
    private BufferedReader RECEBE;
    
    ThreadRecebe(BufferedReader RECEBE){
        this.RECEBE = RECEBE;
    }
    
    @Override
    public void run() {
        try{
            String str = "";
            while(str != null && str.compareTo("Cambio") != 0){
                str = RECEBE.readLine();
                System.out.println(str);  
            }
            
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
    
}
