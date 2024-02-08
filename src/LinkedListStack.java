import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListStack implements Stack {
    // The LinkedList that will be used to implement the Stack
    private LinkedList<Object> stackList;

    /**
     * Constructor for the LinkedListStack
     */
    public LinkedListStack() {
        stackList = new LinkedList<>();
    }

    /**
     * Removes the item at the top of the stack
     * @return the item stored on top of the stack
     */
    @Override
    public Object pop() {
        if (isEmpty())
            throw new IllegalStateException("List is empty!");
        Object data = stackList.removeFirst();
        return data;

    }

    /**
     * @param data - item to be added to the stack
     */
    @Override
    public void push(Object data) {
        stackList.addFirst(data);
    }

    /**
     * Shows the item on the top of the stack without popping it off the stack
     * @return the data stored on top of the stack without removing it
     */
    @Override
    public Object peek() {
        return stackList.peekFirst();
    }

    /**
     * @return the number of items stored in the stack
     */
    @Override
    public int size() {
        return stackList.size();
    }

    /**
     * @return true is the stack is empty
     */
    @Override
    public boolean isEmpty() {
        return stackList.isEmpty();
    }

    /**
     * Print all the items in the stack
     */
    public void printAll() {
        // Setting the ListIterator
        ListIterator listIter = stackList.listIterator();
        // Iterating through the created list from the position
        while(listIter.hasNext()){
            System.out.println(listIter.next());
        }
    }
}
