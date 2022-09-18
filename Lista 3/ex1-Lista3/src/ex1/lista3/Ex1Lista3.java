
package ex1.lista3;

public class Ex1Lista3 {
   public static void main(String args[]){ 
        
        Oficina o = new Oficina(); 
        Veiculo v; 
        
        for(int i=0;i<5;++i){ 
            v=o.proximo(); 
            o.manutencao(v); 
        } 
    } 
    
}
