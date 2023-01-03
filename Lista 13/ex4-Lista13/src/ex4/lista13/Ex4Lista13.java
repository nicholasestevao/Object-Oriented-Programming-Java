package ex4.lista13;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;



public class Ex4Lista13 {

    public static void main(String[] args) {
        
        Random r = new Random();
        long t_inicio;
        long t_final;

        // Teste 1 - Array List
        long tamMax = 90000;
        ArrayList<Double> al = new ArrayList();
        t_inicio = System.currentTimeMillis();
        for(int i = 0; i< tamMax; i++){
           al.add(r.nextDouble()*10000);
        }
        for(int i = 0; i< tamMax; i++){
            System.out.println((i+1) + "° elemento: "+ al.get(i));
        }
        for(int i = 0; i< tamMax/2; i++){
           double buscado = r.nextDouble()*10000;
           System.out.println("Buscando "+ buscado);
           for(int j = 0; j< tamMax; j++){
               if(al.get(j) == buscado){
                   System.out.println("Encontrou "+ buscado);
                   break;
               }
           }
        }
        for(long i = tamMax-1; i>=0; i--){
            al.remove((int) i);
        }
        t_final = System.currentTimeMillis();
        long t_array_list = (t_final - t_inicio)/1000;
        System.out.println((t_final - t_inicio)/1000 + "s para " + tamMax + " doubles no ArrayList.");
        
        
        // Teste 2 - Linked List
        tamMax = 60000;
        LinkedList<Double> ll = new LinkedList();
        t_inicio = System.currentTimeMillis();
        for(int i = 0; i< tamMax; i++){
           ll.addLast(r.nextDouble()*10000);
        }
        Iterator itll = ll.iterator();
        int i = 0;
        while (itll.hasNext()) {
            System.out.println((i+1) + "° elemento: "+ itll.next());
            i++;
        }
        for(i = 0; i< tamMax/2; i++){
           double buscado = r.nextDouble()*10000;
           System.out.println("Buscando "+ buscado);
           itll = ll.iterator();
            int j = 0;
            while (itll.hasNext()) {
                double atual = (double) itll.next();
                if(buscado == atual){
                    System.out.println("Encontrou " + buscado);
                    break;
                }
                j++;
            }
        }
        itll = ll.iterator();
         while (itll.hasNext()) {
            itll.next();
            itll.remove();
        }
        t_final = System.currentTimeMillis();
        long t_linked_list = (t_final - t_inicio)/1000;
        System.out.println((t_final - t_inicio)/1000 + "s para " + tamMax + " doubles na LinkedList.");
        
        
        // Teste 3 - Array Deque
        tamMax = 90000;
        ArrayDeque<Double> ad = new ArrayDeque();
        t_inicio = System.currentTimeMillis();
        for(i = 0; i< tamMax/2; i++){
           ad.addFirst(r.nextDouble()*10000);
           ad.addLast(r.nextDouble()*10000);
        }
        Iterator it = ad.iterator();
        i = 0;
        while (it.hasNext()) {
            System.out.println((i+1) + "° elemento: "+ it.next());
            i++;
        }
        
        for( i = 0; i< tamMax/2; i++){
            double buscado = r.nextDouble()*10000;
            System.out.println("Buscando "+ buscado);
            it = ad.iterator();
            int j = 0;
            while (it.hasNext()) {
                double atual = (double) it.next();
                if(buscado == atual){
                    System.out.println("Encontrou " + buscado);
                    break;
                }
                j++;
            }
        }
        it = ad.iterator();
         while (it.hasNext()) {
            it.next();
            it.remove();
        }
        t_final = System.currentTimeMillis();
        long t_array_deque = (t_final - t_inicio)/1000;
        System.out.println((t_final - t_inicio)/1000 + "s para " + tamMax + " doubles no ArrayDeque.");
        System.out.println("Array List: " + t_array_list + "s");
        System.out.println("Linked List: " + t_linked_list + "s");
        System.out.println("Array Deque: " + t_array_deque + "s");
    }
    
}
