/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expilhainterfacegrafica;

/**
 *
 * @author 4812924
 */
public class PilhaExcecao extends RuntimeException {
    PilhaExcecao() {
        
    }
    
    PilhaExcecao(String msg) {
        super(msg);
    }
}
