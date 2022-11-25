/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caculadoragui;

/**
 *
 * @author isaac
 */
public class Calculadora {
    private double mem;
    
    Calculadora() {
        mem = 0.0;
    }
    
    public void addMem(double mem) {
        this.mem += mem;
    }
    
    public double add(double a, double b) {
        return (a + b);
    }
    
    public double divide(double a, double b) throws InvalidOperation {
        double result = 0.0;
        if(b == 0) {
             throw new InvalidOperation("Divide by zero.");
        } else {
            result = a/b;
        }
        return result;
    }
    
    public double getMem() {
        return mem;
    }
    
    public double multiply(double a, double b) {
        return (a * b);
    }
    
    public void setMem(double mem) {
        this.mem = mem;
    }
    
    public double subtract(double a, double b) {
        return (a - b);
    }
    
    public void subtractMem(double mem) {
        this.mem -= mem;
    }

    public void resettMem(double mem) {
        this.mem = 0.0;
    }
}
