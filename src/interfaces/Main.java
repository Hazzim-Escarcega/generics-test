package interfaces;

import java.lang.reflect.Array;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
         arr[] = {1,12,75};

        Generics<T> genInt = new Generics<T>(arr);

        System.out.println("Minimum Value: " + genInt.minValue());
        System.out.println("Minimum Value: " + genInt.maxValue());

    }
}
