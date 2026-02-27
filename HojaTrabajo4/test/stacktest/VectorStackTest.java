package stacktest;

import org.junit.jupiter.api.Test;
import stack.Stack;
import stack.VectorStack;

import static org.junit.jupiter.api.Assertions.*;

class VectorStackTest {

    @Test
    void pushPopTest() {

        Stack<Integer> stack = new VectorStack<>();

        stack.push(10);
        stack.push(20);

        assertEquals(20, stack.pop());
        assertEquals(10, stack.pop());
    }

    @Test
    void isEmptyTest() {

        Stack<Integer> stack = new VectorStack<>();

        assertTrue(stack.isEmpty());

        stack.push(5);

        assertFalse(stack.isEmpty());
    }

    @Test
    void peekTest() {

        Stack<Integer> stack = new VectorStack<>();

        stack.push(100);

        assertEquals(100, stack.peek());
    }
}