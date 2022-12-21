/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import executavel.*;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Ex4Lista11Servidor extends TesteDeExecucao {
        
    public static void main(String[] args) {
        try {
            ServerSocket OUVIDO = new ServerSocket(8008);
            Socket SERVIDOR_SOCKET = OUVIDO.accept();
            
            Thread recebe = new Thread (new ThreadRecebe(SERVIDOR_SOCKET));
            
            recebe.start();
            recebe.join();
            
            SERVIDOR_SOCKET.close();
            OUVIDO.close();
        } catch(IOException | InterruptedException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
