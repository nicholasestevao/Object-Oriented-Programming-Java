package exe3.lista.pkg7;

/**
 *
 * @author isaac
 */
public class ex3_Lista7 {
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            ArvoreBinaria<String> a = new ArvoreBinaria<String> ("E");
            a.insercao("B");
            a.insercao("A");
            a.insercao("Z");
            a.insercao("D");
            
            a.imprimeOrdenado();
            
            System.out.println();
            System.out.println("====================");
            
            System.out.println("Buscando \"E\" ");
            
            if(a.buscaDado("E")) {
                System.out.println("Achou!");
            } else {
                System.out.println("Não achou");
            }
            
            System.out.println();
            System.out.println("====================");
            
            System.out.println("Removendo \"E\" ");
            
            a.removeDado("E");
            
            System.out.println();
            a.imprimeOrdenado();

    }
}