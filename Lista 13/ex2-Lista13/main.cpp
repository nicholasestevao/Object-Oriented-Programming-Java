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
    
    int item = 2;
    cout << "Inserindo: " << item << endl;
    raiz.inserir(item);
    
    item = 0;
    cout << "Inserindo: " << item << endl;
    raiz.inserir(item);
        
    item = 3;
    cout << "Inserindo: " << item << endl;
    raiz.inserir(item);
    
    item = 5;
    cout << "Inserindo: " << item << endl;
    raiz.inserir(item);
    
    item = 1;
    cout << "Inserindo: " << item << endl;
    raiz.inserir(item);
    
    item = 4;
    cout << "Inserindo: " << item << endl << endl;
    raiz.inserir(item);

    raiz.imprimeOrdenadoCrescente();
    
    item = -512;
    
    cout << endl << "Buscando: " << item << endl;
    int* r = raiz.busca(item);
    if(r != nullptr) {
        cout << "   Encontrei o " << *r  << endl;
    } else {
        cout << "   Nao encontrei..." << endl;
    }
    
    item = 2;
    cout << endl << "Removendo " << item << endl;
    raiz.remove(item);
    cout <<"    Removido: " << item << endl;
    raiz.imprimeOrdenadoCrescente();
    
    item = 0;
    cout << endl << "Removendo " << item << endl;
    raiz.remove(item);
    cout <<"    Removido: " << item << endl;
    raiz.imprimeOrdenadoCrescente();
   
    item = 5;
    cout << endl << "Removendo " << item << endl;
    raiz.remove(item);
    cout <<"    Removido: " << item << endl;
    raiz.imprimeOrdenadoCrescente();
    
    item = 3;
    cout << endl << "Removendo " << item << endl;
    raiz.remove(item);
    cout <<"    Removido: " << item << endl;
    raiz.imprimeOrdenadoCrescente();
    
    item = 1;
    cout << endl << "Removendo " << item << endl;
    raiz.remove(item);
    cout <<"    Removido: " << item << endl;
    raiz.imprimeOrdenadoCrescente();
    
    item = 4;
    cout << endl << "Removendo " << item << endl;
    raiz.remove(item);
    cout <<"    Removido: " << item << endl;
    raiz.imprimeOrdenadoCrescente();
    
    return 0;
}

