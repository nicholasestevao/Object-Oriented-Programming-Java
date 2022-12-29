
#include <cstdlib>

#include "Pilha.h"

using namespace std;

int main(int argc, char** argv) {
    Pilha<int> p;
    try{
        p.push(1);
        p.push(2);
        p.push(3);
        p.push(4);
        p.pop();
        p.pop();
        p.pop();
        p.pop();
        p.pop();
    }catch(runtime_error e) {
        cout << "Erro: " << e.what() << endl; 
    }
    
    
    return 0;
}

