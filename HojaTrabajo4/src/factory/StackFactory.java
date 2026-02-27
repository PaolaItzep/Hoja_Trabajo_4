package factory;

import list.DoublyLinkedList;
import list.SinglyLinkedList;
import stack.ArrayListStack;
import stack.ListStack;
import stack.Stack;
import stack.VectorStack;

public class StackFactory {

    // Singleton: única instancia
    private static StackFactory instance;

    // Constructor privado
    private StackFactory() {}

    // Método para obtener la instancia única
    public static StackFactory getInstance() {
        if (instance == null) {
            instance = new StackFactory();
        }
        return instance;
    }

    // Método Factory principal
    public <T> Stack<T> getStack(String tipo, String tipoLista) {

        switch (tipo.toLowerCase()) {

            case "vector":
                return new VectorStack<>();

            case "arraylist":
                return new ArrayListStack<>();

            case "lista":

                if (tipoLista == null) {
                    throw new IllegalArgumentException("Debe especificar tipo de lista (simple/doble)");
                }

                switch (tipoLista.toLowerCase()) {

                    case "simple":
                        return new ListStack<>(new SinglyLinkedList<>());

                    case "doble":
                        return new ListStack<>(new DoublyLinkedList<>());

                    default:
                        throw new IllegalArgumentException("Tipo de lista no válido");
                }

            default:
                throw new IllegalArgumentException("Tipo de stack no válido");
        }
    }
}