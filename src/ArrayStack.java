import java.util.Arrays;

public class ArrayStack implements Stack{
    //the array of items
    private Object[] items;
    //maximum capacity
    private int maxSize;
    //indicates the top of the stack set to -1 when the stack is empty
    private int topIndex;
    
    public ArrayStack(int maxSize){
        this.maxSize = maxSize;
        //create the array
        items = new Object[maxSize];
        //set the top to -1 as the stack is empty
        topIndex = -1;
    }

    /**
     * pop an item from the top of the ArrayStack
     */
    @Override
    public Object pop() {
        // Return the item the top is pointing to
        Object answer = peek();
        // Decrement the top pointer
        topIndex--;
        return answer;
    }

    /**
     * push an item onto the top of the ArrayStack
     */
    @Override
    public void push(Object object) {
        // Check if the array is full.
        if (topIndex == (maxSize - 1))
            throw new IllegalStateException("Stack full");
        // Increment the top and put the item in that space
        topIndex++;
        // Put the item in the space
        items[topIndex] = object;
    }

    @Override
    public Object peek() {
        if (isEmpty())
            throw new IllegalStateException("List is empty!");
        // Return the item the top is pointing to.
        return items[topIndex];
    }

    /**
     * Check items are on the stack
     * @return true if top == -1
     */
    @Override
    public boolean isEmpty() {
        return (topIndex == -1);
    }

    /**
     * Size of the stack will be one more than the top index
     * @return size of the stack
     */
    @Override
    public int size() {
        return(topIndex + 1);
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = topIndex; i >= 0; i--) {
            result+= items[i];
        }
        return result;
    }
}
 