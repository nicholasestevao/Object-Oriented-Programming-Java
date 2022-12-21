
package cliente;

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
            String str = null;
            System.out.println("Aguardando Confirmação");
            while(str == null){
                str = RECEBE.readLine();
                if(str.equals("Recebi")) {
                    System.out.println(str);   
                } else {
                    str = null;
                }
            }
            
            RECEBE.close();
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
    
}
