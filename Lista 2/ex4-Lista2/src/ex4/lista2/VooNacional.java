package ex4.lista2;
import java.util.*;

/**
 * 
 */
public class VooNacional extends Voo {

    /**
     * Default constructor
     */
    public VooNacional(String codigo, DataHora dataHora, Aeroporto origem, Aeroporto destino, int numAssentosLivres, Aeroviario[] tripulacao) {
        super(codigo, dataHora, origem, destino, numAssentosLivres, tripulacao);
    }

}