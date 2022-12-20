
package ex1.lista11.cliente;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex1Lista11Cliente {
    public static void main(String[] args) {
        try {
            Socket CLIENTE_SOCKET = new Socket("localhost", 8008);     
            OutputStreamWriter saida = new OutputStreamWriter(CLIENTE_SOCKET.getOutputStream());
        
            PrintWriter ENVIA = new PrintWriter(new OutputStreamWriter(CLIENTE_SOCKET.getOutputStream()));
            
            BufferedReader RECEBE = new BufferedReader(new InputStreamReader(CLIENTE_SOCKET.getInputStream()));
            //Mensagem inicial para autenticar conexao

            BufferedReader LEITOR_ENTRADA_PADRAO = new BufferedReader(new InputStreamReader(System.in));
            String msg_inicial = "";
            msg_inicial = LEITOR_ENTRADA_PADRAO.readLine();
            ENVIA.println(msg_inicial); 
            ENVIA.flush();
            String res_autenticacao = RECEBE.readLine();
            
            if(res_autenticacao.equals("true")){
                System.out.println("Conexao autenticada");
                Thread envia = new Thread(new ThreadEnvia(ENVIA));
                envia.start();
                envia.join();
                System.out.println("Cliente terminou de enviar mensagens");

                Thread recebe = new Thread(new ThreadRecebe(RECEBE));
                recebe.start();
                recebe.join();
                System.out.println("Cliente terminou de receber mensagens");
            }else{
                System.out.println("Conexao nao autenticada");
            }
            
            LEITOR_ENTRADA_PADRAO.close();
            ENVIA.close();
            RECEBE.close();
            CLIENTE_SOCKET.close();

        } catch (IOException | InterruptedException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
    
}
