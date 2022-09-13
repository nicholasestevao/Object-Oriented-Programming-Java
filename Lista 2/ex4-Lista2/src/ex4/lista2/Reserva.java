package ex4.lista2;
import java.util.*;

/**
 * 
 */
public class Reserva {

    private Voo voo;
    private Passageiro passageiro;
    /**
     * Default constructor
     */
    public Reserva() {
        this.voo = new Voo();
        this.passageiro = new Passageiro("", "");
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    public Reserva(Voo voo, Passageiro passageiro) {
        voo.decNumAssentosLivres();
        this.voo = voo;       
        this.passageiro = passageiro;
    }

}