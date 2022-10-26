#include "radio.h"

using namespace std;

radio::radio() {
    cout << "Executou construtor do radio."<<endl;
    ligado = false; 
    e = "Padrao";
    modo = "AM";
}

void radio::liga(){
    cout << "Radio tocando musica." <<endl;
    ligado = true;
}

void radio::desliga(){
    cout << "Radio mudo." << endl;
    ligado = false;
}

radio::~radio() {
}

void radio::setEstacao(string e){
    this->e = e;
}
void radio::trocarModo(){
    if(this->modo    == "AM"){
        this->modo = "FM";
    }else{
        this->modo = "AM";
    }
    cout << "Modo: " <<this->modo << endl;
}
