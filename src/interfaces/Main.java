package interfaces;

import java.util.Arrays;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Integer[] listaNumeros = new Integer[5];
        Scanner sc = new Scanner (System.in);
        try {
            System.out.println("Enter the elements of the array: ");
            for(int i=0; i<listaNumeros.length; i++)
            {
                listaNumeros[i] = sc.nextInt();
            }
        }catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }




        Generics<Integer> genInt = new Generics<>(listaNumeros);
        Generics<Integer> generics = new Generics<>();
        System.out.println("\"Select a number of the list for factorial calculation\n"+Arrays.asList(listaNumeros));
        int fact = sc.nextInt();
        boolean factIsInList = Arrays.asList(listaNumeros).contains(fact);
        while(factIsInList == false){
            System.out.println("\"The selected number is not on the list, please select a number from the list\n"+Arrays.asList(listaNumeros));
            fact = sc.nextInt();
            factIsInList = Arrays.asList(listaNumeros).contains(fact);
        }




        System.out.println("Minimum Value: " + genInt.minValue(listaNumeros));
        System.out.println("Max Value: " + genInt.maxValue(listaNumeros));
        System.out.println("Factorial Value: " + generics.factorial(fact));
        System.out.println("Prime numbers on list: " + genInt.prime(listaNumeros));
        System.out.println("\"Select two numbers on the list for sum calculation\n"+Arrays.asList(listaNumeros));
        System.out.println("Number one");
        int n1 = sc.nextInt();
        System.out.println("Number two");
        int n2 = sc.nextInt();
        boolean n1IsInList = Arrays.asList(listaNumeros).contains(n1);
        boolean n2IsInList = Arrays.asList(listaNumeros).contains(n2);
        while(n1IsInList == false || n2IsInList == false){
            System.out.println("\"One of the selected numbers is not on the list, please select two numbers from the list\n"+Arrays.asList(listaNumeros));
            System.out.println("Number one");
            n1 = sc.nextInt();
            System.out.println("Number two");
            n2 = sc.nextInt();
            n1IsInList = Arrays.asList(listaNumeros).contains(n1);
            n2IsInList = Arrays.asList(listaNumeros).contains(n2);
        }
        System.out.println("Sum of values "+n1+" and "+n2+" equals to: "+generics.sum(n1, n2));
        System.out.println("Product of values "+n1+" and "+n2+" equals to: "+generics.product(n1, n2));


    }
}
