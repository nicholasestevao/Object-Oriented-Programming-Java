/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex4.lista2;

/**
 *
 * @author Nicho
 */
public class Ex4Lista2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Aeroporto origem1 = new Aeroporto("Belo Horizonte/Confins", 1000, "CNF");
        Aeroporto destino1 = new Aeroporto("Sao Paulo", 1500, "GUA");
        Aeroviario[] tripulacao = new Aeroviario[1];
        tripulacao[0] = new Aeroviario("Joao", "123456789");
        DataHora horario = new DataHora(0,0,0,0,0);
        VooNacional voo1 = new VooNacional("1", horario, origem1, destino1, 100, tripulacao);
        
        Passageiro nicholas = new Passageiro("Nicholas", "123456789");
        
        Operador op = new Operador();
        Reserva reserva1  = op.fazerReserva(voo1, nicholas);
        System.out.println(reserva1.getVoo().getNumAssentosLivres());
        System.out.println(reserva1.getPassageiro().getNome());
        
        Passageiro joao = new Passageiro("Joao", "123456789");
        Reserva reserva2  = op.fazerReserva(voo1, joao);
        System.out.println(reserva2.getVoo().getNumAssentosLivres());
        System.out.println(reserva2.getPassageiro().getNome());
        
        reserva1 = nicholas.cancelarReserva(op, reserva1);
        System.out.println(reserva1.getVoo().getNumAssentosLivres());
    }
    
}
