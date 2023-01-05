/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex4.lista4;

/**
 *
 * @author isaac
 */
public class Ex4Lista4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ContaCorrente c = new ContaCorrente(1800);
       
       try {
           c.deposito(5000);
           c.saque(3500);
       } catch (ExcecaoContaCorrente e) {
           System.out.println("Erro: " +  e.getMessage());
       }
    }
    
}
