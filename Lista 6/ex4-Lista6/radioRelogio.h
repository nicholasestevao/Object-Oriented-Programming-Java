
#ifndef RADIORELOGIO_H
#define RADIORELOGIO_H
#include "radio.h"
#include "relogio.h"
#include <iostream>
using namespace std;

class radioRelogio : public radio, public relogio {
public:
    radioRelogio();
    void liga();
    void desliga();
    void setAlarme(int, int, string);

};
#endif

