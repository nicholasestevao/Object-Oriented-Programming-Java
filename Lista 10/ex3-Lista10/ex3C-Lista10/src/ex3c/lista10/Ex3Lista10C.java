/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3c.lista10;

/**
 *
 * @author isaac
 */
public class Ex3Lista10C {
    
    public static void testeA(int ini, int fim) {
        for (int a = ini; a < fim; a++) {
            double quant = (Math.pow(10, a));
            System.out.println("Quantidade de números: " + quant);
            long tempo_inicial = System.currentTimeMillis();
            RadomSqrt s = new RadomSqrt(quant);
            for(int i = 0; i <10; i++) {
                s.run();   
            }
            System.out.println("Tempo Total de execução: " + ((double) (System.currentTimeMillis() - tempo_inicial) / 1000) + " s");
        }
    }

    public static void testeB(int ini, int fim) {
        int nCores = Runtime.getRuntime().availableProcessors();
        Thread[] threads = new Thread[nCores];
        for (int a = ini; a < fim; a++) {
            double quant = (Math.pow(10, a) / nCores);
            System.out.println("Número de Threads: " + nCores + ". Quantidade de números por Thread: " + quant + ".");
            long tempo_inicial = System.currentTimeMillis();
            for (int i = 0; i < 10; i++) {
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
                //System.out.println((i + 1)+ ") " + "Tempo de execução: " + ((double)(System.currentTimeMillis() - tempo_inicial)/1000) + " s");
            }
            System.out.println("Tempo Total de execução: " + ((double) (System.currentTimeMillis() - tempo_inicial) / 1000) + " s");
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Teste C: ");
        System.out.println("SEM THREADS:");
        testeA(7, 11);
        System.out.println();
        System.out.println("COM THREADS:");
        testeB(7, 11);
    }
}
