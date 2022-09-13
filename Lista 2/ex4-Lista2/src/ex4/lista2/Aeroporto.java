package ex4.lista2;
import java.util.*;

/**
 * 
 */
public class Aeroporto {

    /**
     * Default constructor
     */
    public Aeroporto() {
    }

    public Aeroporto(String cidade, int capacidade, String nome) {
        this.cidade = cidade;
        this.capacidade = capacidade;
        this.nome = nome;
    }

    /**
     * 
     */
    private String cidade;

    /**
     * 
     */
    private int capacidade;

    /**
     * 
     */
    private String nome;

}