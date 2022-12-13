/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3e.lista10;

import java.util.Random;

/**
 *
 * @author isaac
 */
public class OperacaoComplexa implements Runnable {
      private final double quant;
      private final Random r;
      
      public OperacaoComplexa(double quant) {
          this.quant = quant;
          this.r = new Random();
      }
    
    @Override
    public void run() {
         for (int j = 0; j < quant; j++) {
           double restult = Math.sqrt(r.nextDouble()) + Math.pow(r.nextDouble(), r.nextInt()) + Math.cos(r.nextDouble());
         }
    }
}
