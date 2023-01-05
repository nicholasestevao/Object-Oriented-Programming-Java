/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   Termo.cpp
 * Author: isaac
 * 
 * Created on 3 de Setembro de 2022, 16:29
 */

#include "Termo.h"

Termo::Termo(int grau, int cte) {
    this->grau = grau;
    this->cte = cte;
}

int Termo::getCte() {
    return cte;
}

int Termo::getGrau() {
    return grau;
}

void Termo::addCte(int add_cte) {
    cte += add_cte;
}

void Termo::mostra() {
    if (grau == 0) {
        cout << cte;
    } else {
        cout << cte << "x^" << grau;
    }
}

