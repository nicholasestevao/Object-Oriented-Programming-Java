package servidor;
import java.util.Random;

public class UsuarioPadrao implements Executavel {
    private int id;
    private int ping;
    private Random aleatorio = new Random();

    UsuarioPadrao(){
        id = aleatorio.nextInt(10000);
        ping =  aleatorio.nextInt(1000);
    }
    
    @Override
    public void testeConexao() {
        ping =  aleatorio.nextInt(1000);
        System.out.println("ping do usuario " + id + " : " + ping);
    }

    @Override
    public void tempoCarregamento() {
        testeConexao();
        if(ping < 100){
            System.out.println("A conexao do usuario esta boa");
        }
        else if(ping < 400){
            System.out.println("A conexao do usuario esta oscilando");
        }
        else{
            System.out.println("A conexao do usuario esta pessima");
        }
    }

    @Override
    public void fazer() {
        for (int i = 0; i < 10; i++) {
            tempoCarregamento();
        }
    }
}
