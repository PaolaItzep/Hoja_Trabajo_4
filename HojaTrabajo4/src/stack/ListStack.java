package stack;

import list.List;

public class ListStack<T> extends AbstractStack<T> {

    private List<T> list;

    public ListStack(List<T> list) {
        this.list = list;
    }

    @Override
    public void push(T item) {
        list.add(item);
        count++;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Pila vacía");
        }

        count--;
        return list.removeLast();
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Pila vacía");
        }

        return list.getLast();
    }
}