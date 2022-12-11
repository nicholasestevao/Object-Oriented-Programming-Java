
package ex2.lista10;

public class Conta {
    private int saldo;
    
    Conta(int saldo){
        this.saldo = saldo;
    }
    
    public synchronized void deposita(int valor){
        int saldoAtual = this.saldo;
        int novoSaldo = saldoAtual + valor;
        this.saldo = novoSaldo;
    }
    
    public synchronized void saca(int valor){
        int saldoAtual = this.saldo;
        int novoSaldo = saldoAtual - valor;
        //if(novoSaldo >=0){
            this.saldo = novoSaldo;
        /*}else{
            this.saldo = 0;
        }*/
       
    }
    
    public void depositaSemSincronizacao(int valor){
        int saldoAtual = this.saldo;
        int novoSaldo = saldoAtual + valor;
        this.saldo = novoSaldo;
    }
    
    public void sacaSemSincronizacao(int valor){
        int saldoAtual = this.saldo;
        int novoSaldo = saldoAtual - valor;
        //if(novoSaldo >=0){
            this.saldo = novoSaldo;
        /*}else{
            this.saldo = 0;
        }*/
       
    }
    
    public int getSaldo(){
        return this.saldo;
    }
}
