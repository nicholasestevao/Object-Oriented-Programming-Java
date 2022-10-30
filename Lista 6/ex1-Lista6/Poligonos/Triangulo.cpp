#include <cstdlib>
#include <iostream>
#include <string>
#include <cmath>
#include "Poligono.cpp"
using namespace std;

class Triangulo: public Poligono{
  public:
    Triangulo(float Base, float Altura) : Poligono(Base, Altura){
    };

    string getNome(){
      return ("é um Triangulo e também ") + (Poligono::getNome());
    };

    float calculaArea(){
      return ((base * altura) / 2);
    };
};