/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/**
 *
 * @author isaac
 */
public class Ex2Lista11 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> msgs = new ArrayList();
        msgs.add("");
        try {
            ServerSocket servidor = new ServerSocket(555);
            LeTeclado leitor = new LeTeclado(servidor, msgs);
            Thread ler = new Thread(leitor);
            ler.start();
            while(true) {
                Socket cliente = servidor.accept();
                Thread envia_cliente = new Thread(new EnviaCliente(cliente, msgs));
                envia_cliente.start();
            }
        } catch(IOException e) {
            System.out.println(e.getMessage());
            System.exit(1); 
        }
        
    }
    
}
