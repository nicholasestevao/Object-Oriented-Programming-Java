
package servidor;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class ThreadEnvia implements Runnable{

    private PrintWriter  ENVIA;
    
    ThreadEnvia(PrintWriter  ENVIA){
        this.ENVIA = ENVIA;
    }
    @Override
    public void run() {
        try {
            ENVIA.println("Recebi");  
            ENVIA.flush();
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            System.out.println("Erro: " + e.getMessage());
            System.exit(1);
        }
    }
    
}
