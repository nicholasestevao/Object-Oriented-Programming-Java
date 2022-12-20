

#include "PilhaExcecao.h"

PilhaExcecao::PilhaExcecao(string mensagem) {
    this->mensagem = mensagem;
}

string PilhaExcecao::getMensagem(){
    return this->mensagem;
}


PilhaExcecao::~PilhaExcecao() {
}

