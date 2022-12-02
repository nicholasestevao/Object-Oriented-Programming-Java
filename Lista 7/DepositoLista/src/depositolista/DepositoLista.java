
package depositolista;

public class DepositoLista {

    public static void main(String[] args) {
        Deposito d = new Deposito();
        
        Thread tp = new Thread(new Produtor("Padaria",d));
        Thread tc = new Thread(new Consumidor("Dona Maria",d));
        
        tp.start();
        tc.start();
        
        try{
            tp.join(); // aguarda o final da producao
            tc.join(); // aguarda o final do consumo
        }catch(InterruptedException e){
            System.out.println("Erro: "+e.getMessage());
        }
    }
    
}
