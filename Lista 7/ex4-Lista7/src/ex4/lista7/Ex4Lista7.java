
package ex4.lista7;

public class Ex4Lista7 {

    public static void main(String[] args) {
        int valorComp = 100000;
        Aleatoriamente teste = new Aleatoriamente((valorComp * 10));
        
        teste.getListaAL(valorComp);
        teste.getListaLL(valorComp);
        teste.atualizaListaAL(valorComp);
        teste.atualizaListaLL(valorComp);
    }
    
}
