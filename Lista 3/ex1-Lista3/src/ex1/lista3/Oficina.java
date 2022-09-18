package ex1.lista3;
import java.util.*;

public class Oficina extends ArrayList{
    
    private ArrayList<Veiculo> veiculos;
    private int proximo;
    
    public Oficina(){
        this.proximo = 0;
        veiculos = new ArrayList();
        veiculos.add(new Automovel(1, "VW", "ABC-1234"));
        veiculos.add(new Bicicleta(2,"Caloi", "Joao"));
        veiculos.add(new Automovel(3, "Fiat", "DEF-5678"));
        veiculos.add(new Bicicleta(4,"Caloi", "Maria"));
        veiculos.add(new Automovel(5, "BMW", "GHI-9012"));
    }
    
    public Veiculo proximo(){
        return this.veiculos.get(this.proximo++);
    }
    
    public void manutencao(Veiculo v){
        v.listarVerificacoes();
        v.ajustar();
        v.limpar(); 
        if (v instanceof Automovel){
            ((Automovel) v).trocarOleo();
        }            
    }
    
}
