/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   Quadrado.h
 * Author: isaac
 *
 * Created on 30 de Outubro de 2022, 19:03
 */

#ifndef QUADRADO_H
#define QUADRADO_H

#include <cstdlib>
#include <iostream>
#include <string>
#include <cmath>
#include "Poligono.h"
using namespace std;

class Quadrado: public Poligono{
  public:
    Quadrado(float Lado);

    string getNome();
    
    float calculaArea();
};

#endif /* QUADRADO_H */

