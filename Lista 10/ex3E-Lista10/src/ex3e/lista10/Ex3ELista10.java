/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3e.lista10;

/**
 *
 * @author isaac
 */
public class Ex3ELista10 {
    public static void testeA(double quant) {
        System.out.println("Quantidade de números: " + quant);
        long tempo_inicial = System.currentTimeMillis();
        OperacaoComplexa s = new OperacaoComplexa(quant);
        s.run();
        System.out.println("Tempo Total de execução: " + ((double) (System.currentTimeMillis() - tempo_inicial) / 1000) + " s");
    }

    public static void testeB(double quant) {
        int nCores = Runtime.getRuntime().availableProcessors();
        Thread[] threads = new Thread[nCores];
        double q = quant/nCores;
        System.out.println("Número de Threads: " + nCores + ". Quantidade de números por Thread: " + q + ".");
        long tempo_inicial = System.currentTimeMillis();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < nCores; j++) {
                threads[j] = new Thread(new OperacaoComplexa(q));
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

    public static void testeC(int ini, int fim) {
        int nCores = Runtime.getRuntime().availableProcessors();
        Thread[] threads = new Thread[nCores];
        for (int a = ini; a < fim; a++) {
            double quant = (Math.pow(10, a) / nCores);
            System.out.println("Número de Threads: " + nCores + ". Quantidade de números por Thread: " + quant + ".");
            long tempo_inicial = System.currentTimeMillis();
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < nCores; j++) {
                    threads[j] = new Thread(new OperacaoComplexa(quant));
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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double quant = Math.pow(10, 7);
        System.out.println("Teste A: ");
        testeA(quant);
        System.out.println("Teste B: ");
        testeB(quant);
        System.out.println("Teste C: ");
        testeC(7, 11);
    }
    
}
