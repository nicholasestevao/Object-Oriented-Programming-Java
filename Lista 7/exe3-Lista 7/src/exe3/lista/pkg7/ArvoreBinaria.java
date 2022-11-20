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
    
    private class No<T extends Comparable> {
        private T dado;
        private No<T> filho_direita;
        private No<T> filho_esquerda;

        No(T dado) {
            this.dado = dado;
            filho_direita = null;
            filho_esquerda = null;
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

        public void setNo(No<T> no) {
            this.dado = no.getDado();
            this.filho_direita = no.getFilhoDireita();
            this.filho_esquerda = no.getFilhoEsquerda();
        }

        public void removeFilhoDireita() {
            filho_direita = null;
        }

        public void removeFilhoEsquerda() {
            filho_esquerda = null;
        }
    }
    
    private No<T> root;
    
    ArvoreBinaria() {
        root = null;
    }
    
    public boolean buscaDado(T dado) {
        boolean _return = false;
        if(root != null) {
            _return = this.buscaDado(root, dado);
        }
        return _return;
    }
    
    private boolean buscaDado(No<T>raiz, T dado) {
        boolean _return = false;
        if(raiz != null) {
            if(dado.compareTo(raiz.getDado()) > 0) {
                _return = this.buscaDado(raiz.getFilhoDireita(), dado);
            } else if(dado.compareTo(raiz.getDado()) < 0) {
                _return = this.buscaDado(raiz.getFilhoEsquerda(), dado);
            } else {
                return true;
            }
        }
        return _return;
    }
    
    public No<T> encontraMinimo() {
        No<T> _return = null;
        if(root != null) {
            _return = this.encontraMinimo(root);
        }
        return null;
    }
    
    private No<T> encontraMinimo(No<T>raiz) {
        No<T> _return = null;  
        if(raiz.getFilhoEsquerda() != null) {
           _return = this.encontraMinimo(raiz.getFilhoEsquerda());
        } else {
            _return = raiz;
        }
        return _return;
    }
    
    public void imprimeOrdenado() {
        if(root != null) {
            this.imprimeOrdenado(root);
        }
    }
    
    private void imprimeOrdenado(No<T> raiz) {
        if(raiz.getFilhoEsquerda() != null) {
            this.imprimeOrdenado(raiz.getFilhoEsquerda());
        }
        System.out.println(raiz.getDado());
        if(raiz.getFilhoDireita() != null) {
            this.imprimeOrdenado(raiz.getFilhoDireita());
        }
    }

    public void insere(T dado) {
        if(root == null) {
            root = new No<T>(dado);
        } else {
            this.insere(root, dado);
        }
    }
    
    private void insere(No<T> raiz, T dado) {
        if(dado.compareTo(raiz.getDado()) > 0) {
            if(raiz.getFilhoDireita() != null) {
                this.insere(raiz.getFilhoDireita(), dado);
            } else {
                raiz.setFilhoDireita(new No<T>(dado));
            }
        } else  if(dado.compareTo(raiz.getDado()) < 0) {
            if(raiz.getFilhoEsquerda() != null) {
                this.insere(raiz.getFilhoEsquerda(), dado);
            } else {
                raiz.setFilhoEsquerda(new No<T>(dado));
            }
        }
    }
        
    public void removeDado(T dado) {
        if(root != null) {
            this.removeDado(root, dado);
        }
    }
    
    private boolean removeDado(No<T> raiz, T dado) {
         if (raiz.getDado().compareTo(dado) == 0) {
            System.out.println("To aqui");
            if(raiz.getFilhoDireita() != null && raiz.getFilhoEsquerda() != null) {
                raiz.setDado(this.encontraMinimo(raiz.getFilhoDireita()).getDado());
                raiz.setFilhoDireita( this.removeMinimo(raiz.getFilhoDireita()));
            } else if(raiz.getFilhoDireita() != null) {
                raiz.setNo(raiz.getFilhoDireita());
            } else if(raiz.getFilhoEsquerda() != null) {
                raiz.setNo(raiz.getFilhoEsquerda());
            } else {
                return true;
            }
        } else if(raiz.getDado().compareTo(dado) > 0) {
            System.out.println("to maior que: " + dado);
            if(raiz.getFilhoDireita() != null) {
                if(this.removeDado(raiz.getFilhoEsquerda(), dado)) {
                    raiz.removeFilhoEsquerda();
                }
            }
        } else if(raiz.getDado().compareTo(dado) < 0) {
            if(raiz.getFilhoEsquerda() != null) {
                System.out.println("to menor");
                if(this.removeDado(raiz.getFilhoDireita(), dado)){
                    raiz.removeFilhoDireita();
                }
            } 
        }
         
         return false;
    }

    private  No<T> removeMinimo(No<T> raiz) {
        No<T> _return = null;
        if(root != null) {
            if(raiz.getFilhoEsquerda() != null) {
                _return = this.removeMinimo(raiz.getFilhoEsquerda());
            } else {
                _return = raiz.getFilhoDireita();
            }
        }
        return _return;
    }
}
