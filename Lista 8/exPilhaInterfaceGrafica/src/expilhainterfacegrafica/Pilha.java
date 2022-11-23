/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expilhainterfacegrafica;

import java.util.ArrayList;

/**
 *
 * @author 4812924
 */
public class Pilha {
    private ArrayList<String> dados;
    private int tamanho;
    private int topo;
    
    Pilha(int tamanho) {
        dados = new ArrayList();
        this.tamanho = tamanho;
        topo = -1;
    }
    
    public void push(String elemento) throws PilhaCheia {
        if (topo + 1 == tamanho)
            throw new PilhaCheia("A pilha esta cheia");
        topo++;
        dados.add(elemento);
    }
    
    public String pop() throws PilhaVazia {
        if (topo == -1)
            throw new PilhaVazia("A pilha esta vazia");
        topo--;
        return dados.remove(topo + 1);
    }
}
