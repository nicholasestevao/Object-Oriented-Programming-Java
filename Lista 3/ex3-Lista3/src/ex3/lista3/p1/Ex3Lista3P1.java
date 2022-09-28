/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3.lista3.p1;

import java.util.ArrayList;

/**
 *
 * @author isaac
 */
public class Ex3Lista3P1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double pegada_carbono = (0.0);
        
        Predio p1 = new Predio(0);
        Predio p2 = new Predio(0.5);

        Bicicleta b1 = new Bicicleta(7, 3);
        Bicicleta b2 = new Bicicleta(7, 2);
        Carro c1 = new Carro("gasolina");
        Carro c2 = new Carro("etanol");
        ArrayList<PegadaDeCarbono> pc = new ArrayList();
        
        pc.add(p1);
        pc.add(p2);
        pc.add(b1);
        pc.add(b2);
        pc.add(c1);
        pc.add(c2);
        
        p1.consomeEnergia(10000.648);
        p1.consomeEnergia(50489.455);
        b1.andar(10.77);
        b2.andar(66.8);
        c1.consomeCombustivel(100.8);
        c2.consomeCombustivel(358.5);
        
        
        for(int i = 0; i< pc.size(); i++){
            pegada_carbono += pc.get(i).getPegadaDeCarbono();
        }
        
        System.out.println("Pegada de Carbono: " + pegada_carbono + " kgCO2eq");
        
    }
    
}
