
package ex1.lista11.servidor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class ThreadEnvia implements Runnable{

    private PrintWriter ENVIA;
    
    ThreadEnvia(PrintWriter ENVIA){
        this.ENVIA = ENVIA;
    }
    @Override
    public void run() {
        try {
            BufferedReader LEITOR_ENTRADA_PADRAO = new BufferedReader(new InputStreamReader(System.in));
            String userInput = "";
            while(userInput.compareTo("Cambio") != 0){
                userInput = LEITOR_ENTRADA_PADRAO.readLine();
                ENVIA.println(userInput);     
                ENVIA.flush();
            }

            LEITOR_ENTRADA_PADRAO.close();
            
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
    
}
