package interfaces;

public interface IGenerics<T>{
    T product(int index1, int index2);
    T maxValue(T[] collection);

    T sum(int index1, int index2);

    T minValue(T[] collection);

}
