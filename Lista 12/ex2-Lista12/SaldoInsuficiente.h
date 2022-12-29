#ifndef SALDOINSUFICIENTE_H
#define SALDOINSUFICIENTE_H

#include <stdexcept>

using std::runtime_error;

class SaldoInsuficiente : public runtime_error {
public:
    SaldoInsuficiente();
    virtual ~SaldoInsuficiente();
};

#endif /* SALDOINSUFICIENTE_H */