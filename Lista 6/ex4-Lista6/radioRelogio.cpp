
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

void radioRelogio::setAlarme(int h, int m, string e){
    relogio::setAlarme(h,m);
    radio::setEstacao(e);
    cout << "Alarme configurado: " <<  h<< ":" << m << " Estacao: " << e << endl;
}