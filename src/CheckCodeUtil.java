public class CheckCodeUtil implements CheckCode {
    /**
     * Uses regex to remove all whitespace from a String
     */
    public String removeWhiteSpace(String code) {
        return code.replaceAll("\\s", "");
    }

    /**
     * A valid bit pattern can only have two repeating adjacent characters
     * Create a method that checks that a code is valid
     *
     * @param code
     * @return
     */
    public boolean checkBitPattern(String code) {
        int count = 0;
        code = removeWhiteSpace(code);
        return true;
    }

    /*
         A valid code has a symmetrical bit pattern This means that the first half of the bits in the code are the reverse
         of the second half of the bits in the code.
         For example, the code 110011 is symmetrical because the first half (110) is the reverse of the second half (011).
         The code 101100 is not symmetrical because the first half (101) is not the reverse of the second half (100).
         Write a method to determine if a code is symmetrical.
         Use a stack for this implementation.
         */
    public boolean isSymmetrical(String code) {
        code = removeWhiteSpace(code);
        return true;
    }
}
