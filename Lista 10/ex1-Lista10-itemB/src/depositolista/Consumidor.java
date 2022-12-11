
package depositolista;

public class Consumidor implements Runnable{

    private String nome;
    private Deposito deposito;
    private int consumidos;
    
    Consumidor(String nome, Deposito deposito){
        this.nome = nome;
        this.deposito = deposito;
        this.consumidos = 0;
    }
    
    public int getConsumidos(){
        return this.consumidos;
    }
    
    @Override
    public void run() {
        int produto;
        while(this.deposito.getFechou() == 0 || this.deposito.getTamanhoPilha() != 0){
            produto = deposito.envia(this.nome);
            if(produto != -1){
                //System.out.println("Enviou produto "+produto+" para "+nome);
                this.consumidos++;
            }
        }
        //System.out.println("Fim da Thread "+ this.nome);
        //System.out.println("Consumidos: "+this.consumidos + " por "+ this.nome);
    }
    
}
