package ex2.lista1;

public class DispositivoRede extends Dispositivo{
    private int quantDadosEnviados;

    public void DispositivoRede(){
        this.quantDadosEnviados = 0;
    }

    public int enviaPacoteDados(int tamDados){
        this.quantDadosEnviados += tamDados;
        System.out.println("Dados enviados. Total: "+this.quantDadosEnviados);
        return this.quantDadosEnviados;
    }

}
