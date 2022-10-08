package ex9.stackoverflow;

public class Ex9StackOverflow {

    public static void main(String[] args) {
        //Programa que forca stackoverflow por meio de muitas chamadas recursivas da mesma funcao
        //Essas chamadas sao todas empilhadas na pilha ate que ela fique cheia
        try{
            ForcaStackOverflow f = new ForcaStackOverflow();
            f.stackOverflow(0);
        }catch(StackOverflowError e){
            System.out.println(e);
        }
    }
    
}
