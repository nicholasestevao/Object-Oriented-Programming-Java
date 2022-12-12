/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3b.lista10;

/**
 *
 * @author isaac
 */
public class Ex3BLista10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nCores = Runtime.getRuntime().availableProcessors();
        Thread[] threads = new Thread[nCores];
        double quant = (Math.pow(10, 7) / nCores);
        System.out.println("Número de Threads: " + nCores + ". Quantidade de números por Thread: " + quant + ".");
        for (int i = 0; i < 10; i++) {
            long tempo_inicial = System.currentTimeMillis();
            for (int j = 0; j < nCores; j++) {
                threads[j] = new Thread(new RadomSqrt(quant));
                threads[j].start();
            }
            for (Thread thread : threads) {
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    System.out.println("Erro: " + e.getMessage());
                }
            }
            System.out.println((i + 1) + ") " + "Tempo de execução: " + ((double) (System.currentTimeMillis() - tempo_inicial) / 1000) + " s");
        }
    }
    
}
