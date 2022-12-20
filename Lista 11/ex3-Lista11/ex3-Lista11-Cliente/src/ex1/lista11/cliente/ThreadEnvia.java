
package ex1.lista11.cliente;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class ThreadEnvia implements Runnable{

    private Socket CLIENTE_SOCKET;
    
    ThreadEnvia(Socket cliente){
        this.CLIENTE_SOCKET = cliente;
    }
    @Override
    public void run() {
        try {
            PrintWriter ENVIA = new PrintWriter(new OutputStreamWriter(CLIENTE_SOCKET.getOutputStream()));
            
            BufferedReader LEITOR_ENTRADA_PADRAO = new BufferedReader(new InputStreamReader(System.in));
            String userInput = "";
            while(userInput.compareTo("BYE") != 0){
                userInput = LEITOR_ENTRADA_PADRAO.readLine();
                //System.out.println("Digitou: "+userInput);
                //ENVIA.println("O cliente diz \"" + userInput +"\"");   
                ENVIA.println(userInput); 
                ENVIA.flush();
            }

            ENVIA.close();
            LEITOR_ENTRADA_PADRAO.close();
            
            
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
    
}
