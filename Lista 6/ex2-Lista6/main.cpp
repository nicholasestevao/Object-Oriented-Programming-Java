#include <cstdlib>
#include "Complexo.h"
#include <iostream>

using namespace std;

int main(int argc, char** argv) {
    Complexo a(1,2);
    Complexo b(3,5);
    Complexo c = a.soma(&b);
    c.imprime();
    c = a.subtracao(&b);
    c.imprime();
    c = a.multiplicacao(&b);
    c.imprime();
    double mod = a.modulo();
    cout << mod << endl;
    return 0;
}

