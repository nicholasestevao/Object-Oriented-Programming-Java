/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   Termo.h
 * Author: isaac
 *
 * Created on 31 de agosto de 2022, 11:24
 */

#ifndef TERMO_H
#define TERMO_H

#include <iostream>

using std::cout;

class Termo {
    private:
        int grau, cte;

    public:
        Termo (int grau, int cte); 
        int getCte ();  
        int getGrau ();
        void addCte (int add_cte);
        void mostra ();
};

#endif /* TERMO_H */

