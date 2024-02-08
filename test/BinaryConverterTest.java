import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryConverterTest {

    @Test
    void getNumBaseStr() {
        BinaryConverter binaryConverter = new BinaryConverter();
        assertEquals("1100", binaryConverter.getNumBaseStr1(12, 2));
        assertEquals("110", binaryConverter.getNumBaseStr1(12, 3));
        assertEquals("14", binaryConverter.getNumBaseStr1(12, 8));
        assertEquals("C", binaryConverter.getNumBaseStr1(12, 16));
    }

    @Test
    void getNumBaseStr2() {
        BinaryConverter binaryConverter = new BinaryConverter();
        assertEquals("1100", binaryConverter.getNumBaseStr2(12, 2));
        assertEquals("110", binaryConverter.getNumBaseStr2(12, 3));
        assertEquals("14", binaryConverter.getNumBaseStr2(12, 8));
        assertEquals("C", binaryConverter.getNumBaseStr2(12, 16));
    }
}