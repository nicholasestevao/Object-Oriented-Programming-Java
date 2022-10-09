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
public class Ex3Lista4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MinhaListaEncadeada lista = new MinhaListaEncadeada();
        
        lista.insertItem(0);
        lista.insertItem(1);
        lista.insertItem(2);
        lista.insertItem(3);
        lista.insertItem(4);
        
        lista.imprimeLista();
        
        lista.removeItem(2);
        
        System.out.println(" ");
        
        lista.imprimeLista();
        
        System.out.println(" ");
        
        lista.removeItem(1);
        
        System.out.println(" ");
        
        lista.imprimeLista();
        
        System.out.println(" ");
        
        lista.removeItem(3);
        
        System.out.println(" ");
        
        lista.imprimeLista();
        
        System.out.println(" ");
        
        lista.removeItem(2);
        
        System.out.println(" ");
        
        lista.imprimeLista();
        
        System.out.println(" ");
        
        lista.removeItem(4);
        
        System.out.println(" ");
        
        lista.imprimeLista();
        
        System.out.println(" ");
        
        lista.removeItem(0);
        
        System.out.println(" ");
        
        lista.imprimeLista();
    }
    
}
