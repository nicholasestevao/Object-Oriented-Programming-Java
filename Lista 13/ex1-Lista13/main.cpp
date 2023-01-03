
#include <cstdlib>
#include <iostream>
#include "Par.h"

using namespace std;

int main(int argc, char** argv) {
    Par<int> *p = new Par<int>(1,2);
    cout << "Par 1: int" <<endl;
    cout << "Maximo: " << p->getMax() <<endl;
    cout << "Minimo: "  << p->getMin() <<endl;
    cout << "Soma: "  << p->getSum() <<endl <<endl;
    
    Par<string> *p2 = new Par<string>("Oi ", "tudo bem?");
    cout << "Par 2: string" <<endl;
    cout << "Maximo: "  << p2->getMax() <<endl;
    cout << "Minimo: "  << p2->getMin() <<endl;
    cout << "Soma: "  << p2->getSum() <<endl;
    
    return 0;
}

