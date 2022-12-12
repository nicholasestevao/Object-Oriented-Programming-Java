/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3c.lista10;

import java.util.Random;

/**
 *
 * @author isaac
 */
public class RadomSqrt implements Runnable {
      private final double quant;
      private Random r;
      
      public RadomSqrt(double quant) {
          this.quant = quant;
          this.r = new Random();
      }
    
    @Override
    public void run() {
         for (int j = 0; j < quant; j++) {
            double number = r.nextInt() * r.nextDouble();
            Math.sqrt(number);
         }
    }
}
