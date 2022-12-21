
package servidor;

import executavel.Executavel;
import executavel.TesteDeExecucao;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadRecebe extends TesteDeExecucao implements Runnable {
    
   Socket SERVIDOR_SOCKET;
    
    public ThreadRecebe(Socket SERVIDOR_SOCKET){
        this.SERVIDOR_SOCKET = SERVIDOR_SOCKET;
    }
    
    @Override
    public void run() {
        try{
            OutputStreamWriter outputStream = new OutputStreamWriter(SERVIDOR_SOCKET.getOutputStream());
            PrintWriter  ENVIA = new PrintWriter(outputStream);
            
            InputStream inputStream = SERVIDOR_SOCKET.getInputStream();
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            
            
            Thread envia = new Thread(new ThreadEnvia(ENVIA));
      
            ArrayList<Executavel> objetos = (ArrayList<Executavel>) objectInputStream.readObject();
            
            envia.start();
            envia.join();
            
            setExecutavel(objetos);
            fazer();
            
            objectInputStream.close();
        } catch (IOException | InterruptedException | ClassNotFoundException  e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
    
}
