package interfaces;

import java.lang.reflect.Array;
import java.util.*;

public class Main<T extends Comparable<T>>{

    public static void main(String[] args) {

        Integer[] listaNumeros = {4,45,44,47,55,66};


        Generics<Integer> genInt = new Generics<Integer>(listaNumeros);




        System.out.println("Minimum Value: " + genInt.minValue(listaNumeros));
        System.out.println("Minimum Value: " + genInt.maxValue(listaNumeros));

    }
}
