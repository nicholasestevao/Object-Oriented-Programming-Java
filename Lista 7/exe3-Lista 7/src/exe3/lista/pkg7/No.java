package exe3.lista.pkg7;

/**
 *
 * @author isaac
 * @param <T>
 */
public class No<T extends Comparable> implements Comparable<No<T>> {
    private T dado;
    private No<T> filho_direita;
    private No<T> filho_esquerda;
    
    No(T dado) {
        this.dado = dado;
    }
        
            
    public T getDado() {
        return dado;
    }
    
    public No<T> getFilhoDireita() {
        return filho_direita;
    }

    public No<T> getFilhoEsquerda() {
         return filho_esquerda;
    }
    
    public void setDado(T dado) {
        this.dado = dado;
    }

    public void setFilhoDireita(No<T> dado) {
         filho_direita = dado;
    }
        
    public void setFilhoEsquerda(No<T> dado) {
         filho_esquerda = dado;
    }
    
    @Override
    public int compareTo(No<T> o) {
        if(this.dado.compareTo(o.getDado()) > 0) {
            return 1;
        } else if(this.dado.compareTo(o.getDado()) < 0) {
            return -1;
        }
        return 0;
    }
}