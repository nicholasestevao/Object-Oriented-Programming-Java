#include "Complexo.h"
#include <iostream>

using namespace std;

Complexo::Complexo(double real, double imag){
    this->real = real;
    this->imag= imag;
}

void Complexo::setReal(double real){
    this->real = real;
}

void Complexo::setImag(double imag){
    this->imag = imag;
}

double Complexo::getReal() const{
    return this->real;
} // metodo const nao altera o objeto que o chamou

double Complexo::getImag() const{
    return this->imag;
}

void Complexo::imprime() const{
    cout << this->real << " + i" << this->imag << endl;
}

Complexo Complexo::soma(const Complexo *outro) const{   
    return Complexo(this->real + outro->real, this->imag + outro->imag);
}

Complexo Complexo::subtracao(const Complexo *outro) const{   
    return Complexo(this->real - outro->real, this->imag - outro->imag);
}

Complexo Complexo::multiplicacao(const Complexo *outro) const{   
    return Complexo((this->real*outro->real) - (this->imag*outro->imag), this->imag*outro->real + this->real*outro->imag);
}

double Complexo::modulo() const{   
    return sqrt(pow(this->real,2) + pow(this->imag,2));
}


