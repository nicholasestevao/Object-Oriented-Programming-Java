#include <cstdlib>
#include "Complexo.h"
#include <iostream>

using namespace std;

int main(int argc, char** argv) {
    Complexo a(1,2);
    Complexo b(3,4);
    Complexo c = a+b;
    c.imprime();
    c = a-b;
    c.imprime();
    c = a*b;
    c.imprime();
    double mod = ~a;
    cout << mod << endl;
    return 0;
}

