
package cliente;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
import executavel.*;

public class Ex4Lista11Cliente {
    public static void main(String[] args) {
        try {
            Socket CLIENTE_SOCKET = new Socket("localhost", 8008);
        
            OutputStream outputStream = CLIENTE_SOCKET.getOutputStream();

            ObjectOutputStream ENVIA = new ObjectOutputStream(outputStream);
                       
            BufferedReader LEITOR_ENTRADA_PADRAO = new BufferedReader(new InputStreamReader(System.in));
            
            Thread recebe = new Thread(new ThreadRecebe(CLIENTE_SOCKET));
             
            ArrayList<Executavel> objetos = new ArrayList();
            objetos.add(new Admnistrador());
            objetos.add(new UsuarioPadrao());
            
            String userInput = null;
            while(userInput == null){
                userInput = LEITOR_ENTRADA_PADRAO.readLine();
                if(userInput.equals("enviar") || userInput.equals("Enviar")) {
                    recebe.start();
                    ENVIA.writeObject(objetos);
                    ENVIA.flush();
                    recebe.join();
                } else {
                    userInput = null;
                }
            }
            
            ENVIA.close();
            LEITOR_ENTRADA_PADRAO.close();
            
        } catch (IOException | InterruptedException e) {
            System.out.println("Erro: " + e.getMessage() + e.getLocalizedMessage());
        }
    }
    
}
