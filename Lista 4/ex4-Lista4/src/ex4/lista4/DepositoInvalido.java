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
public class DepositoInvalido extends ExcecaoContaCorrente {
    DepositoInvalido () {
    
    }
    
    DepositoInvalido(String msg) {
        super(msg);
    }
    
}
