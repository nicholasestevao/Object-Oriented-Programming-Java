package ex1.lista1;
import java.util.Scanner;

public class Ex1Lista1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("IMEI:");
        String IMEI = s.next();
        
        System.out.println("Modelo do Processador:");
        String modeloProcessador = s.next();
        
        System.out.println("Modelo da Tela:");
        String modeloTela = s.next();
        
        System.out.println("Modelo do Sistema de Som:");
        String modeloSisSom = s.next();
        
        System.out.println("Modelo do Sistema de Comunicacao:");
        String modeloSisCom = s.next();
        
        Celular cel = new Celular(IMEI, modeloProcessador, modeloTela, modeloSisSom, modeloSisCom);
        
        cel.mostra();
        
        System.out.println("Digite o novo clock:");
        int clock = s.nextInt();
        cel.overclock(clock);
        
        System.out.println("Digite o novo brilho:");
        int brilho = s.nextInt();
        cel.setBrilho(brilho);
        
        System.out.println("Digite o novo volume:");
        int volume = s.nextInt();
        System.out.println("O audio e compativel com Dolby Atmos (digite true ou false):");
        boolean compativel = s.nextBoolean();
        cel.setVolume(volume, compativel);
        
        System.out.println("Deseja ligar a antena do celular (digite true ou false):");
        boolean antena = s.nextBoolean();
        System.out.println("A regiao tem cobertura 5G (digite true ou false):");
        boolean compativel5G = s.nextBoolean();
        cel.ligarAntena(antena, compativel5G);
        
        
    }
    
}
