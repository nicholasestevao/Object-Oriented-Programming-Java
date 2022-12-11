
package ex2.lista10;
import java.util.Random;

public class ThreadOperacaoBancariaSincronizada implements Runnable{
    private Conta conta;
    private int numThread;
    
    ThreadOperacaoBancariaSincronizada(Conta conta, int num){
        this.conta = conta;
        this.numThread = num;
    }

    private void comSincronizacao(){
        //System.out.println("Com sincronização:");
        Random g = new Random();
        int valor = g.nextInt();
        for(int i = 0; i<5000; i++){
            this.conta.deposita(valor);
            //System.out.println(numThread +" depositou "+ valor);
            this.conta.saca(valor);
            //System.out.println(numThread +" sacou "+valor);
        }
    }
    
    @Override
    public void run() {
        this.comSincronizacao();       
    }
    
}
