package list;

public class DoublyLinkedList<T> extends AbstractList<T> {

    private static class Node<T> {
        T data;
        Node<T> next;
        Node<T> prev;

        Node(T data) {
            this.data = data;
        }
    }

    private Node<T> head;
    private Node<T> tail;

    @Override
    public void add(T item) {

        Node<T> newNode = new Node<>(item);

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        count++;
    }

    @Override
    public T removeLast() {

        if (isEmpty()) {
            throw new RuntimeException("Lista vacía");
        }

        T data = tail.data;

        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }

        count--;
        return data;
    }

    @Override
    public T getLast() {

        if (isEmpty()) {
            throw new RuntimeException("Lista vacía");
        }

        return tail.data;
    }
}