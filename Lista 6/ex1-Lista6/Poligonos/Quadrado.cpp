#include <cstdlib>
#include <iostream>
#include <string>
#include <cmath>
#include "Poligono.cpp"
using namespace std;

class Quadrado: public Poligono{
  public:
    Quadrado(float Lado) : Poligono(Lado, Lado){
    };

    string getNome(){
      return ("é um Quadrado e também ") + (Poligono::getNome());
    };
    
    float calculaArea(){
      return (base * altura);
    };
};
