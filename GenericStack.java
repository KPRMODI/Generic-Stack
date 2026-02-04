import java.util.ArrayList;

/**
 * Lab: GenericStack
 * 
 * A generic stack implementation using ArrayList.
 * Students will implement all methods.
 */
public class GenericStack<E> {
    
    private ArrayList<E> list = new ArrayList<>();
    
    /**
     * Implement this method.
     * Hint: Add the element to the end of the list (top of stack).
     */
    public void push(E element) {
        list.add(element); // add method to add to end of the list
    }
    
    /**
     * Implement this method.
     * Hint: Remove and return the last element (top of stack).
     * Return type is E.
     */
    public E pop() {
        return list.remove(list.size()-1); //removes the last index of the list and returns it
    }
    
    /**
     * Implement this method.
     * Hint: Return the last element without removing it.
     * Return type is E.
     */
    public E peek() {
        return list.get(list.size()-1); //gets the last index of the list and returns it
    }
    
    /**
     * Implement this method.
     * Hint: Return the number of elements in the stack.
     */
    public int getSize() {
        return list.size();
    }
    
    /**
     * Implement this method.
     * Hint: Return true if the stack is empty.
     */
    public boolean isEmpty() {
        if (list.isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }
    
    @Override
    public String toString() {
        return "Stack: " + list.toString();
    }
}