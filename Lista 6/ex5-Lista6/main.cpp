/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.cpp
 * Author: isaac
 *
 * Created on 26 de Outubro de 2022, 13:42
 */
#include <iostream>
#include <cstdlib>
#include <vector>

#include "Complexo.h"

using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
    //Recebe o tamnho do vetor de numeros complexos
    int n;
    cout << "Digite o tamanho do vetor de numero complexos: ";
    cin >> n;
    cout << endl;
    
    //Cria vetor de numeors complexos de tamanho n
    vector<Complexo*> *vetor_comp = new vector<Complexo*>();
    for(int i = 0; i < n; i++) {
        double real = rand();
        double img = rand();
        vetor_comp->push_back(new Complexo(real, img));
    }
    
    Complexo *soma = new Complexo(0, 0);
    
    for(vector<Complexo*>::iterator it = vetor_comp->begin(); it != vetor_comp->end(); it++) {
        *soma = *soma + *(*it);
        delete *it;
    }
    vetor_comp->clear();

    soma->imprime();
    
    delete soma;
    delete vetor_comp;
    return 0;
}

