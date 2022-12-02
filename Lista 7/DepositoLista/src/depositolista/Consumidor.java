
package depositolista;

public class Consumidor implements Runnable{

    private String nome;
    private Deposito deposito;
    
    Consumidor(String nome, Deposito deposito){
        this.nome = nome;
        this.deposito = deposito;
    }
    
    @Override
    public void run() {
        int produto;
        for(int i=0; i<10; i++){
            produto = deposito.envia(this.nome);
            System.out.println("Enviou produto "+produto+" para "+nome);
        }
    }
    
}
