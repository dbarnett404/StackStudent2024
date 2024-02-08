public interface Stack {
    /**
     * Removes the item at the top of the stack
     * @return the item stored on top of the stack
     */
    public Object pop();

    /**
     * @param data - item to be added to the stack
     */
    public void push(Object data);

    /**
     * Shows the item on the top of the stack without popping it off the stack
     * @return the data stored on top of the stack without removing it
     */
    public Object peek();

    /**
     * @return the number of items stored in the stack
     */
    public int size();

    /**
     * @return true is the stack is empty
     */
    public boolean isEmpty();
}
