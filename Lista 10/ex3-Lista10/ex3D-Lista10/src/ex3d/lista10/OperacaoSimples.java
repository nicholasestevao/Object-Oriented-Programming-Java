/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3d.lista10;

/**
 *
 * @author isaac
 */
public class OperacaoSimples implements Runnable {
      private final double quant;
      
      public OperacaoSimples(double quant) {
          this.quant = quant;
      }
    
    @Override
    public void run() {
        int count = 0;
         for (int j = 0; j < quant; j++) {
           count++;
         }
    }
}
