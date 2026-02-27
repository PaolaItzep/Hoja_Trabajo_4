package list;

public class SinglyLinkedList<T> extends AbstractList<T> {

    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node<T> head;

    @Override
    public void add(T item) {
        Node<T> newNode = new Node<>(item);

        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }

        count++;
    }

    @Override
    public T removeLast() {
        if (isEmpty()) {
            throw new RuntimeException("Lista vacía");
        }

        if (head.next == null) {
            T data = head.data;
            head = null;
            count--;
            return data;
        }

        Node<T> current = head;

        while (current.next.next != null) {
            current = current.next;
        }

        T data = current.next.data;
        current.next = null;
        count--;

        return data;
    }

    @Override
    public T getLast() {
        if (isEmpty()) {
            throw new RuntimeException("Lista vacía");
        }

        Node<T> current = head;

        while (current.next != null) {
            current = current.next;
        }

        return current.data;
    }
}