package interfaces;

public class Generics<T extends Comparable<T>> implements IGenerics<T>{
    //Arreglo de tipo T
    T[] collection;

    //constructor
    public Generics(T[] obj){
        collection = obj;
    }




    @Override
    public T minValue(T collection) {

        T o1 = this.collection[0];

        for (int i = 1; i< this.collection.length; i++){
            if (this.collection[i].compareTo(o1)< 0){
                o1 = this.collection[i];
            }
        }
        return o1;
    }

    @Override
    public T sum(int index1, int index2) {
        return null;
    }

    @Override
    public T product(int index1, int index2) {
        return null;
    }

    @Override
    public T maxValue(T collection) {
        T o1 = this.collection[0];

        for (int i = 1; i< this.collection.length; i++){
            if (this.collection[i].compareTo(o1)> 0){
                o1 = this.collection[i];
            }
        }
        return o1;
    }


}
