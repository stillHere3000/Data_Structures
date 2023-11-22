/*
 * Author: Trevor Maliro
 * Student ID: 239498690
 * COSC2006LABI23F Lab 9 Queue LinkedList
 * Any and all work in this file is my own.
 * 
 */

/**
 * Represents a queue data structure implemented using a linked list.
 */
public class Queue {
    private SingleNode head; // Head node of the list

    /**
     * Constructs an empty queue.
     */
    public Queue(){
        this.head= null;
    }

    /**
     * Checks if the queue is empty.
     * 
     * @return true if the queue is empty, false otherwise
     */
    public boolean isEmpty(){
        return head == null;
    }

    /**
     * Adds an item to the end of the queue.
     * 
     * @param item the item to be added to the queue
     */
    public void enqueue(String item){
        SingleNode newNode = new SingleNode(item);
        if (head == null) {
            head = newNode;
        } else {
            SingleNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    /**
     * Removes an item from the front of the queue.
     * 
     * @return the item removed from the queue
     * @throws QueueException if the queue is empty
     */
    public String dequeue(){
        if (head == null) throw new QueueException("Empty list");
        String item = head.item;
        head = head.next;
        return item;
    }

    /**
     * Removes all items from the queue.
     */
    public void dequeueAll(){
        head = null;
    }

    /**
     * Returns the item at the front of the queue without removing it.
     * 
     * @return the item at the front of the queue
     * @throws QueueException if the queue is empty
     */
    public String peek(){
        if (head == null) throw new QueueException("Empty list");
        return head.item;
    }

    /**
     * Returns the number of items in the queue.
     * 
     * @return the number of items in the queue
     */
    public int size(){
        int count = 0;
        SingleNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    /**
     * Returns a string representation of the queue.
     * 
     * @return a string representation of the queue
     */
    public String toString(){
        String str = "";
        SingleNode current = head;
        while (current != null) {
            str += current.item + " ";
            current = current.next;
        }
        return str;
    }
}
