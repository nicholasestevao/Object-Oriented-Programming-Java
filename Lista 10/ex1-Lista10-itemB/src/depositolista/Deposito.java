
package depositolista;
import java.util.*;

public class Deposito {
    private Stack<Integer> produtos;
    private int fechou;
    
    Deposito(){
        //temProduto = false;
        this.produtos = new Stack<Integer>();
        this.fechou = 0;
    }
    
    int getTamanhoPilha(){
        return this.produtos.size();
    }
    
    void fechar(){
        //System.out.println("Fechou "+this.produtos.size());
        this.fechou = 1;;
    }
    
    synchronized int getFechou(){   
        notifyAll();
        return this.fechou;
    }
    
    
    synchronized public void recebe(String produtor, int produto){
        /*if(this.produtos.size() == 10){//se deposito cheio, aguarde
            try{
                System.out.println("Pilha cheia, produtor aguarda");
                wait(); // produtor aguarda o consumidor retirar o produto
            }catch(InterruptedException e){
                System.out.println("Erro: "+e.getMessage());
            }
        }*/
        
        //agora deposita o produto        
        this.produtos.push(produto);
        notifyAll(); // avisa o consumidor que agora tem produto em estoque
    }
    
    synchronized public int envia(String consumidor){
        if(this.produtos.isEmpty() && this.getFechou() == 0){ // se deposito vazio e aberto, aguarda
            try{
                //System.out.println("Pilha vazia, consumidor aguarda");
                wait(); // consumidor aguarda o produtor colocar o produto no deposito
            }catch(InterruptedException e){
                System.out.println("Erro: " + e.getMessage());
            }
        }
        //System.out.println("Tamanho: "+this.produtos.size());
        if(this.produtos.empty()){
            return -1;
        }
        //System.out.println("Consumiu");
        return this.produtos.pop();
    }
}
