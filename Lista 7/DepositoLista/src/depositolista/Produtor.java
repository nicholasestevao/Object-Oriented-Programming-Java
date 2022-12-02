
package depositolista;

public class Produtor implements Runnable{
    String nome;
    Deposito deposito;

    public Produtor(String nome, Deposito deposito) {
        this.nome = nome;
        this.deposito = deposito;
    }

    @Override
    public void run() {
        for(int i=0; i<10; i++){
            int produto = i;
            deposito.recebe(this.nome, produto);
            System.out.println("Recebeu produto "+produto+" de "+nome);
        }
    }
    
    
}
