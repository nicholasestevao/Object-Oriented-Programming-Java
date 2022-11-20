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
            ArvoreBinaria<String> a = new ArvoreBinaria<String> ();
            
            a.insere("E");
            a.insere("B");
            a.insere("A");
            a.insere("Z");
            a.insere("D");
            
            a.imprimeOrdenado();
            
            String busca = "C";
            String remove = "E";
            
            System.out.println();
            System.out.println("====================");
            
            System.out.println("Buscando \"" + busca + "\"");
            
            if(a.buscaDado(busca)) {
                System.out.println("Achou!");
            } else {
                System.out.println("Não achou");
            }
            
            System.out.println();
            System.out.println("====================");
            
            System.out.println("Removendo \"" + remove + "\"");
            
            a.removeDado(remove);
            
            System.out.println();
            a.imprimeOrdenado();

    }
}