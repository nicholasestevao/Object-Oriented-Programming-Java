package executavel;
import executavel.Executavel;
import java.io.Serializable;
import java.util.Random;

public class Admnistrador implements Executavel, Serializable {
    private int idAdm;
    private int ping;
    private Random aleatorio = new Random();

    Admnistrador(){
        idAdm = aleatorio.nextInt(10000);
        ping =  aleatorio.nextInt(1000);
    }
    
    public void testeConexao() {
        ping =  aleatorio.nextInt(1000);
        System.out.println("ping do Administrador " + idAdm + " : " + ping);
    }
    
    public void tempoCarregamento() {
        testeConexao();
        if(ping < 100){
            System.out.println("Teste de conexao de usuario esta boa");
        }
        else if(ping < 400){
            System.out.println("Teste de conexao do usuario esta oscilando");
        }
        else{
            System.out.println("Teste de conexao do usuario esta pessima");
        }
    }

    @Override
    public void fazer() {
        for (int i = 0; i < 10; i++) {
            tempoCarregamento();
        }
    }
}
