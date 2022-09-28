/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3.lista3.p3;


/**
 *
 * @author isaac
 */
public class Carro implements PegadaDeCarbono {
    private boolean motor;
    private String tipo_combustivel;
    private double quantCombustivelConsumido;
    private int marcha;
    
    Carro (String tipo_combustivel) {
        this.motor = false;
        this.tipo_combustivel = tipo_combustivel;
        this.marcha = 0;
        this.quantCombustivelConsumido = 0;
    }
    
    public boolean getEstadoMotor() {
        return motor;
    }

    public void ligaDesligaCarro(boolean liga_desliga) {
        this.motor = liga_desliga;
    }

    public int getMarcha() {
        return marcha;
    }

    public void trocaMarcha(int marcha) {
        if(marcha > -2 && marcha < 7) {
            this.marcha = marcha;
        } 
    }
    
    public void consomeCombustivel(double quantCombustivelConsumido) {
        this.quantCombustivelConsumido += quantCombustivelConsumido; 
    }   
    
    @Override
     public double getPegadaDeCarbono(){
         if(tipo_combustivel.equals("gasolina")) {
             return (double) (2.3 * quantCombustivelConsumido);
         } else { // etanol
             return (double) (0.32 * quantCombustivelConsumido);
         }
     }
     
}
