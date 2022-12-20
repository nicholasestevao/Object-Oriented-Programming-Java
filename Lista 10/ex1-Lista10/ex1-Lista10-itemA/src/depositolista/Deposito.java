
package depositolista;
import java.util.*;

public class Deposito {
    private Stack<Integer> produtos;
    
    Deposito(){
        //temProduto = false;
        this.produtos = new Stack<Integer>();
    }
    
    int getTamanhoPilha(){
        return this.produtos.size();
    }
    
    synchronized public void recebe(String produtor, int produto){
        if(this.produtos.size() == 10){//se deposito cheio, aguarde
            try{
                System.out.println("Pilha cheia, produtor aguarda");
                wait(); // produtor aguarda o consumidor retirar o produto
            }catch(InterruptedException e){
                System.out.println("Erro: "+e.getMessage());
            }
        }
        //agora deposita o produto
        
        this.produtos.push(produto);
        notify(); // avisa o consumidor que agora tem produto em estoque
    }
    
    synchronized public int envia(String consumidor){
        if(this.produtos.size() == 0){ // se deposito vazio, aguarda
            try{
                System.out.println("Pilha vazia, consumidor aguarda");
                wait(); // consumidor aguarda o produtor colocar o produto no deposito
            }catch(InterruptedException e){
                System.out.println("Erro: " + e.getMessage());
            }
        }
        
        notify(); // avisa o produtor que agora o deposito esta vazio
        return this.produtos.pop();
    }
}
