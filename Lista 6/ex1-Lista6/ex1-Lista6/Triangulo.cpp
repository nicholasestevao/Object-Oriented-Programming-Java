#include "Triangulo.h"

Triangulo::Triangulo(float Base, float Altura) : Poligono(Base, Altura){
    };

string Triangulo::getNome(){
      return ("é um Triangulo e também ") + (Poligono::getNome());
    };
    
float Triangulo::calculaArea(){
      return ((base * altura) / 2);
    };    