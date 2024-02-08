public class ReverseArray {
    public static Object[] getReversedArray(Object[] array) {
        Object[] reversedArray = new Object[array.length];
        ArrayStack stack1 = new ArrayStack(array.length);
        for (int i = 0; i < array.length; i++) {
            stack1.push(array[i]);
        }
       /* ArrayStack stack2 = new ArrayStack(array.length);
        while (!stack.isEmpty()) {
            stack2.push(stack.pop());
        }*/
        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = stack1.pop();
        }
        return reversedArray;
    }
}
