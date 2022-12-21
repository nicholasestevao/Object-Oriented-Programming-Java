/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package executavel;

import java.util.ArrayList;

/**
 *
 * @author isaac
 */
public class TesteDeExecucao implements Executavel {
    
    ArrayList<Executavel> e;
    
    public TesteDeExecucao() {
        e = null;
    }
    
    public void setExecutavel(ArrayList<Executavel> e) {
        this.e= e;
    }

    @Override
    public void fazer() {
        if(e != null)
            e.forEach(item -> {item.fazer();});
    }
}
