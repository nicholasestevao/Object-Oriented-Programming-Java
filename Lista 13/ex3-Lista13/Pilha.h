
#ifndef PILHA_H
#define PILHA_H
#include <deque>
#include <iostream>
#include <stdexcept>

using namespace std;
template <class T> class Pilha {
public:
    Pilha(){
        pilha = new deque<T>();
    }
    void push(T elem);
    T pop();
    virtual ~Pilha(){
        delete pilha;
    }
private:
    deque<T>* pilha;
};

template <class T> void Pilha<T>::push(T elem){
    cout << "Fez push: " << elem << endl;
    pilha->push_back(elem);
}

template <class T> T Pilha<T>::pop(){
    if(pilha->size() > 0){
        T elem = pilha->back();
        pilha->pop_back();
        cout << "Fez pop: " << elem << endl;
        return elem;
    }else{
        throw runtime_error("Pilha vazia");
    }
    
}


#endif /* PILHA_H */

