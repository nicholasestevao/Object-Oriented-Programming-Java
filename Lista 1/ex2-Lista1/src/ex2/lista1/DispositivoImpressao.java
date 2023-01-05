
package ex2.lista1;

public class DispositivoImpressao extends Dispositivo {
    private int numPagImpressas;
    
    public void DispositivoImpressao(){
        this.numPagImpressas = 0;
    }
    
    public int imprimePagina(int numPagImpressas){
        this.numPagImpressas += numPagImpressas;
        System.out.println("Total de paginas impressas: "+this.numPagImpressas);
        return this.numPagImpressas;
    }
}
