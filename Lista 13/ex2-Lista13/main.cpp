/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.cpp
 * Author: isaac
 *
 * Created on 2 de Janeiro de 2023, 16:28
 */

#include <cstdlib>
#include "ArvoreBinaria.h"

using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
    ArvoreBinaria<int> raiz;
    
    raiz.inserir(2);
    raiz.inserir(0);
    raiz.inserir(4);
    raiz.inserir(5);
    raiz.inserir(1);
    raiz.inserir(3);

    raiz.imprimeOrdenadoCrescente();
    
    int item_buscado = -512;
    
    cout << endl << "Buscando: " << item_buscado << endl;
    int* r = raiz.busca(item_buscado);
    if(r != nullptr) {
        cout << "   Encontrei o " << *r  << endl;
    } else {
        cout << "   Nao encontrei..." << endl;
    }
    
    return 0;
}

