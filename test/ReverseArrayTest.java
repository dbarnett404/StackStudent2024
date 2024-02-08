import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseArrayTest {

    @Test
    void getReversedArray() {
        ReverseArray reverseArray = new ReverseArray();
        Object[] array = {1, 2, 3, 4, 5};
        Object[] reversedArray = {5, 4, 3, 2, 1};
        assertArrayEquals(reversedArray, reverseArray.getReversedArray(array));
    }
}