
package cliente;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;


public class ThreadEnvia implements Runnable{

    private PrintWriter ENVIA;
    
    ThreadEnvia(Socket socket){
        try {
            this.ENVIA = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
    @Override
    public void run() {
        try {
            Thread.sleep(1500);
            ENVIA.println("Fechar");     
            ENVIA.flush();
            Thread.sleep(1500);
            ENVIA.close();
        } catch (InterruptedException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
    
}
