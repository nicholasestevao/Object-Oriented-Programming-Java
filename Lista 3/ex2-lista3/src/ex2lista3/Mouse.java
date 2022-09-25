package ex2lista3;


public class Mouse extends Produto {
    private String tipo;

    Mouse(String nomeloja, double preco, String tipo){
        super(nomeloja, preco);
        this.tipo = tipo;
    }

    public String getTipo(){
        return tipo;
    }

    public String getDescricao(){
        return ((super.getDescricao()) + (getTipo()));
    }

    public void setTipo(String vTipo){
        tipo = vTipo;
    }

}