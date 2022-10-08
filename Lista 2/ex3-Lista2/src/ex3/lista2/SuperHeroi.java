
package ex3.lista2;

public class SuperHeroi extends Personagem{
    private String nomeVidaReal;

    public SuperHeroi(String nome, int vida, String nomeVidaReal) {
        super(nome, vida);
        this.nomeVidaReal = nomeVidaReal;
    }
    
    public String getNomeVidaReal(){
        return this.nomeVidaReal;
    }
    public void setNomeVidaReal(String pnome){
        this.nomeVidaReal = pnome;
    }
}
