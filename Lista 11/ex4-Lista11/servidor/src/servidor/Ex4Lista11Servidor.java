/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex4Lista11Servidor {

    public static void main(String[] args) {
        try {
            ServerSocket OUVIDO = new ServerSocket(8008);
            Socket SERVIDOR_SOCKET = OUVIDO.accept();
            
            // Testa mensagem inicial
            //Fluxo de entrada do cliente para o servidor
            BufferedReader RECEBE = new BufferedReader(new InputStreamReader(SERVIDOR_SOCKET.getInputStream()));
            
            //Fluxo de saida do servidor para o cliente
            PrintWriter ENVIA = new PrintWriter(new OutputStreamWriter(SERVIDOR_SOCKET.getOutputStream()));
            
            String msg_recebida = "";
            msg_recebida = RECEBE.readLine();
            if(msg_recebida.compareTo("POO") == 0){
                System.out.println("Conexao autenticada");
                ENVIA.println(true);
                ENVIA.flush();
                Thread recebe = new Thread(new ThreadRecebe(RECEBE));
                recebe.start();

                recebe.join();
                System.out.println("Servidor terminou de receber mensagens");
                
                Thread envia = new Thread(new ThreadEnvia(ENVIA));
                envia.start();

                envia.join();                
                System.out.println("Servidor terminou de enviar mensagens");
            }else{
                System.out.println("Conexao nao autenticada");
                ENVIA.println(false);
                ENVIA.flush();
            }
            
            RECEBE.close();   
            ENVIA.close();
            SERVIDOR_SOCKET.close();

            OUVIDO.close();
        } catch(IOException | InterruptedException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
    
}
