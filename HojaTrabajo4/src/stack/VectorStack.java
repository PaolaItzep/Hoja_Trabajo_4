package stack;

import java.util.Vector;

public class VectorStack<T> extends AbstractStack<T> {

    private Vector<T> vector = new Vector<>();

    @Override
    public void push(T item) {
        vector.add(item);
        count++;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Pila vacía");
        }
        count--;
        return vector.remove(count);
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Pila vacía");
        }
        return vector.get(count - 1);
    }
}