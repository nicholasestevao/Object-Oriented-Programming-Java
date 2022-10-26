
#ifndef RELOGIO_H
#define RELOGIO_H

class relogio {
public:
    relogio();
    void setHora(int, int);
    virtual void setAlarme(int, int);
    void mostraHora() const;
    void operator++();
    //Nao precisa de destrutor virtual pois a reimplementacao de metodos do relogio nao é prevista
private:
    int h;
    int m;
    int s;
    int hA;
    int mA;
};

#endif

