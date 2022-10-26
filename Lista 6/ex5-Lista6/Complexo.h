#ifndef COMPLEXO_H
#define COMPLEXO_H

#include <math.h>  
class Complexo {
public:
    Complexo(double, double);
    void setReal(double);
    void setImag(double);
    double getReal() const; // metodo const nao altera o objeto que o chamou
    double getImag() const;
    void imprime() const;
    Complexo operator+(const Complexo &) const; // passando por referência para economizar memória
    //Método soma nao altera nenhum dos objetos
    Complexo operator-(const Complexo &) const;
    Complexo operator*(const Complexo &) const;
    //double operator%() const;
private:
    double real;
    double imag;
};

#endif /* COMPLEXO_H */

