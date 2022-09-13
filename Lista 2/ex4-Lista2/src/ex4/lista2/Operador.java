package ex4.lista2;
import java.util.*;

public class Operador {

    public Operador( ) {
    }

    public Reserva fazerReserva(Voo voo, Passageiro passageiro) {
        Reserva rs = new Reserva(voo, passageiro);
        return rs;
    }
    
    public Reserva cancelarReserva(Reserva reserva) {
        int numAssentos = reserva.getVoo().getNumAssentosLivres();
        reserva.getVoo().setNumAssentosLivres(numAssentos + 1);
        reserva = new Reserva();
        System.out.println("Reserva cancelada");
        return reserva;
    }

}