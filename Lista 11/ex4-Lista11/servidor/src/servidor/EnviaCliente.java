/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;

/**
 *
 * @author isaac
 */
public class EnviaCliente implements Runnable {
    Socket cliente;
    ArrayList<String> msgs;
    String enviada;
    String enviar;
    boolean servidor_aberto;
    
    EnviaCliente(Socket cliente, ArrayList<String> msgs) {
        this.cliente = cliente;
        this.msgs = msgs;
        this.enviada = "";
        this.enviar = "";
        this.servidor_aberto = true;
    }
    
    @Override
    public void run() {
        try {
            PrintWriter envia_cliente = new PrintWriter(new OutputStreamWriter(cliente.getOutputStream()));
            while (servidor_aberto) {
                enviar = msgs.get(msgs.size() - 1); 
                if (!( enviar.equals("") || enviar.equals(enviada))) {
                    enviada = enviar;
                    envia_cliente.println(enviar);
                    envia_cliente.flush();
                }
                
                if (enviada.equals("Fechar") || enviada.equals("fechar")) {
                    envia_cliente.close();
                    servidor_aberto = false;
                }
                
                Thread.sleep(1000); 
            }
        } catch(IOException | InterruptedException e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }
    }
}

