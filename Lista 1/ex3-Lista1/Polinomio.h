/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   Polinomio.h
 * Author: isaac
 *
 * Created on 31 de agosto de 2022, 11:24
 */

#ifndef POLINOMIO_H
#define POLINOMIO_H


#include <iostream>
#include <cmath>
#include <list>
#include "Termo.h"

using std::cout;
using std::endl;
using std::list;

class Polinomio {
    private:
        std::list<Termo> p;
        int grau_m;
    public:
        Polinomio(int grau_m);
        ~Polinomio();
        void add(Termo x);
        void mostra();
        double calcula(double x);    
};

#endif /* POLINOMIO_H */

