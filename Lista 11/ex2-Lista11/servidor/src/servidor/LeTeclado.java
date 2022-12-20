/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.util.ArrayList;

/**
 *
 * @author isaac
 */
public class LeTeclado implements Runnable {
    ServerSocket servidor;
    ArrayList<String> msgs;
    boolean status_servidor;
    
    LeTeclado(ServerSocket servidor, ArrayList<String> msgs) {
        this.servidor = servidor;
        this.msgs = msgs;
        this.status_servidor = false;
    }
    
    @Override
    public void run() {
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        String msg;
        try {
            status_servidor = true;
            while (status_servidor) {
                msg = teclado.readLine();
                msgs.add(msg);
                if (msg.equals("Fechar") || msg.equals("fechar")) {
                    status_servidor = false;
                    System.out.println("Fechando...");
                    Thread.sleep(1000);
                    servidor.close();
                    System.exit(0);
                }
            }
        } catch(IOException | InterruptedException e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }
    }
}
