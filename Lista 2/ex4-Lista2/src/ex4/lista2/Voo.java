package ex4.lista2;
import java.util.*;

public class Voo {

    public Voo() {
        this.codigo = "";
        this.dataHora = new DataHora(0,0,0,0,0);
        this.origem = new Aeroporto("", 0, "");
        this.destino = new Aeroporto("", 0, "");
        this.numAssentosLivres = 0;
        this.tripulacao = new Aeroviario[1];
        this.tripulacao[0] = new Aeroviario();
        
    }

    public Voo(String codigo, DataHora dataHora, Aeroporto origem, Aeroporto destino, int numAssentosLivres, Aeroviario[] tripulacao) {
        this.codigo = codigo;
        this.dataHora = dataHora;
        this.origem = origem;
        this.destino = destino;
        this.numAssentosLivres = numAssentosLivres;
        this.tripulacao = tripulacao;
    }

    public void decNumAssentosLivres() {
        if(this.numAssentosLivres != 0){
            this.numAssentosLivres--;
        }
    }
    

    private String codigo;
    private DataHora dataHora;
    private Aeroporto origem;
    private Aeroporto destino;
    private int numAssentosLivres;
    private Aeroviario tripulacao[];

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public DataHora getDataHora() {
        return dataHora;
    }

    public void setDataHora(DataHora dataHora) {
        this.dataHora = dataHora;
    }

    public Aeroporto getOrigem() {
        return origem;
    }

    public void setOrigem(Aeroporto origem) {
        this.origem = origem;
    }

    public Aeroporto getDestino() {
        return destino;
    }

    public void setDestino(Aeroporto destino) {
        this.destino = destino;
    }

    public int getNumAssentosLivres() {
        return numAssentosLivres;
    }

    public void setNumAssentosLivres(int numAssentosLivres) {
        this.numAssentosLivres = numAssentosLivres;
    }

    public Aeroviario[] getTripulacao() {
        return tripulacao;
    }

    public void setTripulacao(Aeroviario[] tripulacao) {
        this.tripulacao = tripulacao;
    }
    

}