
package ex1.lista11.cliente;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex1Lista11Cliente {
    public static void main(String[] args) {
        try {
            //ServerSocket OUVIDO = new ServerSocket(8000);
            //Socket CLIENTE_SOCKET = OUVIDO.accept();
            Socket CLIENTE_SOCKET = new Socket("localhost", 8008);
            Thread recebe = new Thread(new ThreadRecebe(CLIENTE_SOCKET));
            recebe.start();
            Thread envia = new Thread(new ThreadEnvia(CLIENTE_SOCKET));
            envia.start();
            
            //Thread threadServidor = new Thread(new ThreadServidor(SERVIDOR_SOCKET));
            //threadServidor.start();
            
            recebe.join();
            envia.join();
            CLIENTE_SOCKET.close();
            
            
            /*ServerSocket OUVIDO = new ServerSocket(8000);
            Socket SERVIDOR_SOCKET = OUVIDO.accept();
            
            
            
            Thread recebe = new Thread(new ThreadRecebe(CLIENTE_SOCKET));
            Thread envia = new Thread(new ThreadEnvia(SERVIDOR_SOCKET));
            
            envia.start();
            recebe.start();*/
            //CLIENTE_SOCKET.close();
            /*PrintWriter ENVIA = new PrintWriter(CLIENTE_SOCKET.getOutputStream(), true);
            BufferedReader RECEBE = new BufferedReader(new InputStreamReader(CLIENTE_SOCKET.getInputStream()));

            BufferedReader LEITOR_ENTRADA_PADRAO = new BufferedReader(new InputStreamReader(System.in));
            String userInput = "";
            while(userInput.compareTo("BYE") != 0){
                userInput = LEITOR_ENTRADA_PADRAO.readLine();
                ENVIA.println("O cliente diz \"" + userInput +"\"");                
                System.out.println(RECEBE.readLine());                         
            }

            ENVIA.close();
            RECEBE.close();
            LEITOR_ENTRADA_PADRAO.close();
            CLIENTE_SOCKET.close();*/
        } catch (IOException | InterruptedException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
    
}
