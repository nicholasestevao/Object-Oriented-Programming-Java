package ex2lista3;


public class Livro extends Produto {
    private String autor;

    Livro(String nomeloja, double preco, String autor){
        super(nomeloja, preco);
        this.autor = autor;
    }

    public String getAutor(){
        return autor;
    }

    public String getDescricao(){
        return ((super.getDescricao()) + (getAutor()));
    }

    public void setAutor(String vAutor){
        autor = vAutor;
    }
}