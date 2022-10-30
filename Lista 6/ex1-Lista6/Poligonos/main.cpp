#include <cstdlib>
#include <iostream>
#include <string>
#include <cmath>
#include <locale.h>
#include "Quadrado.cpp"
#include "Triangulo.cpp"
using namespace std;

int main(int arqc, char *argv[]){
  setlocale(LC_ALL, "Portuguese");
  Poligono *Quad = new Quadrado(4);
  Poligono *Tria = new Triangulo(2, 4);

  cout << "Seu objeto " << (Quad->getNome()) << "\n";
  cout << "E sua área é de " << Quad->calculaArea() << "\n";

  cout << "Seu objeto " << (Tria->getNome()) << "\n";
  cout << "E sua área é de " << Tria->calculaArea() << "\n";

  delete (Quad);
  delete (Tria);
  //std::cout << "Hello World!\n";
}