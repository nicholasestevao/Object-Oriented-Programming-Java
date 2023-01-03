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
        void removeFilhoEsquerda();
        T* retiraMenor();
        T* retiraMenorRecursivo(ArvoreBinaria<T>* raiz);
        bool removeRetorna(T dado);
        
    public:
        ArvoreBinaria();
        ArvoreBinaria(T dado);
        virtual ~ArvoreBinaria();
        
        T* busca(T dado);
        void imprimeOrdenadoCrescente() const;
        void imprimeOrdenadoDecrescente() const;
        void inserir(T dado);
        T* getDado();
        ArvoreBinaria<T>* getFilhoDireita();
        ArvoreBinaria<T>* getFilhoEsquerda();
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
    } else {
        cout << "Arvore Vazia!" <<  endl;
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
    } else {
        cout << "Arvore Vazia!" <<  endl;
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

template <class T> T* ArvoreBinaria<T>::getDado() {
    return dado;
}

template <class T> ArvoreBinaria<T>* ArvoreBinaria<T>::getFilhoDireita() {
    return filho_direita;
}

template <class T> ArvoreBinaria<T>* ArvoreBinaria<T>::getFilhoEsquerda() {
    return filho_esquerda;
}

template <class T> void ArvoreBinaria<T>::remove(T dado) {
    cout << "to aqui";
    bool r = removeRetorna(dado);
}

template <class T> bool ArvoreBinaria<T>::removeRetorna(T dado) {
    bool r = true;
    if(this->dado != nullptr) {
        if(*(this->dado) == dado) {
            if((filho_esquerda == nullptr) && (filho_direita == nullptr)) {
                delete this->dado;
                this->dado = nullptr;
                r = false;
            } else if(filho_esquerda == nullptr) {
                T* aux = this->dado;
                this->dado = filho_direita->dado;
                this->filho_esquerda = filho_direita->filho_esquerda;
                this->filho_direita = filho_direita->filho_direita;
                delete aux;
            } else if(filho_direita == nullptr) {
                T *aux = this->dado;
                this->dado = filho_esquerda->dado;
                this->filho_direita = filho_esquerda->filho_direita;
                this->filho_esquerda = filho_esquerda->filho_esquerda;
                delete aux;
            } else {
                T *aux = this->dado;
                this->dado = this->retiraMenor();
                delete aux;
            }
        } else if (*(this->dado) > dado) {
            if (filho_esquerda != nullptr) {
                r = filho_esquerda->removeRetorna(dado);
                if(r == false) {
                    filho_esquerda = nullptr;
                    r = true;
                }
            }
        } else if (*(this->dado) < dado) {
            if (filho_direita != nullptr) {
                r = filho_direita->removeRetorna(dado);
                if (r == false) {
                    filho_direita = nullptr;
                    r = true;
                }
            }
        }
    }
    return r;
}

template <class T> void ArvoreBinaria<T>::removeFilhoEsquerda() {
    delete filho_esquerda;
    filho_esquerda = nullptr;
}

template <class T> T* ArvoreBinaria<T>::retiraMenor() {
    T* r = nullptr;
    r = retiraMenorRecursivo(nullptr);
    return r;
}

template <class T> T* ArvoreBinaria<T>::retiraMenorRecursivo(ArvoreBinaria<T>* raiz) {
    T* r = nullptr;
    if(filho_esquerda == nullptr) {
        r = new T;
        *r = *(dado);
        if(filho_direita != nullptr) {
            delete dado;
            dado = filho_direita->dado;
            filho_esquerda = filho_direita->filho_esquerda;
            filho_direita = filho_direita->filho_direita;
        } else {
            if(raiz != nullptr) {
                raiz->removeFilhoEsquerda();
            }
        }
    } else {
        r =  filho_esquerda->retiraMenorRecursivo(this);
    }
    return r;
}

#endif /* ARVOREBINARIA_H */

