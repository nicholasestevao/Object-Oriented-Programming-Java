/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3.lista5;

/**
 *
 * @author isaac
 */
public class MinhaListaEncadeada {
    private Elemento elem;
    
    MinhaListaEncadeada () {
        elem = null;
    }
    
    public void insertItem(int num) {
        if(elem == null) {
            this.elem = new Elemento(num);
        } else {
            Elemento  actual = this.elem;
            Elemento next = this.elem.getNext();
            while(next != null) {
                actual = next;
                next = actual.getNext();
            }
            actual.setNext(new Elemento(num));
         } 
    }
    
    public void imprimeLista() {
           if(elem == null) {
               System.out.println("Lista Vazia");
           } else {
                int i = 1;
                Elemento aux  = this.elem;
                while(aux  != null) {
                    System.out.println("Item Lista n°: " + i  + ", valor: "  + aux.getValue());
                    aux = aux.getNext();
                    i++;
                }
           }     
    }
    
    void removeItem(int num) {
        if(elem == null) {
            System.out.println("Lista Vazia");
        } else { 
            Elemento back = this.elem;
            Elemento  actual = this.elem;
            int actual_num = actual.getValue();
            Elemento next = this.elem.getNext();
            while((next != null) && (actual_num) != num) {
                back = actual;
                actual = next;
                actual_num = actual.getValue();
                next = actual.getNext();
            }
            if(actual_num == num) {
                if(actual == this.elem) {
                    this.elem = null;
                } else {
                    back.setNext(next);
                }
            } else {
                System.out.println("Item não existente.");
            }
         } 
    }
}