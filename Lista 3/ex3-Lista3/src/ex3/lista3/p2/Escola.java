/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3.lista3.p2;

/**
 *
 * @author isaac
 */
public class Escola extends Predio {
    Escola(double porcentagem_energia_limpa) {
        super(porcentagem_energia_limpa);
    }

    public void consomeEnergia (double consumo_energia) {
        this.setConsumoEnergia(this.getConsumoEnergia() + consumo_energia);
    }

}
