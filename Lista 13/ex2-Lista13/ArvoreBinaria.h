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

template <class T> class ArvoreBinaria {
    private:
        T *dado;
        ArvoreBinaria<T> *filho_esquerda;
        ArvoreBinaria<T> *filho_direita;

    public:
        ArvoreBinaria();
        ArvoreBinaria(T dado);
        virtual ~ArvoreBinaria();
        
        void inserir(T dado);
        void 
};

template <class T> ArvoreBinaria::ArvoreBinaria() {
    dado = nullptr;
    filho_esquerda = nullptr;
    filho_direita = nullptr;
}

template <class T> ArvoreBinaria::ArvoreBinaria(T dado) {
    this->dado = new T;
    this->dado = dado;
    this->filho_esquerda = nullptr;
    this->filho_direita = nullptr;
}

template <class T> ArvoreBinaria::~ArvoreBinaria() {
    delete dado;
    filho_esquerda = nullptr;
    filho_direita = nullptr;
}


#endif /* ARVOREBINARIA_H */

