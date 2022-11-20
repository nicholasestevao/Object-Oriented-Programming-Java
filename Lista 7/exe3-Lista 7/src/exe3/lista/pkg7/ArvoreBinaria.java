/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe3.lista.pkg7;

/**
 *
 * @author isaac
 * @param <T>
 */
public class ArvoreBinaria<T extends Comparable> {
    private T dado;
    private ArvoreBinaria<T> filho_esquerda;
    private ArvoreBinaria<T>  filho_direita;
    
    ArvoreBinaria(T dado) {
        this.dado = dado;
        this.filho_esquerda = null;
        this.filho_direita = null;
    }
    
    public boolean buscaDado(T dado) {
       boolean return_busca = false;
       if(this.dado.compareTo(dado) == 0) {
        return_busca = true;
       } else if(this.dado.compareTo(dado) < 0) {
            if(this.getFilhoEsquerda() != null) {
                return_busca = this.getFilhoEsquerda().buscaDado(dado);
            }
        } else if(this.dado.compareTo(dado) > 0) {
            if(this.getFilhoDireita() != null) {
                return_busca = this.getFilhoDireita().buscaDado(dado);
            }
        }
        
        return return_busca;
    }
    
    public void imprimeOrdenado() {
        if(this.getFilhoEsquerda() != null) {
            this.getFilhoEsquerda().imprimeOrdenado();
         }  
         
        System.out.println(this.getDado()); 
        
         if( this.getFilhoDireita() != null) {
            this.getFilhoDireita().imprimeOrdenado();
         }
    }
    
    public void insercao(T dado) {
        if(this.dado.compareTo(dado) < 0) {
            if(this.getFilhoEsquerda() != null) {
                this.getFilhoEsquerda().insercao(dado);
            } else {
                this.setFilhoEsquerda(dado);
            }
        } else if(this.dado.compareTo(dado) > 0) {
            if(this.getFilhoDireita() != null) {
                this.getFilhoDireita().insercao(dado);
            } else {
                this.setFilhoDireita(dado);
            }
        }
    }
    
    public T getDado() {
        return this.dado;
    }
    
    public ArvoreBinaria<T> getFilhoDireita() {
        return this.filho_direita;
    }
    
    public ArvoreBinaria<T> getFilhoEsquerda() {
        return this.filho_esquerda;
    }
    
    public void setFilhoDireita(T dado) {
        this.filho_direita = new ArvoreBinaria<>(dado);
    }
    
    public void setFilhoEsquerda(T dado) {
        this.filho_esquerda = new ArvoreBinaria<>(dado);
    }
    
    public void removeDado(T dado) {
      ArvoreBinaria<T> aux = null;
      if(this.dado.compareTo(dado) < 0) {
            if(this.getFilhoEsquerda() != null) {
                if(this.getFilhoEsquerda().getDado().compareTo(dado) == 0) {
                    this.removeFilhoEsquerda();
                } else {
                    this.getFilhoEsquerda().removeDado(dado);
                }
            }
        } else if(this.dado.compareTo(dado) > 0) {
            if(this.getFilhoDireita() != null) {
                if(this.getFilhoDireita().getDado().compareTo(dado) == 0) {
                    this.removeFilhoDireita();
                } else {
                    this.getFilhoDireita().removeDado(dado);
                }
            }
        }
    }
    
    public void removeFilhoDireita() {
        if(filho_direita.getFilhoEsquerda() == null && filho_direita.getFilhoDireita() == null) {
            filho_direita = null;
        } else if (filho_direita.getFilhoEsquerda() == null) {
            filho_direita = filho_direita.getFilhoDireita();
        } else if (filho_direita.getFilhoDireita() == null) {
            filho_direita = filho_direita.getFilhoEsquerda();
        } else {
            
        }
    }
    
    public void removeFilhoEsquerda() {
        this.filho_esquerda = null;
    }
    
    public ArvoreBinaria<T> removeMaior() {
        return this.removeMaior(this);
    }
    
    private ArvoreBinaria<T> removeMaior(ArvoreBinaria<T> no) {
        ArvoreBinaria<T> aux = null;
        
        if(no.getFilhoDireita() != null) {
           aux = no.getFilhoDireita().removeMaior();
        } else {
            aux = no;
            if(no.getFilhoEsquerda() != null) {
                no = no.getFilhoEsquerda();
            } else {
                no = null;
            }
        }
        
        return aux;        
    }
    
    public ArvoreBinaria<T> removeMenor() {
        ArvoreBinaria<T> aux = null;
        
        
        
        return aux;    
    }
    
    
}
