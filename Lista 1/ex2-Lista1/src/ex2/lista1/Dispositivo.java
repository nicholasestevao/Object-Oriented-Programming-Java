
package ex2.lista1;

public class Dispositivo {
    private boolean ligado;
    private boolean status;
    
    public void Dispositivo(){
        this.ligado = false;
        this.status = false;
    }
    public void ligaDispositivo(){
        this.ligado = true;
        System.out.println("Dispositivo ligado.");
    }
    
    public boolean verificaStatus(){
        if(status){
            System.out.println("Dispositivo esta funcionando corretamente.");
        }else{
            System.out.println("Dispositivo nao esta funcionando");
        }
        return status;
    }
    public void executaTeste(){
        System.out.println("Executando teste ...");
        if(!verificaStatus()){
            this.ligado = false;
            System.out.println("Reiniciando dispositivo ...");
            ligaDispositivo();
            this.status = true;
            System.out.println("Dispositivo esta funcionando corretamente.");
        }
    }
}
