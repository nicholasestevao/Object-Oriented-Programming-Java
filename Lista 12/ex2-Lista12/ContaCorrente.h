#ifndef CONTACORRENTE_H
#define CONTACORRENTE_H

#include <mutex>

#include "DepositoInvalido.h"
#include "SaldoInsuficiente.h"

class ContaCorrente {
public:
    ContaCorrente();
    void deposita(int valor);
    void saca(int valor);
    void depositaComBloqueio(int valor);
    void sacaComBloqueio(int valor);
    int getSaldo() const;
    virtual ~ContaCorrente();
private:
    int saldo;
    std::mutex token_bloqueio;
};

#endif /* CONTACORRENTE_H */

