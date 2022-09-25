package ex2lista3;

import package ex2-lista3

import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<Produto>carrinho = new ArrayList<>();
        
        carrinho.add(new Mouse("Mouse-Pad Fallen Ace", 28.99, "Mousepad Gamer Fallen Ace Speed+, Médio 360x300mm"));
        carrinho.add(new Mouse("Mouse Logitech G305", 221.06, "Mouse Gamer Sem Fio Logitech G305 LIGHTSPEED com 6 Botões Programáveis, 12.000 DPI - Preto"));
        carrinho.add(new Mouse("Mouse HyperX Pulsefire Core", 99.97, "Mouse Gamer HyperX Pulsefire Core RGB 6200 DPI - Preto"));

        carrinho.add(new Livro("Como se Tornar Um Programador Sendo Pobre", 21.98, "by João Pedro Messias"));
        carrinho.add(new Livro("Introdução a POO", 64.32, "by Robson Leonardo Ferreira Cordeiro"));
        carrinho.add(new Livro("Algoritmos e Lógica Da Programação", 39.90, "by Marco A. Furlan de Souza, Marcelo Marques Gomes, Marcio Vieira Soares, Ricardo Concilio"));
        carrinho.add(new Livro("Fundamentos de HTML5 e CSS3", 54.99, "by Maurício Samy Silva"));

        for (int i = 0; i < carrinho.size(); i++) {
            System.out.println((carrinho.get(i).getNomeloja()) + " R$" + (carrinho.get(i).getPreco()));
            System.out.println((carrinho.get(i).getDescricao()) + "\n");
        }
    }
}