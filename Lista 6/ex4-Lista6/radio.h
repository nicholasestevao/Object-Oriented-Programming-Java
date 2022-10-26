
#ifndef RADIO_H
#define RADIO_H

#include <iostream>
using namespace std;

class radio {
public:
    radio();
    virtual void liga(); // Se esse método nao fosse virtual o dynamic binding nao funcionaria
    virtual void desliga();
    virtual ~radio();
    void setEstacao(string);
    void trocarModo();
protected:
    bool ligado;
    string e;
    string modo;
};

#endif

