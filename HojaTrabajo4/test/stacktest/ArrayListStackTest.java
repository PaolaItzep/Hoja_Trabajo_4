package stacktest;
import org.junit.jupiter.api.Test;
import stack.ArrayListStack;
import stack.Stack;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListStackTest {

    @Test
    void pushPopTest() {

        Stack<Integer> stack = new ArrayListStack<>();

        stack.push(1);
        stack.push(2);

        assertEquals(2, stack.pop());
        assertEquals(1, stack.pop());
    }
}