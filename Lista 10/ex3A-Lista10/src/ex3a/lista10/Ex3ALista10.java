/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3a.lista10;

import java.util.Random;

/**
 *
 * @author isaac
 */
public class Ex3ALista10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double quant = Math.pow(10, 7);
        System.out.println(quant);
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            long tempo_inicial = System.currentTimeMillis();
            for (double j = 0; j < quant; j++) {
                double number = r.nextInt() * r.nextDouble();
                double result = Math.sqrt(number);
                //System.out.println("Result = " + number);
            }
            System.out.println((i + 1) + ") " + "Tempo de execução: " + ((double) (System.currentTimeMillis() - tempo_inicial) / 1000) + " s");
        }
    }
    
}
