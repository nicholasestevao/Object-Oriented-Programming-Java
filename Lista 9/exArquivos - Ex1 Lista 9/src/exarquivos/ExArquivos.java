
package exarquivos;
import java.io.File;
import java.io.IOException;

public class ExArquivos {

    public static void listaArquivos(String caminho){
        File origem = new File(caminho);
        if(origem.isDirectory()){//verifica se eh um diretorio
            File [] conteudos = origem.listFiles(); //lista todo o conteudo do diretorio
            if(conteudos != null){ //se ha conteudo
                for(File conteudo:conteudos){ // para cada conteudo em conteudos
                    if(conteudo.isFile()){ //se for um arquivo
                        System.out.println(conteudo.getName());
                    }else{//se for um diretorio
                        try{
                            listaArquivos(conteudo.getCanonicalPath());
                        }catch(IOException e){
                            System.out.println("Erro no Canonical Path: "+e.getMessage());
                        }
                    }
                }
            }
        }
    }
    
    public static void main(String[] args) {
        listaArquivos("C:\\Windows\\");
    }
    
}
