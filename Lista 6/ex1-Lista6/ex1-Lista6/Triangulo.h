/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   Triangulo.h
 * Author: isaac
 *
 * Created on 30 de Outubro de 2022, 19:04
 */

#ifndef TRIANGULO_H
#define TRIANGULO_H

#include <cstdlib>
#include <iostream>
#include <string>
#include <cmath>
#include "Poligono.h"
using namespace std;

class Triangulo: public Poligono{
  public:
    Triangulo(float Base, float Altura);

    string getNome();

    float calculaArea();
};

#endif /* TRIANGULO_H */

