/*
 * Author: Trevor Maliro
 * Student ID: 239498690
 * COSC2006LABI23F Lab 5 Abstract Data Type List
 * Any and all work in this file is my own.
 * 
 */


 /**
 * This class contains the main method to test the TheList class. 
 * It tests creating a List with a valid index , 
 * adding and removing from the list, 
 * and handling errors such as outofbound indexes, null pointers .
 * @author 
 * @version 
 */
public class ListTest {
    

    public static void main(String[] args) {
        try {
            TheList list = new TheList(10); // Assuming a list of size 10

            // Adding items and printing the list
            String[] items = {"Milk", "Eggs", "Celery", "Bananas", "Apples", "Oranges", "Cookies", "Steak"};
            for (String item : items) {
                list.add(item, list.size());
                System.out.println("List after adding " + item + ": " + list);
            }

            // // Removing items and printing the list
            int x= list.find("Celery");
            list.remove(x);
            System.out.println("List after removing Celery: " + list);
            x= list.find("Oranges");
            list.remove(x);
            System.out.println("List after removing Oranges: " + list);

            //swapping elements
            swap(list, 4, 5);
            System.out.println("List after swapping Cookies and Steak: " + list);

        } catch (ListException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    public static void swap(TheList list, int i, int j) {
        if (i < 0 || j < 0 || i >= list.size() || j >= list.size()) {
            throw new ListException("Invalid index for swap operation");
        }
        String temp = list.get(i);
        list.add(list.remove(j), i);
        list.add(temp, j);        
    }
    
    
}
