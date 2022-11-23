
package polinomiosgrafica;

public class PolinomiosGrafica {

    public static void main(String[] args) {
        
        Polinomio pol = new Polinomio(3);
        pol.add(new Termo(0,1.0));
        pol.add(new Termo(1,2.0));
        pol.add(new Termo(1,3.0));
        pol.add(new Termo(2,4.0));
        pol.add(new Termo(3,5.0));
        pol.add(new Termo(4,5.0));
        pol.mostra();
        Double x = 1.0;
        System.out.println("Valor em x = "+x+": "+pol.calcula(x));
    }
    
}
