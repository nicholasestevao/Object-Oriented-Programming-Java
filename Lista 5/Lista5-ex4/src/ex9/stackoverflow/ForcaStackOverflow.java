package ex9.stackoverflow;

public class ForcaStackOverflow {
    
    public void stackOverflow(int idChamada)throws StackOverflowError{
        if(idChamada< 1000000)
            stackOverflow(idChamada + 1);
    }
}
