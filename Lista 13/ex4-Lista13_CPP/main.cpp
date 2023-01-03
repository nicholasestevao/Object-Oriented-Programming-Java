/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.cpp
 * Author: isaac
 *
 * Created on 3 de Janeiro de 2023, 14:14
 */

#include <iostream>
#include <deque>
#include<iterator>
#include <list>
#include <ctime>
#include <vector>

using namespace std;

int main() {
    srand( (unsigned)time( NULL ));
    
    time_t t_inicio;
    time_t t_final;
    
    // Teste 1 - vector
    long tamMax_vec = 90000;
    vector<double> *v = new vector<double>(tamMax_vec);
    t_inicio =   time(NULL);
    for (int i = 0; i < tamMax_vec; i++) {
        (*v)[i] = ((double) rand()/ (double) rand());
    }
    
    for (int i = 0; i < tamMax_vec; i++) {
        cout << i <<  "° elemento: "  << (*v)[i] << endl;
    }

    for (int i = 0; i < tamMax_vec / 2; i++) {
        double buscado = ((double) rand()/ (double) rand());
        cout << "Buscando " << buscado << endl;
        for (int j = 0; j < tamMax_vec; j++) {
            if ((*v)[j] == buscado) {
                cout << "Encontrou " << buscado << endl;
                break;
            }
        }
    }
    v->clear();

    t_final = time(NULL);
    time_t t_vector = (t_final - t_inicio);
    
    //=====================================================================================

    // Teste 2 - list
    long tamMax_list = 60000;
    list<double> *l = new list<double>();
    t_inicio =   time(NULL);
    for (int i = 0; i < tamMax_list; i++) {
        l->push_back((double) rand()/ (double) rand());
    }
    int j = 0;
    for (list<double>::iterator it = l->begin(); it != l->end(); it++) {
        j++;
        cout << j <<  "° elemento: "  << (*it) << endl;
    }
    for (int i = 0; i < tamMax_list / 2; i++) {
        double buscado = ((double) rand()/ (double) rand());
        cout << "Buscando " << buscado << endl;
        for (list<double>::iterator it = l->begin(); it != l->end(); it++) {
            if ((*it) == buscado) {
                cout << "Encontrou " << buscado << endl;
                break;
            }
        }
    }
    l->clear();
    t_final = time(NULL);
    time_t t_list = (t_final - t_inicio);
    
    //=====================================================================================

    // Teste 3 - deque
    long tamMax_deque = 90000;
    deque<double> *d = new deque<double>();
    t_inicio = time(NULL);
    for (int i = 0; i < tamMax_deque/2; i++) {
        d->push_front((double) rand()/ (double) rand());
    }
    j = 0;
    for (deque<double>::iterator it = d->begin(); it != d->end(); it++) {
        j++;
        cout << j <<  "° elemento: "  << (*it) << endl;
    }
    for (int i = 0; i < tamMax_deque / 2; i++) {
        double buscado = ((double) rand()/ (double) rand());
        cout << "Buscando " << buscado << endl;
        for (deque<double>::iterator it = d->begin(); it != d->end(); it++) {
            if ((*it) == buscado) {
                cout << "Encontrou " << buscado << endl;
                break;
            }
        }
    }
    d->clear();
    t_final = time(NULL);
    time_t t_deque = (t_final - t_inicio);

    cout << t_vector  <<  "s para " <<  tamMax_vec << " doubles no vector." <<  endl;
    cout << t_list  <<  "s para " <<  tamMax_list << " doubles no list." <<  endl;
    cout << t_deque  <<  "s para " <<  tamMax_deque << " doubles no deque." <<  endl;
    
    return 0;
}

