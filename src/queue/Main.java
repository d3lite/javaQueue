/* Queue Assignment
 * CSCI 211
 * @authro David Seng
 * Last modified on 11/29/2015
 */
package queue;
import java.util.*;
import java.io.*;
/**
 *
 * @author David
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
       // create new queue   
       QueueClass myQueue = new QueueClass();
        // create scanner
        Scanner kb = new Scanner(System.in);  
        
       System.out.println("Empty status: "+ myQueue.emptyQueue());
             
      System.out.println("Enter 5 numbers to add to queue..");
            // grab 5 elements from the user input and perform the method from the queue class
            myQueue.enqueue(kb.nextInt());
            myQueue.enqueue(kb.nextInt());
            myQueue.enqueue(kb.nextInt());
            myQueue.enqueue(kb.nextInt());
            myQueue.enqueue(kb.nextInt());
            
      myQueue.printQueue(); //shows the current queue      
      
      System.out.println("Size of Queue...\n"+ myQueue.queueSize());//displays queue size
      
      System.out.println("Remove an element from the Queue...\n"+ myQueue.dequeue());//removes element from queue
      
      System.out.println("Size of Queue...\n"+ myQueue.queueSize());
      
      System.out.println("Is the Queue Empty....\n"+ myQueue.emptyQueue());//checks if queue is empty
                 
      myQueue.printQueue(); //shows the current queue                 
     
    } // end main 
    
} // end class
