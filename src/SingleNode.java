/*
 * Author: Trevor Maliro
 * Student ID: 239498690
 * COSC2006LABI23F Lab 9 Queue LinkedList
 * Any and all work in this file is my own.
 * 
 */

/**
 * This class contains the SingleNode. 
 * It is a single linked list implementation.
 * @author 
 * @version 
 */
public class SingleNode {
   
   
   protected String item; // The item in the node
   protected SingleNode next; // The reference to the next node

   // Constructor with only the item
   public SingleNode(String item) {
       this.item = item;
       this.next = null; // Next is initially set to null
   }

   // Constructor with both the item and the next node
   public SingleNode(String item, SingleNode next) {
       this.item = item;
       this.next = next;
   }
}
