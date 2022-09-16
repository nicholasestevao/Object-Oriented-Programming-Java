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
public class Data {
    private int day;
    private int month;
    private int year;
    
    Data (int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    public String showData() {
        String day, month, year;
        
        if (this.day < 10)  {
            day = "0" + String.valueOf(this.day); 
        } else {
            day = String.valueOf(this.day) ;         
        }
        
        if (this.month < 10)  {
            month = "0" + String.valueOf(this.month); 
        } else {
            month = String.valueOf(this.month) ;         
        }
       
        if (this.year < 10)  {
            year = "0" + String.valueOf(this.year); 
        } else {
            year = String.valueOf(this.year) ;         
        }
        
        return day + "/" + month + "/" + year; 
    }
    
   public int getDay() {
       return day;
    }
   
   public int getMonth() {
       return month;
    }
   
   public int getYear() {
       return year;
    }
}
