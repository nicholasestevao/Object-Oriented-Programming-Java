#include "Quadrado.h"

Quadrado::Quadrado(float Lado) : Poligono(Lado, Lado) {
    };

string Quadrado::getNome() {
    return ("é um Quadrado e também ") + (Poligono::getNome());
};
    
float Quadrado::calculaArea() {
    return (base * altura);
};