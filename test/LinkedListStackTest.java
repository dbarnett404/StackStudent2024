import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class LinkedListStackTest {
    private final String[] testData = {"ant", "bat", "cat", "dog","fly"};
    private final int MAX_STACK = 10;
    private LinkedListStack linkedListStack;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        linkedListStack = new LinkedListStack();
        for (String str: testData) {
            linkedListStack.push(str);
        }
    }

    @org.junit.jupiter.api.Test
    void pop() {
        assertEquals(testData[testData.length - 1], linkedListStack.pop());
    }

    @org.junit.jupiter.api.Test
    void push() {
        String newItem = "gnu";
        linkedListStack.push(newItem);
        assertEquals(newItem, linkedListStack.peek());
    }

    @org.junit.jupiter.api.Test
    void peek() {
        assertEquals(testData[testData.length - 1], linkedListStack.peek());
    }

    @org.junit.jupiter.api.Test
    void isEmpty() {
        assertFalse(linkedListStack.isEmpty());
    }

    @org.junit.jupiter.api.Test
    void size() {
        assertEquals(testData.length, linkedListStack.size());
    }
}