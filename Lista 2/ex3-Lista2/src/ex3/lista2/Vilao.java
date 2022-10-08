
package ex3.lista2;

public class Vilao extends Personagem{
    private int anosDePrisao;
    
    public Vilao(String nome, int vida, int anosDePrisao) {
        super(nome, vida);
        this.anosDePrisao = anosDePrisao;
    }
    
    public int getAnosDePrisao(){
        return this.anosDePrisao;
    }
    public void setAnosDePrisao(int pAnos){
        this.anosDePrisao = pAnos;
    }
}
