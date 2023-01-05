
package ex1.lista1;

public class Celular {
    private String IMEI;
    
    private Processador processador;
    private Tela tela;
    private SistemaSom sistemaSom;
    private SistemaComunicacao sistemaComunicacao;
    
    public Celular(String IMEI, String modeloProcessador, String modeloTela, String modeloSisSom, String modeloSisCom){
        this.IMEI = IMEI;
        processador = new Processador(modeloProcessador, 1000000);
        tela = new Tela(modeloTela, false, 300);
        sistemaSom = new SistemaSom(modeloSisSom, false, 50);
        sistemaComunicacao = new SistemaComunicacao(modeloSisCom, true, false);
    }
    
    public void mostra(){
        System.out.println("Celular:");
        System.out.println("    IMEI: "+IMEI);
        processador.mostra();
        tela.mostra();
        sistemaSom.mostra();
        sistemaComunicacao.mostra();
    }
    
    private void alterarIMEI(String IMEI){
        this.IMEI = IMEI;
        System.out.println("IMEI alterado");
    } 
    
    public void restaurar(String novoIMEI){        
        processador = new Processador(processador.getModelo(), 1000000);
        tela = new Tela(tela.getModelo(), false, 300);
        sistemaSom = new SistemaSom(sistemaSom.getModelo(), false, 50);
        sistemaComunicacao = new SistemaComunicacao(sistemaComunicacao.getModelo(), true, false);
        
        alterarIMEI(novoIMEI);
    }
    
    public void overclock(int newClock){
        processador.overclock(newClock);
    }
    
    public void setBrilho(int brilho){
        tela.setBrilho(brilho);
    }
    
    public void setVolume(int volume, boolean dolbyAtmosCompatible){
        sistemaSom.setVolume(volume, dolbyAtmosCompatible);
    }
    
    public void ligarAntena(boolean stateAntena, boolean cobertura5G){
        sistemaComunicacao.ligarAntena(stateAntena, cobertura5G);
    }
}
