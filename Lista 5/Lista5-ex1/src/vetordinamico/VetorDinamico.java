package vetordinamico;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.ArrayIndexOutOfBoundsException;

public class VetorDinamico {

    public static void main(String[] args) {
        try{
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
            String linha = buffer.readLine();
            int tamanho = Integer.valueOf(linha);
            MeuVetorDinamico v = new MeuVetorDinamico(tamanho);
            v.imprime();
            v.preenche();
            v.setValor(-1, 55);
            v.imprime();
        }catch(IOException e){
            System.out.println("Erro ao ler do teclado: " +e.getMessage());
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Posicao invalida: " +e.getMessage());
        }
        
    }
    
}
