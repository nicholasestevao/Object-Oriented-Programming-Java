package ex2lista3;



public class Produto {
    private String nomeloja;
    private double preco;
    private String descricao = "Produto de informatica: ";

    Produto(String nomeloja, double preco){
        this.nomeloja = nomeloja;
        this.preco = preco;
    }

    public String getNomeloja() {
        return nomeloja;
    }

    public double getPreco() {
        return preco;
    }

    public String getDescricao(){
        return descricao;
    }

    public void setNomeloja(String vNomeloja) {
        nomeloja = vNomeloja;
    }

    public void setPreco(double vPreco){
        preco = vPreco;
    }

}