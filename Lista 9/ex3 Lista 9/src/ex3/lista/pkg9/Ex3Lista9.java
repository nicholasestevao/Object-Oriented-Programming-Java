/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3.lista.pkg9;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

/**
 *
 * @author isaac
 */
public class Ex3Lista9 {
    
    public static void leArquivo(String nome_arquivo) throws IOException {
        int linha_atual;
        try (LineNumberReader leitor = new LineNumberReader(new FileReader(nome_arquivo))) {
            leitor.setLineNumber(0);
            String linha = leitor.readLine();
            while(linha != null) {
                if(leitor.getLineNumber() == 10) {
                    System.out.println(linha  + " (Essa é a 10ª linha)");
                } else {
                    System.out.println( linha);
                }
                linha = leitor.readLine();
            }  
            linha_atual = leitor.getLineNumber();
        }

        if(linha_atual < 10) {
           throw new IOException(nome_arquivo +" (Esse arquivo possuí menos de 10 linhas)");
        }
    }
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            leArquivo("arquivo_13_linhas.txt");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}