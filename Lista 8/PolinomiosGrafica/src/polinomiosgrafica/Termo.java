
package polinomiosgrafica;

public class Termo {
    private int grau;
    private Double cte;
    
    Termo(int grau, Double cte){
        this.grau = grau;
        this.cte = cte;
    }
    
    public void addCte(Double cte){
        this.cte += cte;
    }

    public int getGrau() {
        return grau;
    }

    public Double getCte() {
        return cte;
    }
    
    
    
}
