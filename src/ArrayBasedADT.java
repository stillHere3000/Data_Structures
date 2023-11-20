/*
 * Author: Trevor Maliro
 * Student ID: 239498690
 * COSC2006LABI23F Lab 8 ArrayBased ADT
 * Any and all work in this file is my own.
 * 
 */


 /**
 * This class contains a ArrayBased ADT . 
 * It extends the Runtime Exception and gives an error message if a logic error has occurred.
 * and handling errors such as outofbound indexes, null pointers .
 * 
 * Create an array-based stack to hold characters. Implement the following methods:
 * boolean isEmpty(), void push(char item), char pop(), void popAll() and char peek().
 * @author 
 * @version 
 */
public class ArrayBasedADT {
    private char[] allChars;
    private int top;    
    
    public ArrayBasedADT(int count){
        if(count<=0 ){
            throw new ListException("Cannot create a list with negative size or zero");
        }
        this.allChars= new char[count];
        top = -1;
    }

    /**
     * checks if the ArrayBased ADT is empty .
     * 
     * @return the boolean value if the list is empty.
     */
    public boolean isEmpty(){
        return top == -1;
    }

    /**
     * the number of elements in a ArrayBased ADT object.
     * 
     * @return the number of elements in a Char object.
     */
    public int size(){
        int count = 0;
        char current = allChars[count];
        while (current != 0) {
            count++;
            current = allChars[count];
        }
        return count;    
    }

    /**
     * Inserts a string value of item .
     *
     *  @param item The string value to insert 
     */
    public void push(char item) {
        if (top == allChars.length - 1) {
            throw new ListException("Stack overflow");
        }
        allChars[++top] = item;
    }

    /**
     * Removes the last item in the array.
     * 
     * @return the last item in the array.
     */
    public char pop() {
       if (isEmpty()) {
            throw new ListException("Stack underflow");
        }

        return allChars[top--];
    }

    /**
     * Removes all items in the array.
     * 
     */
    public void popAll() {
        allChars = null;
        top = -1;
    }

    /**
     * Returns the last item in the array.
     * 
     * @return the last item in the array.
     */
    public char peek() {
        if (isEmpty()) {
            throw new ListException("Stack is empty");
        }
        return allChars[allChars.length - 1];
    }

    /**
     * Returns the string representation of the array.
     * 
     * @return the string representation of the array.
     */
    public String toString() {
        String result = "";
        for (int i = 0; i < allChars.length; i++) {
            result += allChars[i];
        }
        return result;
    }

    
}
