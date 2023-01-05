/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   Polinomio.cpp
 * Author: isaac
 * 
 * Created on 3 de Setembro de 2022, 16:32
 */

#include "Polinomio.h"

Polinomio::Polinomio(int grau_m) {
    this->grau_m = grau_m;
}

Polinomio::~Polinomio() {
    p.clear();
}

void Polinomio::add(Termo x) {
    if (x.getGrau() <= grau_m) {
        if (p.size() == 0) {
            p.push_front(x);
        } else {
            list<Termo>::iterator it;
            for (it = p.begin(); it != p.end(); it++) {
                if (x.getGrau() == it->getGrau()) {
                    it->addCte(x.getCte());
                    return;
                }
            }
            it = p.begin();
            while (it != p.end() && it->getGrau() < x.getGrau()) {
                it++;
            }
            if (it == p.begin()) {
                p.push_front(x);
            } else {
                p.insert(it, x);
            }
        }
    }
}

void Polinomio::mostra() {
    list<Termo>::reverse_iterator it;
    int i = 1;
    for (it = p.rbegin(); it != p.rend(); it++) {
        it->mostra();
        if (i != p.size()) {
            cout << " + ";
        } else {
            cout << endl;
        }
        i++;
    }
}

double Polinomio::calcula(double x) {
    double val_poli = 0;
    list<Termo>::iterator it;
    for (it = p.begin(); it != p.end(); it++) {
        if (it->getGrau() == 0) {
            val_poli += it->getCte();
        } else {
            val_poli += (pow(x, it->getGrau()) * it->getCte());
        }
    }
    return val_poli;
}

