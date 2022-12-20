#include "Pilha.h"

#include "PilhaCheia.h"
#include "PilhaVazia.h"

#include <iostream>

using namespace std;

Pilha::Pilha(int tamanho) {
    this->tamanho = tamanho;
    this->topo = -1;
    this->dados = new int(tamanho);
}

Pilha::~Pilha() {
    delete dados;
}

void Pilha::push(int elem){
    if(topo + 1 == tamanho){
        throw PilhaCheia(); // cria um objeto da classe PilhaCheia e o lanca como excecao e interrompe execucao
    }
    dados[++topo] = elem;    
}

int Pilha::pop(){
    if(topo == -1){
        throw PilhaVazia(); // cria um objeto da classe PilhaVazia e o lanca como excecao e interrompe execucao
    }    
    return dados[topo--];
}

