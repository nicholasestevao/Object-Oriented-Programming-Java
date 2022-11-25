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
public class InvalidOperation extends Exception {
    InvalidOperation() { }
    
    InvalidOperation(String msg) { 
        super(msg);
    }
}
