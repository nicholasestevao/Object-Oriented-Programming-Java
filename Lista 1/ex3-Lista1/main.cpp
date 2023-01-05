/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.cpp
 * Author: isaac
 *
 * Created on 31 de agosto de 2022, 11:24
 */

#include <cstdlib>
#include <iostream>
#include "Termo.h"
#include "Polinomio.h"

using namespace std;

int main(int argc, char** argv) {
    int grau, cte;
    int menu = 1;
    Polinomio *p;

    cout << "Digite o grau maximo do polinomio: ";
    cin >> grau;
    cout << endl;
    p = new Polinomio(grau);

    while (menu != 4) {
        cout << "Menu: " << endl << "\t1) Add" << endl << "\t2) Mostra" << endl << "\t3) Calcula" << endl << "\t4) Sai" << endl;
        cout << "Digite o numero da opcao: ";
        cin >> menu;

        switch (menu) {
            case 1:
                cout << "Digite o grau do termo a ser adicionado: ";
                cin >> grau;
                cout << "Digite a constante do termo a ser adicionado: ";
                cin >> cte;
                p->add(Termo(grau, cte));
                break;

            case 2:
                cout << "Seu polinomio eh: ";
                p->mostra();
                cout << endl;
                break;

            case 3:
                int x;
                cout << "Digite um valor para x: ";
                cin >> x;
                cout << "O resultado eh: " << p->calcula(x) << endl;
                break;

            case 4:
                cout << "Saindo...";
                delete p;
                break;

            default:
                cout << "Opcao invalida." << endl;
                break;
        }
    }
    return 0;
}

