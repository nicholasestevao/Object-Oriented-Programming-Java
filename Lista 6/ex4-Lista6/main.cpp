#include <cstdlib>
#include "radioRelogio.h"
#include "radio.h"
#include "relogio.h"


int main(int argc, char** argv) {
    relogio re;
    re.setHora(10,00);
    re.mostraHora();
    ++re;
    re.mostraHora();
    
    radio ra;
    ra.liga();
    ra.trocarModo();
    ra.desliga();
    
    radioRelogio rr;
    rr.setHora(11,0);
    rr.mostraHora();
    rr.liga();
    rr.setAlarme(11,1,"Planeta Brasil");
    ++rr;
    rr.trocarModo();
    rr.trocarModo();
    
    return 0;
}

