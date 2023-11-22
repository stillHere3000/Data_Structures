/*
 * Author: Trevor Maliro
 * Student ID: 239498690
 * COSC2006LABI23F Lab 9 Queue LinkedList
 * Any and all work in this file is my own.
 * 
 */



public class QueueTest {
    public static void main(String[] args) throws Exception {
            Queue queue = new Queue();
    
            try {
                // Enqueue names
                String[] names = {"Maliro", "Trevor", "Mwale", "Chisomo", "Chikondi", "Mphatso", "Chimwemwe", "Chikumbutso", "TChalla", "Wakanda"};
                for (String name : names) {
                    queue.enqueue(name);
                    System.out.println("Queue after enqueuing " + name + ": " + queue);
                }
                    
                System.out.println("Dequeueing: " + queue.dequeue());
                System.out.println("Queue after dequeue: " + queue);
    
                System.out.println("Dequeueing: " + queue.dequeue());
                System.out.println("Queue after dequeue: " + queue);
    
            } catch (QueueException e) {
                System.err.println(e.getMessage());
            }
        
    }
}
