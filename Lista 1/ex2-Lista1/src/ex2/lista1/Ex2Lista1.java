package ex2.lista1;
import java.util.*;

public class Ex2Lista1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        DispositivoRede rede = new DispositivoRede();
        DispositivoImpressao impressora = new DispositivoImpressao();
        DispositivoVideo tela = new DispositivoVideo();

        //Testando dispositivo de rede
        System.out.println("Dispositivo de Rede:");
        //rede.ligaDispositivo();
        rede.executaTeste(); // funcao executa teste ja chama a funcao verificaStatus e a funcao ligaDispositivo
        //rede.verificaStatus();
        
        System.out.println("Digite o tamanho do pacote de dados: ");
        int tamDados = s.nextInt();
        rede.enviaPacoteDados(tamDados);
        
        //Testando dispositivo de impressao
        System.out.println("\nDispositivo de Impressao:");
        //impressora.ligaDispositivo();
        impressora.executaTeste();// funcao executa teste ja chama a funcao verificaStatus
        //impressora.verificaStatus();
        
        System.out.println("Digite a quantidade de paginas a serem impressas: ");
        int numPag = s.nextInt();
        impressora.imprimePagina(numPag);
        
        //Testando dispositivo de video
        System.out.println("\nDispositivo de Video:");
        //tela.ligaDispositivo();
        tela.executaTeste();// funcao executa teste ja chama a funcao verificaStatus
        //tela.verificaStatus();
        
        System.out.println("Digite o brilho desejado: ");
        int brilho = s.nextInt();
        tela.alteraBrilhoExibicao(brilho);
    }
    
}
