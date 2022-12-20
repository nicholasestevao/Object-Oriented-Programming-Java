/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 *
 * @author isaac
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Socket cliente = new Socket("localhost", 555); // cria link com o servidor
            BufferedReader recebe = new BufferedReader(new InputStreamReader(cliente.getInputStream())); // fluxo de entrada
            
            String msg;
            boolean servidor_status = true;
            while (servidor_status) {
                msg = recebe.readLine();
                if (msg.equals("Fechar") || msg.equals("fechar")) {
                    System.out.println("Servidor Fechado");
                    servidor_status = false;
                    recebe.close(); 
                    cliente.close(); 
                } else {
                    System.out.println("SERVIDOR: " + msg);
                }
            }
        } catch(IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
    
}
