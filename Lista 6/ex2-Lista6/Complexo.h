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
    Complexo soma(const Complexo *) const; // passando por referência para economizar memória
    //Método soma nao altera nenhum dos objetos
    Complexo subtracao(const Complexo *) const;
    Complexo multiplicacao(const Complexo *) const;
    double modulo() const;
private:
    double real;
    double imag;
};

#endif /* COMPLEXO_H */

