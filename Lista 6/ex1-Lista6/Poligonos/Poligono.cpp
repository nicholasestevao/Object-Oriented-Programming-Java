#ifndef POLIGONO
#define POLIGONO

#include <cstdlib>
#include <iostream>
#include <string>
#include <cmath>
using namespace std;


class Poligono{
  public:
    float base;
    float altura;

    Poligono(float Base, float Altura){
      base = Base;
      altura = Altura;
    };

    virtual ~Poligono(){
    };

    virtual string getNome(){
      return ("é um Poligono");
    };

    virtual float calculaArea() = 0;
};

#endif