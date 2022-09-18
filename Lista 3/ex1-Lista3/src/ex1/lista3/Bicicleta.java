package ex1.lista3;

public class Bicicleta extends Veiculo {
    private String dono;
    
    public Bicicleta(int id, String marca, String dono){
        super(id, marca);
        this.dono = dono;
    }
    public void  listarVerificacoes(){
        System.out.println("Listando verificacoes do bicicleta ("+this.dono+").");
    }
    
    public void  ajustar(){
        System.out.println("Ajustando bicicleta ("+this.dono+").");
    }
    
    public void  limpar(){
        System.out.println("Limpando bicicleta ("+this.dono+").");
    }
}
