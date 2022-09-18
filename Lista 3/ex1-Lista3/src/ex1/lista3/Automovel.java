
package ex1.lista3;

public class Automovel extends Veiculo{
    private String placa;
    
    public Automovel(int id, String marca, String placa){
        super(id, marca);
        this.placa = placa;
    }
    
    public void  listarVerificacoes(){
        System.out.println("Listando verificacoes do automovel ("+this.placa+").");
    }
    
    public void  ajustar(){
        System.out.println("Ajustando automovel ("+this.placa+").");
    }
    
    public void  limpar(){
        System.out.println("Limpando automovel ("+this.placa+").");
    }
    public void trocarOleo(){
        System.out.println("Trocando oleo do automovel ("+this.placa+").");
    }
}
