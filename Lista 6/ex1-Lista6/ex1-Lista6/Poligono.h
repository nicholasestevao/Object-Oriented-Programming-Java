/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   Poligono.h
 * Author: isaac
 *
 * Created on 30 de Outubro de 2022, 19:03
 */

#ifndef POLIGONO_H
#define POLIGONO_H

#include <cstdlib>
#include <iostream>
#include <string>
#include <cmath>
using namespace std;


class Poligono{
  public:
    float base;
    float altura;

    Poligono(float Base, float Altura);

    virtual ~Poligono() {
        
    }

    virtual string getNome(){
      return ("é um Poligono");
    }

    virtual float calculaArea() = 0;
};

#endif /* POLIGONO_H */

