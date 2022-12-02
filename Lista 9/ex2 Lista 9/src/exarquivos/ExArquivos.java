
package exarquivos;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ExArquivos {

    public static void listaArquivos(String caminho, String tipo){
        File origem = new File(caminho);
        FiltroDeArquivos filtro = new FiltroDeArquivos(tipo);
        if(origem.isDirectory()){//verifica se eh um diretorio
            File [] conteudos = origem.listFiles(); //lista todo o conteudo do diretorio
            if(conteudos != null){ //se ha conteudo
                for(File conteudo:conteudos){ // para cada conteudo em conteudos
                    if(filtro.accept(conteudo, conteudo.getName())){ //se for um arquivo
                        System.out.println(conteudo.getName());
                    }else{//se for um diretorio
                        try{
                            listaArquivos(conteudo.getCanonicalPath(), tipo);
                        }catch(IOException e){
                            System.out.println("Erro no Canonical Path: "+e.getMessage());
                        }
                    }
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o diretório: ");
        String diretorio = s.nextLine();
        listaArquivos(diretorio, ".exe");
    }
    
}
