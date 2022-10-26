
#include "relogio.h"
#include <iostream>

using namespace std;

relogio::relogio() {
    h = m = hA = mA = 0;
    cout << "Executou contrutor relogio" << endl;
}

void relogio::setHora(int h, int m){
    this->h = h;
    this->m = m;
}

void relogio::setAlarme(int hA, int mA){
    this->hA = hA;
    this->mA = mA;
}

void relogio::mostraHora() const{
    cout<<"Hora atual: " << this->h<< ":" << this->m << endl;
}

void relogio::operator++(){
    if(m< 59){
        m++;
    }else{
        m=0;
        if(h<23){
            h++;
        }else{
            h=0;
        }
    }
    
    if(h==hA && m == mA){
        cout<<"Alarme tocando";
    }
}