
#ifndef PAR_H
#define PAR_H

template <class T> class Par {
public:
    Par(T v1, T v2){
        valor1 = v1;
        valor2 = v2;
    };
    virtual ~Par(){};
    T getMin();
    T getMax();
    T getSum();
private:
    T valor1;
    T valor2;
};


template <class T> T Par<T>::getMin(){
    if(valor1 > valor2){
        return valor2;
    }else{
        return valor1;
    }
}

template <class T> T Par<T>::getMax(){
    if(valor1 < valor2){
        return valor2;
    }else{
        return valor1;
    }
}

template <class T> T Par<T>::getSum(){
    return valor1+valor2;
}

#endif /* PAR_H */

