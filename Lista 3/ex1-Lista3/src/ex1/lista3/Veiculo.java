package ex1.lista3;

public abstract class Veiculo {
    private int id;
    private String marca;
    
    public Veiculo(int id, String marca){
        this.id = id;
        this.marca = marca;
    }
    
    public abstract void  listarVerificacoes();
    public abstract void  ajustar();
    public abstract void  limpar();
    
}
