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
abstract class Operation {
    private User user;
    private Data data;
    private String type;
    private double result;
    
    Operation(User user, Data data, String type) {
        this.user = user;
        this.data = data;
        this.type = type;
        this.result = 0;
    }
    
    public User getUser() {
        return user;
    }
    
    public Data getData() {
        return data;
    }
    
    public double getResult() {
        return result;
    }
    
    public void putResult(double result) {
        this.result = result;
    }
    
    public void showResult() {
       System.out.println("/----------USER-----------\\");
        user.showUser();
        System.out.println("/--------------------------\\");
        System.out.println();
        System.out.println("Data of operation: " + data.showData());
        System.out.println("Type of operation: " + type);
        System.out.println("Result of operation: " + result);
    }
    
    public abstract void calculate(double num);
    public abstract void calculate(double a, double b);
}
