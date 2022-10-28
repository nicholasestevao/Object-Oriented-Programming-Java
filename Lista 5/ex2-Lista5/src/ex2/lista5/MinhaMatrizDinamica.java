/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2.lista5;

public class MinhaMatrizDinamica {
    private int matriz[][];

    MinhaMatrizDinamica(int numLinhas, int numColunas){
        matriz = new int [numLinhas][numColunas];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = 0;
            }
        }
    }

    public void getMatriz() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }

    public void setInsereMatriz(int numLinhas, int numColunas, int numInsere){
        matriz[numLinhas][numColunas] = numInsere;
    }

    public void setPreencheMatriz(){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (i + j);
            }
        }
    }
}
