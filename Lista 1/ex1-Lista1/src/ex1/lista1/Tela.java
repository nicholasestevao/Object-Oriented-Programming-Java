package ex1.lista1;

public class Tela {
    private String modelo;
    private boolean HDR;
    private int brilho;
    
    public String getModelo(){
        return modelo;
    }
    
    public Tela(String modelo, boolean HDR, int brilho){
        this.modelo = modelo;
        this.HDR = HDR;
        this.brilho = brilho;
    }
    
    public void mostra(){
        System.out.println("Tela:");
        System.out.println("    Modelo: "+modelo);
        System.out.println("    HDR: "+HDR);
        System.out.println("    Brilho: "+brilho);
    }
    
    private void switchHDR(boolean state){
        this.HDR = state;
        System.out.println("HDR: "+state);
    }
    
    public void setBrilho(int brilho){
        if(brilho >= 1000){
            switchHDR(true);
        }else{
            switchHDR(false);
        }
        this.brilho = brilho;
        System.out.println("Brilho: "+brilho);
    }
    
}
