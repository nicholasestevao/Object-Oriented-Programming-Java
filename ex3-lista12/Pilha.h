

#ifndef PILHA_H
#define PILHA_H

#include "PilhaCheia.h"
#include "PilhaVazia.h"

class Pilha {
public:
    Pilha(int);
    virtual ~Pilha();
    void push(int);
    int pop();
private:
    int tamanho;
    int topo;
    int *dados;
};

#endif /* PILHA_H */

