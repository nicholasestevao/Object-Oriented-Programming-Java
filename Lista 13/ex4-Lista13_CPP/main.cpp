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
#include <random>

using namespace std;

int main() {
     srand( (unsigned)time( NULL ) );
    
    time_t t_inicio;
    time_t t_final;
    
    // Teste 1 - vector
    long tamMax_vec = 90000;
    vector<double> v(tamMax_vec);
    t_inicio =   time(NULL);
    for (int i = 0; i < tamMax_vec; i++) {
        v[i] = ((double) rand()/ (double) RAND_MAX) * 10000;
    }
    
    for (int i = 0; i < tamMax_vec; i++) {
        cout << i <<  "° elemento: "  << v[i] << endl;
    }

    for (int i = 0; i < tamMax_vec / 2; i++) {
        double buscado = ((double) rand()/ (double) RAND_MAX) * 10000;
        cout << "Buscando " << buscado << endl;
        for (vector<double>::iterator it = v.begin(); it != v.end(); it++) {
            if ((*it) == buscado) {
                cout << "Encontrou " << buscado << endl;
                break;
            }
        }
    }
    v.clear();

    t_final =   time(NULL);
    time_t t_vector = (t_final - t_inicio);
    
    //=====================================================================================

    // Teste 2 - list
    long tamMax_list = 60000;
    list<double> l;
    t_inicio =   time(NULL);
    for (int i = 0; i < tamMax_list; i++) {
        l.push_back(((double) rand()/ (double) RAND_MAX) * 10000);
    }
    int j = 0;
    for (auto it = l.begin(); it != l.end(); it++) {
        j++;
        cout << j <<  "° elemento: "  << (*it) << endl;
    }
    for (int i = 0; i < tamMax_list / 2; i++) {
        double buscado = ((double) rand()/ (double) RAND_MAX) * 10000;
        cout << "Buscando " << buscado << endl;
        for (list<double>::iterator it = l.begin(); it != l.end(); it++) {
            if ((*it) == buscado) {
                cout << "Encontrou " << buscado << endl;
                break;
            }
        }
    }
    l.clear();
    t_final =   time(NULL);
    time_t t_list = (t_final - t_inicio);
    
    //=====================================================================================

    // Teste 3 - deque
    long tamMax_deque = 90000;
    deque<double> d;
    t_inicio =   time(NULL);
    for (int i = 0; i < tamMax_deque; i++) {
        d.push_back(((double) rand()/ (double) RAND_MAX) * 10000);
    }

    for (int i = 0; i < tamMax_deque; i++) {
        cout << i <<  "° elemento: "  << d.at(i) << endl;
    }
    for (int i = 0; i < tamMax_deque / 2; i++) {
        double buscado = ((double) rand()/ (double) RAND_MAX) * 10000;
        cout << "Buscando " << buscado << endl;
        for (deque<double>::iterator it = d.begin(); it != d.end(); it++) {
            if ((*it) == buscado) {
                cout << "Encontrou " << buscado << endl;
                break;
            }
        }
    }
    d.clear();
    t_final =   time(NULL);
    time_t t_deque = (t_final - t_inicio);

    cout << t_vector  <<  "s para " <<  tamMax_vec << " doubles no vector." <<  endl;
    cout << t_list  <<  "s para " <<  tamMax_list << " doubles no list." <<  endl;
    cout << t_deque  <<  "s para " <<  tamMax_deque << " doubles no deque." <<  endl;
    
    return 0;
}

