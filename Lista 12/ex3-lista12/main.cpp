
#include <cstdlib>
#include <iostream>

using namespace std;
#include "Pilha.h"

int main(int argc, char** argv) {

    Pilha p(3); // cria uma pilha estatica de tamanho 3
    try{
        p.push(1);
        cout<< "Inseriu "<< 1 <<endl;
        p.push(2);
        cout<< "Inseriu "<< 2 <<endl;
        p.push(3);
        cout<< "Inseriu "<< 3 <<endl;
        
        cout<< p.pop() << endl;
        cout<< p.pop() << endl;
        cout<< p.pop() << endl;
        
    }catch(PilhaCheia e){
        cout << e.getMensagem();
    }catch(PilhaVazia e){
        cout << e.getMensagem();
    }
    
    return 0;
}

