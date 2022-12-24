
#include <cstdlib>
#include <iostream>

using namespace std;
#include "Pilha.h"

int main(int argc, char** argv) {

    cout << "Exemplo sem excecao:" << endl;
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
        cout << e.getMensagem() <<endl;
    }catch(PilhaVazia e){
        cout << e.getMensagem() <<endl;
    }
    cout <<endl;
    cout << "Exemplo com excecao pilha cheia:" << endl;
    Pilha p2(3); // cria uma pilha estatica de tamanho 3
    try{
        p2.push(1);
        cout<< "Inseriu "<< 1 <<endl;
        p2.push(2);
        cout<< "Inseriu "<< 2 <<endl;
        p2.push(3);
        cout<< "Inseriu "<< 3 <<endl;
        p2.push(4);
        cout<< "Inseriu "<< 4 <<endl;
        
        cout<< p2.pop() << endl;
        cout<< p2.pop() << endl;
        cout<< p2.pop() << endl;
        
    }catch(PilhaCheia e){
        cout << e.getMensagem() <<endl;
    }catch(PilhaVazia e){
        cout << e.getMensagem() <<endl;
    }
    
    cout <<endl;
    cout << "Exemplo com excecao pilha vazia:" << endl;
    Pilha p3(3); // cria uma pilha estatica de tamanho 3
    try{
        p3.push(1);
        cout<< "Inseriu "<< 1 <<endl;
        p3.push(2);
        cout<< "Inseriu "<< 2 <<endl;
        p3.push(3);
        cout<< "Inseriu "<< 3 <<endl;
        
        cout<< p3.pop() << endl;
        cout<< p3.pop() << endl;
        cout<< p3.pop() << endl;
        cout<< p3.pop() << endl;
        
    }catch(PilhaCheia e){
        cout << e.getMensagem() <<endl;
    }catch(PilhaVazia e){
        cout << e.getMensagem() <<endl;
    }
    
    return 0;
}

