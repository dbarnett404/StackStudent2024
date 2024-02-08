public class BinaryConverter {

    private String getLetter(int num) {
        return switch (num) {
            case 10 -> "A";
            case 11 -> "B";
            case 12 -> "C";
            case 13 -> "D";
            case 14 -> "E";
            case 15 -> "F";
            default -> "" + num;
        };
    }
    public String getNumBaseStr1(int num, int base) {
        String result = "";
        while (num > 0) {
            int remainder = num % base;
            result = getLetter(remainder) + result;
            num = num / base;
        }
        return result;
    }

    public String getNumBaseStr2(int num, int base) {
        ArrayStack stack = new ArrayStack(32);
        String result = "";
        while (num > 0) {
            int remainder = num % base;
            stack.push(remainder);
            //result = getLetter(remainder) + result;
            num = num / base;
        }
        while (!stack.isEmpty()) {
            result += getLetter((int) stack.pop());
        }
        return result;
    }
    public static String getBinaryString(int num) {
        // Create a stack
        Stack stack = new ArrayStack(32);
        // Loop through the number and push each bit onto the stack
        for (int i = 0; i < 32; i++) {
            stack.push(num & 1);
            num = num >> 1;
        }
        // Create a string builder
        StringBuilder sb = new StringBuilder();
        // Loop through the stack and pop each bit off and append it to the string builder
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        // Return the string
        return sb.toString();
    }
}
