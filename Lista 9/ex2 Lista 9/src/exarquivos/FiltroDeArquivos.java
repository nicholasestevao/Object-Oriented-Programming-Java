
package exarquivos;

import java.io.File;
import java.io.FilenameFilter;

public class FiltroDeArquivos implements FilenameFilter {
    private String tipo;
    
    FiltroDeArquivos(String tipo){
        this.tipo = tipo;
    }

    @Override
    public boolean accept(File arquivo, String nome) {
        return arquivo.isFile() && nome.endsWith(this.tipo);
    }
    
    
}
