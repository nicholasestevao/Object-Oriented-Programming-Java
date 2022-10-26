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
    rr.setHora(11,00);
    rr.mostraHora();
    rr.liga();
    rr.setAlarme(5,15,"Planeta Brasil");
    rr.trocarModo();
    rr.trocarModo();
    
    return 0;
}

