

#ifndef PILHAEXCECAO_H
#define PILHAEXCECAO_H

#include <string>
using namespace std;

class PilhaExcecao {
public:
    PilhaExcecao(string mensagem);
    virtual ~PilhaExcecao();
    string getMensagem();
private:
    string mensagem;
};

#endif /* PILHAEXCECAO_H */

