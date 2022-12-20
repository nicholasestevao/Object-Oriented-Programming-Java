package ex1.lista11.servidor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class ThreadServidor implements Runnable{
    private Socket SERVIDOR_SOCKET = null;

    public ThreadServidor(Socket cliente) {
        this.SERVIDOR_SOCKET = cliente;
    }
    
    public void run() {
        try {
            BufferedReader RECEBE = new BufferedReader(new InputStreamReader(SERVIDOR_SOCKET.getInputStream()));
            PrintWriter ENVIA = new PrintWriter(new OutputStreamWriter(SERVIDOR_SOCKET.getOutputStream()));
            String str_recebida = "";
            BufferedReader LEITOR_ENTRADA_PADRAO = new BufferedReader(new InputStreamReader(System.in));
            String str_enviada = "";
            while(str_recebida.compareTo("BYE") != 0 && str_enviada.compareTo("BYE") != 0){
                str_recebida = RECEBE.readLine();
                System.out.println(str_recebida);
                str_enviada = LEITOR_ENTRADA_PADRAO.readLine();
                System.out.println("Digitou: "+ str_enviada);
                ENVIA.println("O servidor diz: \"" + str_enviada + "\"");
                ENVIA.flush();
            }
            RECEBE.close();
            ENVIA.close();
            LEITOR_ENTRADA_PADRAO.close();
            SERVIDOR_SOCKET.close();  
            
        } catch(IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
    
}
