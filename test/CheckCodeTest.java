import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckCodeTest {
    @Test
    void checkBitPattern() {
        CheckCode checkCodeUtil = new CheckCodeUtil();
        assertFalse(checkCodeUtil.checkBitPattern("00 00 00 00"));
        assertTrue(checkCodeUtil.checkBitPattern("01 01 01 01"));
        assertTrue(checkCodeUtil.checkBitPattern("00 11 00 11"));
        assertFalse(checkCodeUtil.checkBitPattern("11 10 01 11"));
    }

    @Test
    void isSymmetrical() {
        CheckCode checkCodeUtil = new CheckCodeUtil();
        assertTrue(checkCodeUtil.isSymmetrical("00 00 00 00"));
        assertTrue(checkCodeUtil.isSymmetrical("01 01 10 10"));
        assertTrue(checkCodeUtil.isSymmetrical("10 00 00 01"));
        assertFalse(checkCodeUtil.isSymmetrical("00 11 01 01"));
        assertTrue(checkCodeUtil.isSymmetrical("11 10 01 11"));
    }
}