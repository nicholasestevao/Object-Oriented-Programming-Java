
package depositolista;

public class DepositoLista {

    public static void main(String[] args) {
        Deposito d = new Deposito();
        
        Thread tp = new Thread(new Produtor("Padaria",d));
        String [] nomes = {"Maria", "Joao", "Pedro", "Manoela", "Daniele"};
        Consumidor[] consumidores = new Consumidor[nomes.length];
        Thread [] tcs = new Thread[nomes.length];
        for(int i = 0; i< nomes.length; i++){
            consumidores[i] = new Consumidor(nomes[i], d);
            tcs[i] = new Thread(consumidores[i]);
        }
        
        tp.start();
        for(int i = 0; i< nomes.length; i++){            
            tcs[i].start();
        }
        try{
            tp.join(); // aguarda o final da producao
            int total = 0;
            for(int i = 0; i< nomes.length; i++){            
                tcs[i].join();
                total += consumidores[i].getConsumidos();
            }
            System.out.println("Total consumido: "+total);
            
        }catch(InterruptedException e){
            System.out.println("Erro: "+e.getMessage());
        }
        
        for (int i=0; i<nomes.length; i++)
            System.out.println("O consumidor " + nomes[i] + " consumiu " + consumidores[i].getConsumidos());
        
        System.out.println();

        int maior = 0;
        for (int i=1; i<nomes.length; i++)
            if (consumidores[i].getConsumidos() > consumidores[maior].getConsumidos()){
                maior = i;
            }                
        System.out.println("Maior consumidor " + nomes[maior] + ": consumiu " + consumidores[maior].getConsumidos() + " produtos.");
    
    }
    
}
