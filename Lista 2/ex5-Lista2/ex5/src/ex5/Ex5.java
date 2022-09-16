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
public class Ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Sum s = new Sum (new User("Isaac Soares", 21, new Photo("C:/Users/isaac/OneDrive/Documentos/_My_Projects/Listas-ProgOrienObjetos/Lista 2/ex5-Lista2/ex5/photo.png", new Data(14,9,22))), new Data(14,9,22));
       s.calculate(7, 3);
    }
    
}