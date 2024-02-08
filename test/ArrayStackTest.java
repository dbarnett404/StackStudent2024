import static org.junit.jupiter.api.Assertions.*;

class ArrayStackTest {
    private final String[] testData = {"ant", "bat", "cat", "dog","fly"};
    private final int MAX_STACK = 10;
    private ArrayStack arrayStack;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        arrayStack = new ArrayStack(MAX_STACK);
        for (String str: testData) {
            arrayStack.push(str);
        }
    }

    @org.junit.jupiter.api.Test
    void pop() {
        assertEquals(testData[testData.length - 1], arrayStack.pop());
    }

    @org.junit.jupiter.api.Test
    void push() {
        String newItem = "gnu";
        arrayStack.push(newItem);
        assertEquals(newItem, arrayStack.peek());
    }

    @org.junit.jupiter.api.Test
    void peek() {
        assertEquals(testData[testData.length - 1], arrayStack.peek());
    }

    @org.junit.jupiter.api.Test
    void isEmpty() {
        assertFalse(arrayStack.isEmpty());
    }

    @org.junit.jupiter.api.Test
    void size() {
        assertEquals(testData.length, arrayStack.size());
    }
}