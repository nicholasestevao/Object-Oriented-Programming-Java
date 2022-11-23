
package polinomiosgrafica;

import java.util.ArrayList;

public class Polinomio {
    private Termo[] polinomio;
    private int grauMax;
    
    Polinomio(int max){
        this.polinomio = new Termo[max+1];
        this.grauMax = max;
    }
    
    public void mostra(){
        for(int i=0; i<this.grauMax; i++){
            if(this.polinomio[i] != null){
                System.out.print(this.polinomio[i].getCte()+ "*x^" + i + " + ");
            }            
        }
        if(this.polinomio[this.grauMax] != null){
                System.out.println(this.polinomio[this.grauMax].getCte()+ "*x^" + this.grauMax);
            } 
    }
    
    public void add(Termo termo){
        if(termo.getGrau() <= this.grauMax){
            if(this.polinomio[termo.getGrau()] == null){
                this.polinomio[termo.getGrau()] = termo;
            }else{
                this.polinomio[termo.getGrau()].addCte(termo.getCte());
            }
            
        }
    }
    
    public double calcula(Double x){
        Double res = 0.0;
        for(int i=0; i<=this.grauMax; i++){
            res += this.polinomio[i].getCte()*(Math.pow(x,i));
        }
        return res;
    }
    
}
