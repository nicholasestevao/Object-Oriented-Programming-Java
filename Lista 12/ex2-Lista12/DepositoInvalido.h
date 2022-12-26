#ifndef DEPOSITOINVALIDO_H
#define DEPOSITOINVALIDO_H

#include <stdexcept>

using std::runtime_error;

class DepositoInvalido : public runtime_error {
public:
    DepositoInvalido();
    virtual ~DepositoInvalido();
};

#endif /* DEPOSITOINVALIDO_H */