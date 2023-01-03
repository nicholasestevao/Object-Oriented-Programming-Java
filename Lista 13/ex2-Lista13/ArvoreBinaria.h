/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   ArvoreBinaria.h
 * Author: isaac
 *
 * Created on 2 de Janeiro de 2023, 16:30
 */

#ifndef ARVOREBINARIA_H
#define ARVOREBINARIA_H

#include <iostream>

using std::cout;
using std::endl;

template <class T> class ArvoreBinaria {
    private:
        T *dado;
        ArvoreBinaria<T> *filho_esquerda;
        ArvoreBinaria<T> *filho_direita;

    public:
        ArvoreBinaria();
        ArvoreBinaria(T dado);
        virtual ~ArvoreBinaria();
        
        T* busca(T dado);
        void imprimeOrdenadoCrescente() const;
        void imprimeOrdenadoDecrescente() const;
        void inserir(T dado);
        void remove(T dado);
};

template <class T> ArvoreBinaria<T>::ArvoreBinaria() {
    dado = nullptr;
    filho_esquerda = nullptr;
    filho_direita = nullptr;
}

template <class T> ArvoreBinaria<T>::ArvoreBinaria(T dado) {
    this->dado = new T;
    *(this->dado) = dado;
    this->filho_esquerda = nullptr;
    this->filho_direita = nullptr;
}

template <class T> ArvoreBinaria<T>::~ArvoreBinaria() {
    delete dado;
    filho_esquerda = nullptr;
    filho_direita = nullptr;
}

template <class T> T*  ArvoreBinaria<T>::busca(T dado) {
    T* r = nullptr;
    if(this->dado != nullptr) {
        if(*(this->dado) == dado) {
            r = this->dado;
        } else if (*(this->dado) >= dado) {
            if(filho_esquerda != nullptr) {
                r = filho_esquerda->busca(dado);
            }
        } else if (*(this->dado) <= dado) {
            if(filho_direita != nullptr) {
                r = filho_direita->busca(dado);
            }
        }
    }
    return r;
}

template <class T> void ArvoreBinaria<T>::imprimeOrdenadoCrescente() const {
    if(dado != nullptr) {
        if(filho_esquerda != nullptr) {
            filho_esquerda->imprimeOrdenadoCrescente();
        }
        cout << *dado << endl;
        if(filho_direita != nullptr) {
            filho_direita->imprimeOrdenadoCrescente();
        }
    }
}

template <class T> void ArvoreBinaria<T>::imprimeOrdenadoDecrescente() const {
    if(dado != nullptr) {
        if(filho_direita != nullptr) {
            filho_direita->imprimeOrdenadoDecrescente();
        }
        cout << *dado << endl;
        if(filho_esquerda != nullptr) {
            filho_esquerda->imprimeOrdenadoDecrescente();
        }
    }
}

template <class T> void ArvoreBinaria<T>::inserir(T dado) {
    if(this->dado == nullptr) {
        this->dado = new T;
        *(this->dado) = dado;
    } else {
        if(*(this->dado) > dado) {
            if(filho_esquerda == nullptr) {
                filho_esquerda = new ArvoreBinaria<T>(dado);
            } else {
                filho_esquerda->inserir(dado);
            }
        } else if (*(this->dado) < dado) {
            if(filho_direita == nullptr) {
                filho_direita = new ArvoreBinaria<T>(dado);
            } else {
                filho_direita->inserir(dado);
            }
        }
    }
}

template <class T> void ArvoreBinaria<T>::remove(T dado) {
    
}


#endif /* ARVOREBINARIA_H */

