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
public class Photo {
    private String path;
    private Data data;
    
    Photo (String path, Data data) {
        this.path = path;
        this.data = data;
    }
    
    public String getPath() {
        return path;
    }
    
    public Data getData() {
        return data;
    }
   
}
