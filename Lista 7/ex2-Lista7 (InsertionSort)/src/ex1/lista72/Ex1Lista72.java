
package ex1.lista72;

public class Ex1Lista72 {

    public static <TIPO extends Comparable> void insertionSort(TIPO [] A){
        TIPO temp;
        int i;
        for(int j = 1; j< A.length; j++){
            temp = A[j];
            i = j-1;
            while(i>-1 && A[i].compareTo(temp) > 0){
                A[i+1] = A[i];
                i -=1;
            }
            A[i+1] = temp;
        }
    }
    
    public static void main(String[] args) {
        
        //Trabalhando com inteiros
        System.out.println("Teste com inteiros:");
        Integer [] vi = new Integer[5];
        vi[0] = 10;
        vi[1] = 5;
        vi[2] = 10;
        vi[3] = 15;
        vi[4] = 1;
        
        System.out.print("[ ");
        for(int i=0; i<4; i++){
            System.out.print(vi[i] + ", ");
        }
        System.out.println(vi[4]+" ]");
        
        //ordena vetor
        insertionSort(vi);
        
         System.out.print("[ ");
        for(int i=0; i<4; i++){
            System.out.print(vi[i] + ", ");
        }
        System.out.println(vi[4]+" ]");
                
        // Trabalahndo com Strings
        System.out.println("");
        System.out.println("Teste com Strings:");
        String [] vs = new String[5];
        vs[0] = "Maria";
        vs[1] = "Joao";
        vs[2] = "Pedro";
        vs[3] = "Ana";
        vs[4] = "Jorge";
        
        System.out.print("[ ");
        for(int i=0; i<4; i++){
            System.out.print(vs[i] + ", ");
        }
        System.out.println(vs[4]+" ]");
        
        //ordena vetor
        insertionSort(vs);
        
         System.out.print("[ ");
        for(int i=0; i<4; i++){
            System.out.print(vs[i] + ", ");
        }
        System.out.println(vs[4]+" ]");
        
        System.out.println("");
        System.out.println("Teste com a classe Pessoa:");
        Pessoa[] pessoas = new Pessoa[10];
        
        pessoas[0] = new Pessoa("Paulo", 19);
        pessoas[1] = new Pessoa("Bruno", 20);
        pessoas[2] = new Pessoa("Raissa", 20);
        pessoas[3] = new Pessoa("Nicholas", 19);
        pessoas[4] = new Pessoa("Hugo", 19);
        pessoas[5] = new Pessoa("Mariana", 21);
        pessoas[6] = new Pessoa("Italo", 20);
        pessoas[7] = new Pessoa("Isaac", 20);
        pessoas[8] = new Pessoa("Ana", 18);
        pessoas[9] = new Pessoa("Guilherme", 22);
               
        System.out.print("[ ");
        for(int i = 9; i>=0; i--){
            if(i>0){
                System.out.print(pessoas[9-i].getNome() + " - ("+pessoas[9-i].getIdade()+" anos), ");
            }else{
                System.out.println(pessoas[9-i].getNome() + " - ("+pessoas[9-i].getIdade()+" anos)]");
            }
        }
        
        insertionSort(pessoas);
        
         System.out.print("[ ");
        for(int i = 0; i<10; i++){
            if(i<9){
                System.out.print(pessoas[i].getNome() + " - ("+pessoas[i].getIdade()+" anos), ");
            }else{
                System.out.println(pessoas[i].getNome() + " - ("+pessoas[i].getIdade()+" anos)]");
            }
        }
    }
    
}
