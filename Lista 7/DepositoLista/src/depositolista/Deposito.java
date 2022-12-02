
package depositolista;
    
public class Deposito {
    private int produto;
    private boolean temProduto;
    
    Deposito(){
        temProduto = false;
    }
    
    synchronized public void recebe(String produtor, int produto){
        if(temProduto){//se deposito cheio, aguarde
            try{
                wait(); // produtor aguarda o consumidor retirar o produto
            }catch(InterruptedException e){
                System.out.println("Erro: "+e.getMessage());
            }
        }
        //agora deposita o produto
        
        this.produto = produto;
        this.temProduto = true;
        notify(); // avisa o consumidor que agora tem produto em estoque
    }
    
    synchronized public int envia(String consumidor){
        if(!temProduto){ // se deposito vazio, aguarda
            try{
                wait(); // consumidor aguarda o produtor colocar o produto no deposito
            }catch(InterruptedException e){
                System.out.println("Erro: " + e.getMessage());
            }
        }
        //tem produto
        temProduto = false;
        
        notify(); // avisa o produtor que agora o deposito esta vazio
        return produto;
    }
}
