/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1.lista11.servidor;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex1Lista11Servidor {

    public static void main(String[] args) {
        try {
            ServerSocket OUVIDO = new ServerSocket(8008);
            Socket SERVIDOR_SOCKET = OUVIDO.accept();
            Thread recebe = new Thread(new ThreadRecebe(SERVIDOR_SOCKET));
            recebe.start();
            Thread envia = new Thread(new ThreadEnvia(SERVIDOR_SOCKET));
            envia.start();
            
            //Thread threadServidor = new Thread(new ThreadServidor(SERVIDOR_SOCKET));
            //threadServidor.start();
            
            recebe.join();
            envia.join();
            SERVIDOR_SOCKET.close();

            OUVIDO.close();
        } catch(IOException | InterruptedException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
    
}
