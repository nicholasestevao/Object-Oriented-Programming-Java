package ex4.lista4;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author isaac
 */
public class ContaCorrente {
    private double saldo;
    private double creditoLimite;
    
    ContaCorrente (double creditoLimite) {
        this.saldo = 0;
        this.creditoLimite = creditoLimite;
    }
    
    public void deposito(double deposito) throws DepositoInvalido {
        if(deposito < 0) {
            throw new DepositoInvalido("Deposito negativo.");
        } else if (deposito == 0) {
            throw new DepositoInvalido("Deposito nulo.");
        }else {
            saldo += deposito;
            System.out.println("Novo saldo R$: " + saldo);
        }
    }
    
    public void saque(double saque) throws SaqueInvalido {
        if (saque > (saldo + creditoLimite)) {
            throw new SaqueInvalido("Saldo não disponível.");
        } else {
            saldo -= saque;
            System.out.println("Novo saldo R$: " + saldo);
        }
    }
}
