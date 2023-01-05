package ex1.lista1;

public class Processador {
    private String modelo;
    private int clock;
    
    public Processador(String modelo, int clock) {
        this.modelo = modelo;
        this.clock = clock;
    }
    
    public void mostra(){
        System.out.println("Processador:");
        System.out.println("    Modelo: "+modelo);
        System.out.println("    Clock: "+clock);
    }
    
    public String getModelo(){
        return modelo;
    }
    
    private void emergencyShutDown(){
        clock = 0;
        System.out.println("Emergency Shut Down.");
    }
    
    public void overclock(int clock){
        float porcentagemIncremento = (clock - this.clock)/this.clock;
        if(porcentagemIncremento <= 0.15){
            this.clock = clock;
        }else{
            System.out.println("Variacao do clock muito abrupta (maior do que 15%).");
            emergencyShutDown();
        }
    }
}
