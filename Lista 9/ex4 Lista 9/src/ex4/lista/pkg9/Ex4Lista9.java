/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex4.lista.pkg9;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author isaac
 */
public class Ex4Lista9 {
    public static void escreveStreamArquivo(String texto, String nome_Arquivo) throws IOException {
        File arquivo = new File(nome_Arquivo);
        FileOutputStream escreve_arquivo = new FileOutputStream(arquivo);

        ByteArrayInputStream stream_texto = new ByteArrayInputStream(texto.getBytes());

        int buf = stream_texto.read();
        while (buf != -1) {
            escreve_arquivo.write(buf);
            buf = stream_texto.read();
        }
        
        escreve_arquivo.close();
        stream_texto.close();
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            escreveStreamArquivo("Isaac Santos Soares", "saida.txt");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
