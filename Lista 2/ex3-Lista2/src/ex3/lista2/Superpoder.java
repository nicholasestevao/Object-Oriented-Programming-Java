
package ex3.lista2;

public class Superpoder {
    private int categoria;
    private String nome;
    
    public Superpoder(int categoria, String nome){
        this.categoria = categoria;
        this.nome = nome;
    }
    
    public int getCategoria(){
        return this.categoria;
    }
    public String getNome(){
        return this.nome;
    }
    public void setCategoria(int pcategoria){
        this.categoria = pcategoria;
    }
    public void setNome(String pnome){
        this.nome = pnome;
    }
}
