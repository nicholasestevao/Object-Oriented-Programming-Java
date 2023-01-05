package ex1.lista1;

public class SistemaComunicacao {
    private String modelo;
    private boolean antena;
    private boolean antena5G;
    
    public String getModelo(){
        return modelo;
    }
    
    public SistemaComunicacao(String modelo, boolean antena, boolean antena5G){
        this.modelo = modelo;
        this.antena = antena;
        this.antena5G = antena5G;
    }
    
    public void mostra(){
        System.out.println("Sistema de Comunicacao:");
        System.out.println("    Modelo: "+modelo);
        System.out.println("    Antena: "+antena);
        System.out.println("    Antena5G: "+antena5G);
    }
    
    private void switch5G(boolean state){
        this.antena5G = state;
        System.out.println("5G: "+state);
    }
    
    public void ligarAntena(boolean stateAntena, boolean cobertura5G){
        if(stateAntena){
            antena = true;
        }else{
            antena = false;
        }
        System.out.println("Antena: "+stateAntena);
        
        if(cobertura5G && stateAntena){
            switch5G(true);
        }else{
            switch5G(false);
        }
        
    }
}
