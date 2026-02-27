package stacktest;
import list.DoublyLinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoublyLinkedListTest {

    @Test
    void addRemoveTest() {

        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();

        list.add(10);
        list.add(20);

        assertEquals(20, list.removeLast());
        assertEquals(10, list.removeLast());
    }
}