
package ex4.lista7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.lang.Math;

public class Aleatoriamente {
    private ArrayList<Double> aleatoriosAL = new ArrayList<>();
    private LinkedList<Double> aleatoriosLL = new LinkedList<>();
    private long tempoInicial;
    private long tempoFinal;
    private int cemporcento;
    private Double tempo;
    //private int dezporcento;

    Aleatoriamente(int cemporcento){
        this.cemporcento = cemporcento;
        //dezporcento = ((int) (this.cemporcento * 0.5));
        Double ramDouble;
        for (int i = 0; i < cemporcento; i++) {
            ramDouble = (Math.random());
            aleatoriosAL.add(ramDouble);
            aleatoriosLL.add(ramDouble);
        }
    }

    public void getListaAL(int indices){
        tempoInicial = (System.currentTimeMillis());
        for (int i = 0; i < indices; i++) {
            aleatoriosAL.get((int) ((Math.random()) * cemporcento));
        }
        tempoFinal = (System.currentTimeMillis());
        tempo = (1.0)*(tempoFinal - tempoInicial);
        //double y;
        System.out.printf("Tempo de leitura Array List: %.5f minutos\n", (tempo/60000));
    }

    public void atualizaListaAL(int indices){
        tempoInicial = (System.currentTimeMillis());
        for (int i = 0; i < indices; i++) {
            aleatoriosAL.remove((int) ((Math.random()) * cemporcento));
            aleatoriosAL.add(Math.random());
        }
        tempoFinal = (System.currentTimeMillis());
        tempo = (1.0)*(tempoFinal - tempoInicial);
        System.out.printf("Tempo de Remoçao e escrita Array List: %.5f minutos\n", (tempo/60000));
    }

    public void getListaLL(int indices){
        tempoInicial = (System.currentTimeMillis());
        for (int i = 0; i < indices; i++) {
            aleatoriosLL.get((int) ((Math.random()) * cemporcento));
        }
        tempoFinal = (System.currentTimeMillis());
        tempo = (1.0)*(tempoFinal - tempoInicial);
        System.out.printf("Tempo de leitura Linked List: %.5f minutos\n", (tempo/60000));
    }
    
    public void atualizaListaLL(int indices){
        tempoInicial = (System.currentTimeMillis());
        for (int i = 0; i < indices; i++) {
            aleatoriosLL.remove((int) ((Math.random()) * cemporcento));
            aleatoriosLL.add(Math.random());
        }
        tempoFinal = (System.currentTimeMillis());
        tempo = (1.0)*(tempoFinal - tempoInicial);
        System.out.printf("Tempo de Remoçao e escrita Linked List: %.5f minutos\n", (tempo/60000));
    }
}

