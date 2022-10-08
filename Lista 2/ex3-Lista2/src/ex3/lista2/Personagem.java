package ex3.lista2;
import java.util.*;
import java.lang.Math;

public class Personagem {
    private String nome;
    private int vida;
    private ArrayList<Superpoder> poderes;

    public Personagem(String nome, int vida) {
        this.poderes = new ArrayList<Superpoder>();
        this.nome = nome;
        this.vida = vida;
    }    
    
    public String getNome(){
        return this.nome;
    }
    public void setNome(String pnome){
        this.nome = pnome;
    }
    public int getTotalPoder(){
        int tam = poderes.size();
        int totalPoder = 0;
        for(int i=0; i<tam; i++){
            totalPoder += Math.abs(poderes.get(i).getCategoria());
        }
        return totalPoder;
    }
    public int getVida(){
        return this.vida;
    }
    public void setVida(int vida){
        this.vida = vida;
    }
    public void addSuperPoder(Superpoder poder){
        poderes.add(poder);
    }
    
    public Superpoder getSuperPoder(int i){
        return poderes.get(i);
    }
    
    public void atacar(int intensidadeAtaque, String nomePoder, Personagem vitima){
        boolean achou = false;
        int numPoder = 0;
        for(int i=0; i<this.poderes.size(); i++){
            if(this.poderes.get(i).getNome().equals(nomePoder)){
                numPoder  = i;
                achou = true;
            }
        }
        if(!achou){
            System.out.println("Poder nao existe");
            return;
        }else{
            Superpoder poder = this.poderes.get(numPoder);
            double probabilidade = Math.random();
            if(probabilidade > 0.5){
                if(poder.getCategoria()>0){
                    this.setVida(this.getVida() + poder.getCategoria()*intensidadeAtaque);
                    System.out.println(this.getNome() +" usou "+poder.getNome()+" para regenerar sua vida");
                    System.out.println(this.getNome()+" esta com "+this.getVida()+" de vida.");
                }else{
                    double vida = vitima.getVida() + poder.getCategoria()*intensidadeAtaque;
                    if(vida> 0){
                        vitima.setVida((int)vida);
                    }else{
                        vitima.setVida(0);
                    }
                    System.out.println("Ataque de "+this.nome+" com "+poder.getNome()+" em "+vitima.getNome()+" funcionou.");
                    System.out.println(vitima.getNome()+" esta com "+vitima.getVida()+" de vida.");
                }


            }else{
                System.out.println("Ataque de "+this.nome+" com "+poder.getNome()+" em "+vitima.getNome()+" nao funcionou.");
            }
        }
    }
}
