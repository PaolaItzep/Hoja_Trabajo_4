package stacktest;
import list.SinglyLinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SinglyLinkedListTest {

    @Test
    void addRemoveTest() {

        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();

        list.add(10);
        list.add(20);

        assertEquals(20, list.removeLast());
        assertEquals(10, list.removeLast());
    }
}