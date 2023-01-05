package ex2.lista1;

public class DispositivoVideo extends Dispositivo{
    private int brilho;
    
    public DispositivoVideo(){
        this.brilho = 0;
    }
    
    public void alteraBrilhoExibicao(int brilho){
        this.brilho = brilho;
        System.out.println("O brilho da tela esta em "+this.brilho);
    }
}
