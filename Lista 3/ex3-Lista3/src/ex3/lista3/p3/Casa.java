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
public class Casa implements PegadaDeCarbono {
    private double consumo_energia;
    private double porcentagem_energia_limpa;
    
    Casa(double porcentagem_energia_limpa) {
       this.consumo_energia = 0;
       this.porcentagem_energia_limpa = porcentagem_energia_limpa;
    }
    
    public void consomeEnergia(double cosumo_energia) {
        this.consumo_energia += consumo_energia;
    }
    
    @Override
    public double getPegadaDeCarbono(){
        return ((1-porcentagem_energia_limpa) * consumo_energia * 100);
    }
}
