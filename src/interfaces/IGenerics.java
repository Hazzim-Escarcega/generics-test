package interfaces;

public interface IGenerics<T>{
    T product(Integer index1, Integer index2);
    T maxValue(T[] collection);

    T sum(Integer index1, Integer index2);

    T minValue(T[] collection);


}
