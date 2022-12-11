
package ex2.lista10;
import java.util.Random;

public class ThreadOperacaoBancaria implements Runnable{
    private Conta conta;
    private int numThread;
    
    ThreadOperacaoBancaria(Conta conta, int num){
        this.conta = conta;
        this.numThread = num;
    }
    
    private void semSincronizacao(){
        //System.out.println("Sem sincronização:");
        Random g = new Random();
        int valor = g.nextInt();
        for(int i = 0; i<5000; i++){
            this.conta.depositaSemSincronizacao(valor);
           // System.out.println(numThread +" depositou "+ valor);
            this.conta.sacaSemSincronizacao(valor);
           // System.out.println(numThread +" sacou "+valor);
        }
    }
    
    
    @Override
    public void run() {
        this.semSincronizacao();
    }
    
}
