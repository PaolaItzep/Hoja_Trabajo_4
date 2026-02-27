package list;

public interface List<T> {

    void add(T item);          // agregar al final
    T removeLast();            // remover último
    T getLast();               // obtener último
    boolean isEmpty();
    int size();
}