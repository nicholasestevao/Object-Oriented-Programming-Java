package vetordinamico;
import java.lang.ArrayIndexOutOfBoundsException;

public class MeuVetorDinamico {
    private int [] dados;
    private int tamanho;
    
    MeuVetorDinamico(int tamanho){
        dados = new int[tamanho];
        this.tamanho = tamanho;
        zerar();
    }
    
    public void setValor(int p, int v) throws ArrayIndexOutOfBoundsException{
        if(p< 0 || p>= tamanho){
            throw new ArrayIndexOutOfBoundsException("Indice invalido");
        }
        dados[p] = v;
        
    }
    
    public int getValor(int p) throws ArrayIndexOutOfBoundsException{
        if(p< 0 || p>= tamanho){
            throw new ArrayIndexOutOfBoundsException("Indice invalido");
        }
        return dados[p];
    }
    
    private void zerar(){
        for(int i=0; i<tamanho; i++){
            dados[i] = 0;
        }
    }
    
    public void preenche(){
        for(int i=0; i<tamanho; i++){
            dados[i] = i*100;
        }
    }
    
    public void imprime(){
        for(int i=0; i<tamanho; i++){
            if(i<tamanho -1){
                System.out.print(dados[i]+", ");
            }else{
                System.out.println(dados[i]);
            }            
        }
    }
}
