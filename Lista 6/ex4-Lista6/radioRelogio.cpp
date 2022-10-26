
#include "radioRelogio.h"

radioRelogio::radioRelogio() : radio(), relogio(){
    cout << "Executou construtor do radio relogio" <<endl;
}

void radioRelogio::liga(){
    cout << "Tocando e mostrando a hora..." <<endl;
    ligado = true;
}

void radioRelogio::desliga(){
    cout << "Mudo e mostrando a hora..." <<endl;
    ligado = false;
}

void radioRelogio::setAlarme(int h, int m){
    relogio::setAlarme(h,m);
    e = "Clube FM";
}