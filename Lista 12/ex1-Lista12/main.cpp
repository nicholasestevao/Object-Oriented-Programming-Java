#include <cstdlib>
#include <thread>
#include <iostream>

#include "ContaCorrente.h"

using namespace std;

void deposita_saca(ContaCorrente *c){
    for(int i=0; i<500000; i++){
        c->deposita(1);
        c->saca(1);
    }
}

void deposita_saca_com_bloqueio(ContaCorrente *c){
    for(int i=0; i<500000; i++){
        c->depositaComBloqueio(1);
        c->sacaComBloqueio(1);
    }
}

int main(int argc, char** argv) {
    
    cout << "Saldo final deve ser 0." << endl << endl;
    cout << "SEM BLOQUEIO:" << endl;
    
    for(int i = 0; i< 5; i++){
        ContaCorrente c1;
        thread t1(deposita_saca, &c1);
        thread t2(deposita_saca, &c1);

        t1.join();
        t2.join();

        cout << "Saldo final: " << c1.getSaldo() << endl; 
    }
    cout << endl;
    cout << "COM BLOQUEIO:" << endl;
    
    for(int i = 0; i< 5; i++){
        ContaCorrente c2;
        thread t1(deposita_saca_com_bloqueio, &c2);
        thread t2(deposita_saca_com_bloqueio, &c2);

        t1.join();
        t2.join();

        cout << "Saldo final: " << c2.getSaldo() << endl; 
    }
    
    return 0;
}

