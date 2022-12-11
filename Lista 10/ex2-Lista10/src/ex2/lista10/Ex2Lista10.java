
package ex2.lista10;

public class Ex2Lista10 {

    public static void main(String[] args) {
        
        System.out.println("Testes sem sincronização: ");
        for(int i = 0; i< 5; i++){
            System.out.print("Teste "+i+": ");
            Conta conta = new Conta(100);
            Thread t1 = new Thread(new ThreadOperacaoBancaria(conta,1));
            Thread t2 = new Thread(new ThreadOperacaoBancaria(conta,2));

            t1.start();
            t2.start();
            try{
                t1.join();
                t2.join();
            }catch(Exception e){
                System.out.println("Erro");
            }

            System.out.println("saldo final de "+conta.getSaldo()+ " reais");
        }
        System.out.println("");
        System.out.println("Testes com sincronização: ");
        for(int i = 0; i< 5; i++){
            System.out.print("Teste "+i+": ");
            Conta conta = new Conta(100);
            Thread t1 = new Thread(new ThreadOperacaoBancariaSincronizada(conta,1));
            Thread t2 = new Thread(new ThreadOperacaoBancariaSincronizada(conta,2));

            t1.start();
            t2.start();
            try{
                t1.join();
                t2.join();
            }catch(Exception e){
                System.out.println("Erro");
            }

            System.out.println("saldo final de "+conta.getSaldo()+ " reais");
        }
        
    }
    
}
