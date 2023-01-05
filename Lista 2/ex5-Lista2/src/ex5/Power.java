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
class Power extends Operation {
       
    Power(User user, Data data) {
        super(user, data, "Power");
    }
    
    @Override
    public void calculate(double a, double b) {
       putResult(Math.pow(a, b));
       showResult();
    } 
    
    @Override
    public void calculate(double num) {
        
    }
}
