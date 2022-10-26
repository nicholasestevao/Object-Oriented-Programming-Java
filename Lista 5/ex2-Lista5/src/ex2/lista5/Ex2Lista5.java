/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2.lista5;

/**
 *
 * @author isaac
 */
public class Ex2Lista5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MinhaMatrizDinamica mtrz = new MinhaMatrizDinamica(12,8);
        mtrz.getMatriz();
        mtrz.setInsereMatriz(3, 4, 8);
        mtrz.getMatriz();
        mtrz.setPreencheMatriz();
        mtrz.getMatriz();
    }
    
}
