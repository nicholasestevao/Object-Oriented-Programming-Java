package ex1.lista1;

public class SistemaSom {
    private String modelo;
    private boolean dolbyAtmos;
    private int volume;
    
    public String getModelo(){
        return modelo;
    }
    
    public SistemaSom(String modelo, boolean dolbyAtmos, int volume){
        this.modelo = modelo;
        this.dolbyAtmos = dolbyAtmos;
        this.volume = volume;
    }
    
    public void mostra(){
        System.out.println("Sistema de Som:");
        System.out.println("    Modelo: "+modelo);
        System.out.println("    Dolby Atmos: "+dolbyAtmos);
        System.out.println("    Volume: "+volume);
    }
    
    private void switchDolbyAtmos(boolean state){
        this.dolbyAtmos = state;
        System.out.println("Dolby Atmos: "+state);
    }
    
    public void setVolume(int volume, boolean dolbyAtmosCompatible){
        if(dolbyAtmosCompatible){
            switchDolbyAtmos(true);
        }else{
            switchDolbyAtmos(false);
        }
        this.volume = volume;
    }
}
