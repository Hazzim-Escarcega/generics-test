package interfaces;

public class Main<T extends Comparable<T>>{

    public static void main(String[] args) {

        Integer[] listaNumeros = {4,45,44,47,55,66};

        int n1 = listaNumeros[0].intValue();
        int n2 = listaNumeros[0].intValue();
        Generics<Integer> genInt = new Generics<>(listaNumeros);
        Generics<Integer>genSum = new Generics<>(n1, n2);



        System.out.println("Minimum Value: " + genInt.minValue(listaNumeros));
        System.out.println("Minimum Value: " + genInt.maxValue(listaNumeros));

        System.out.println(listaNumeros[0]);
        System.out.println("Product: "+genInt.product(n1, n2));

    }
}
