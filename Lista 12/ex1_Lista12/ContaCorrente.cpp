
#include "ContaCorrente.h"

ContaCorrente::ContaCorrente() {
    this->saldo = 0;
}

ContaCorrente::~ContaCorrente() {
}

void ContaCorrente::deposita(int valor){
    if(valor > 0){
        int novo_saldo = this->saldo;
        novo_saldo += valor;
        this->saldo = novo_saldo;
    }
}

void ContaCorrente::saca(int valor){
    if(valor > 0){
        int novo_saldo = this->saldo;
        if(valor < novo_saldo){ //saldo positivo
            novo_saldo -= valor;
            this->saldo = novo_saldo;
        }else{// valor >= novo_saldo
            novo_saldo = 0;
            this->saldo = novo_saldo;
        }
    }
}

void ContaCorrente::depositaComBloqueio(int valor){
    if(valor > 0){
        token_bloqueio.lock();
        int novo_saldo = this->saldo;
        novo_saldo += valor;
        this->saldo = novo_saldo;
        token_bloqueio.unlock();
    }
}

void ContaCorrente::sacaComBloqueio(int valor){
     if(valor > 0){
        token_bloqueio.lock();
        int novo_saldo = this->saldo;
        if(valor < novo_saldo){ //saldo positivo
            novo_saldo -= valor;
            this->saldo = novo_saldo;
        }else{// valor >= novo_saldo
            novo_saldo = 0;
            this->saldo = novo_saldo;
        }
        token_bloqueio.unlock();
    }
}

int ContaCorrente::getSaldo() const{
    return this->saldo;
}