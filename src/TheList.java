/*
 * Author: Trevor Maliro
 * Student ID: 239498690
 * COSC2006LABI23F Lab 5 Abstract Data Type List
 * Any and all work in this file is my own.
 * 
 */

/**
 * This class contains the TheList methods anfd variables to instantiate a List object. 
 * 
 * @author 
 * @version 
 */
public class TheList {

    private String[] TheList;
    private int numofListElements;

    /**
     * Constructs a TheList object with an initial capacity.
     * Throws a ListException if the icapcacity is less than or equal to zero.
     *
     * @param capacity the default amount in the list
     * @throws ListException if the initial balance is negative or the account number is invalid
     */
    public TheList(int capacity) {
        if (capacity <= 0) {
            throw new ListException("Capacity must be positive and non-zero");
        }
        TheList = new String[capacity];
        numofListElements = 0;
    }

     /**
     * checks if the TheList is empty .
     *
     *    
     * @return the boolean value if the list is empty.
     */
    public boolean isEmpty(){
        return numofListElements == 0;
    }

    /**
     * the number of elements in a TheList object.
     *
     *    
     * @return the number of elements in a TheList object.
     */
    public int size(){
        return numofListElements;
    }


    /**
     * Adds a string value of item at a given index i from the TheList .
     *
     *  @param item The string value to insert 
     *  @param i the the index within the theList   
     * @return a string value of given index i of the TheList object.
     */
    public void add(String item, int i){
        if (i < 0 || i > numofListElements || numofListElements == TheList.length) {
            throw new ListException("Invalid index or list is full");
        }
        for (int j = numofListElements; j > i; j--) {
            TheList[j] = TheList[j-1];
        }
        TheList[numofListElements] = new String (item);
        numofListElements++;
    }

    /**
     * Removes a string value of given index i from the TheList .
     *
     * 
     *  @param i the the index within the theList   
     * @return a string value of given index i of the TheList object.
     */
    public String remove(int i){
        if (i < 0 || i >= numofListElements) {
            throw new ListException("Invalid index");
        }
        String item = TheList[i];

        for (int k=i; k < numofListElements-1; k++){
            TheList[k]= TheList[k+1];

        }
        
        numofListElements--;
        return item; 
    }

    /**
     * Removes all values from the TheList object.
     *
     */
    public void removeAll(){
        for (int i = 0; i < numofListElements; i++) {
            TheList[i] = null;
        }
        numofListElements = 0;
    }

    /**
     * Returns a string value of given index i of the TheList object.
     *
     * 
     *  @param i the the index within the theList   
     * @return a string value of given index i of the TheList object.
     */
    public String get(int i){
        
        if (i < 0 || i >= numofListElements) {
            throw new ListException("Invalid index");
        }
        return TheList[i];
        
    }

    /**
     * Returns a sthen index i of a particular value the TheList object.
     *
     * 
     *  @param i the the index within the theList  or -1 if not found 
     * @return a string value of given index i of the TheList object.
     */
    public int find(String item){
        for (int i = 0; i < numofListElements; i++) {
            if (TheList[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    
    /**
     * Returns a string representation of the TheList object.
     *
     * @return a string representation of the TheList object
     */
    @Override
    public String toString() {
        if (isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numofListElements; i++) {
            sb.append(TheList[i]);
            if (i < numofListElements - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }


}
