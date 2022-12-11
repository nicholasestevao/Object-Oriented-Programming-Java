
package depositolista;
import java.util.Random;

public class Produtor implements Runnable{
    String nome;
    Deposito deposito;
    int numProdutos;
    

    public Produtor(String nome, Deposito deposito) {
        this.nome = nome;        
        this.deposito = deposito;
        Random gerador = new Random();
        this.numProdutos = gerador.nextInt(99999);
    }
    
    

    @Override
    public void run() {
        for(int i=0; i<this.numProdutos; i++){
            int produto = i;
            deposito.recebe(this.nome, produto);
            //System.out.println("Recebeu produto "+produto+" de "+nome);
            //System.out.println("Tamanho pilha: "+this.deposito.getTamanhoPilha());
        }
        this.deposito.fechar();
        //System.out.println("Numero de produtos: "+this.numProdutos);
    }
    
    
}
