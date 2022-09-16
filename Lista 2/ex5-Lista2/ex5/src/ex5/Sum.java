/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex5;

/**
 *
 * @author isaac
 */
 class Sum extends Operation {
               
    Sum(User user, Data data) {
        super(user, data, "Sum");
    }
    
    @Override
    public void calculate(double a, double b) {
       putResult(a + b);
       showResult();
    } 
    
    @Override
    public void calculate(double num) {
        
    }
}
