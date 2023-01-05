/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex5;

import java.lang.Math;
/**
 *
 * @author isaac
 */
class SquareRoot  extends Operation {
    
    SquareRoot(User user, Data data) {
        super(user, data, "Square Root");
    }
    
    @Override
    public void calculate(double num) {
       putResult(Math.sqrt(num));
       showResult();
    }
    
    @Override
    public void calculate(double a, double b) {
       
    }
}
