#include <cstdlib>
#include <thread>
#include <iostream>

#include "ContaCorrente.h"

using namespace std;

int main(int argc, char** argv)  {
    ContaCorrente c;
    
    cout << "Tentando Depositar -10000" << endl;
    try {
        c.deposita(-10000);
        cout << "Deposito Efetuado!" << endl << "Saldo Atual: " << c.getSaldo() << endl << endl;
    } catch(DepositoInvalido &e) {
        cout << e.what() << endl << endl;
    }
    
    cout << "Tentando Depositar 10000" << endl;
    try {
        c.deposita(10000);
       cout << "Deposito Efetuado!" << endl << "Saldo Atual: " << c.getSaldo() << endl << endl;
    } catch(DepositoInvalido &e) {
        cout << e.what() << endl << endl;
    }
    
    cout << "Tentando Sacar 25000" << endl;
    try {
        c.saca(25000);
        cout << "Saque Efetuado!" << endl << "Saldo Atual: " << c.getSaldo() << endl << endl;
    } catch(SaldoInsuficiente &e) {
        cout << e.what() << endl << endl;
    }
    
    cout << "Tentando Sacar 10000" << endl;
    try {
        c.saca(10000);
        cout << "Saque Efetuado!" << endl << "Saldo Atual: " << c.getSaldo() << endl << endl;
    } catch(SaldoInsuficiente &e) {
        cout << e.what() << endl << endl;
    }
    
    
    
    
    return 0;
}

