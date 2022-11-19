
package ex1.lista7;
import java.lang.Number;

public class Par <T extends Number>{
    private T dado1;
    private T dado2;
    
    public Par(T dado1, T dado2){
        this.dado1 = dado1;
        this.dado2 = dado2;
    }
    
    public T getMax(){
        if(dado1.doubleValue() > dado2.doubleValue()){
            return dado1;
        }else{
            return dado2;
        }
    }
    
    public T getMin(){
        if(dado1.doubleValue() <dado2.doubleValue()){
            return dado1;
        }else{
            return dado2;
        }
    }
    
    public String toString(){
        return dado1.toString()+" "+dado2.toString();
    }
}
