package ex4.lista2;
import java.util.*;

/**
 * 
 */
public class Passageiro {

    /**
     * Default constructor
     */
    public Passageiro() {
    }

    public Passageiro(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    /**
     * 
     */
    private String nome;

    /**
     * 
     */
    private String cpf;

    /**
     * @param Operador operador 
     * @param String origem 
     * @param String destino 
     * @param DataHora dataHora
     */
    public Reserva pedirReserva( Operador operador,  Voo voo) {
        return operador.fazerReserva(voo, this);
    }

    /**
     * @param Operador operador
     */
    public Reserva cancelarReserva( Operador operador, Reserva reserva) {
        return operador.cancelarReserva(reserva);
    }

    /**
     * @param Operador operador 
     * @param Reserva reserva
     */
    public Reserva pagarReserva( Operador operador,  Reserva reserva) {
        // TODO implement here
        return reserva;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
}