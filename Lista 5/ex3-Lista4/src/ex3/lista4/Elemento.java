/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3.lista4;

/**
 *
 * @author isaac
 */
public class Elemento {
    private int num;
    private Elemento next;
    
    Elemento (int num, Elemento next) {
        this.num = num;
        this.next = next;
    }   
    
    Elemento (int num) {
        this.num = num;
        this.next = null;
    }
    
    public void setNext(Elemento next) {
        this.next = next;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    public Elemento getNext() {
           return this.next;
    }
    
   public int getValue() {
       return this.num;
   }
    
}
