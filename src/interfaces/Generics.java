package interfaces;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Generics<T extends Comparable<T>> implements IGenerics<T> {
    //Arreglo de tipo T
    T[] collection;

    //constructor
    public Generics(T[] obj) {
        collection = obj;
    }




    public Generics() {
    }

    @Override
    public T sum(Integer index1, Integer index2) {
        Integer res =  index1 + index2;
        return (T) res;
    }

    @Override
    public T minValue(T[] collection) {
        T o1 = this.collection[0];

        for (int i = 1; i < this.collection.length; i++) {
            if (this.collection[i].compareTo(o1) < 0) {
                o1 = this.collection[i];
            }
        }
        return o1;
    }
    @Override
    public T product(Integer index1, Integer index2) {
        Integer res =  index1 * index2;
        return (T) res;
    }

    @Override
    public T maxValue(T[] collection) {
        T o1 = this.collection[0];

        for (int i = 1; i < this.collection.length; i++) {
            if (this.collection[i].compareTo(o1) > 0) {
                o1 = this.collection[i];
            }
        }
        return o1;
    }
    public long factorial(int index1){
       int n = index1;
       long factorial = 1;

       for(int i = 1; i <= n; ++i){
           factorial *= i;
       }


        return factorial;
    }
    public List<Integer> prime(T[] collection){
        List<T> listaNumeros = Arrays.asList(collection);
        List<Integer> primeNumbers = new ArrayList<>();
            listaNumeros.forEach(element -> {
                boolean isPrime = true;
                int number = Integer.valueOf((Integer) element);
                //Caso 1
                if(number <= 1){
                    isPrime = false;
                }
                //Caso 2 y 3
                if(number == 2 || number == 3){
                    isPrime = true;
                    primeNumbers.add(Integer.valueOf(number));
                }
                //Numero divisible entre 2 y 3
                if (number % 2 == 0 || number % 3 == 0){
                    isPrime = false;
                }
                // Otros numeros empezando en 5 hasta la raiz cuadrada de n
                for(int i = 5; i <= Math.sqrt(number); i = i+6){
                    if(number % i == 0 || number % (i+2) == 0){
                        isPrime = false;
                    }
                }
                if(isPrime == true){
                    primeNumbers.add(Integer.valueOf(number));
                }


            });





        return primeNumbers;
    }

}
