/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

/** this queue class contains methods that does the following:
 * a method to instantiate a null queue
 * an enqueue method -- add an element to the queue
 * an dequeue method -- remove an element form the queue
 * a size method -- return the size of the queue
 * a boolean isEmpty method to determine if the queue is empty
 */
public class QueueClass {
  public Node headpointer; // create a head pointer for queue
  public Node tailpointer; // create tail pointer for queue
   int size; // create size for queue
  
  // constructor
  public QueueClass(){
  
     headpointer = null; // set to null
     tailpointer = null; // set to null
     size = 0; // set size to 0
     
  }
//*****************************************************************************//
  /* this method returns true if the queue is empty
  *
 */
    public boolean emptyQueue() {

        return headpointer == null;

    } // end emptyQueue()
//*****************************************************************************//
  /* this method returns the size of the queue
    *
    */
    
    public int queueSize() {

        return size;

    }
//*****************************************************************************//
    /* This method add elements into a queue
     *
     */

    public void enqueue(int items) {
        Node x = new Node(items, null); // new node, with items
        if (tailpointer == null) {
            headpointer = x; // node equal to head and tail
            tailpointer = x;

        } else {
            tailpointer.setNext(x);
            tailpointer = tailpointer.getNext();

        }
        size++; // increment

    } // end enqueue
//*****************************************************************************//
    /** this method remove elements into a queue
     * 
     * 
     */
    public int dequeue() {
       // loop
        if (emptyQueue()) {
            System.out.println("Queue has no element");
        }
        Node queue = headpointer; // new node as head
        headpointer.getNext(); // move to next
        if (headpointer == null) { // loop
            tailpointer = null; 

        }

        size--; // decrement
        return queue.getItems(); // getitems

    } // end dequeue

//*****************************************************************************//

    /**
     * This method prints the queue elements
     */
  
    public void printQueue() {
        System.out.println("Displaying Queue Elements....\n");

        if (size == 0) {
            System.out.println("There is nothing in this Queue\n");
            return;
        }//end if
       
        Node Queue = headpointer; // create node equal to head
        // while loop to print the queue
        while (Queue != tailpointer.getNext()) {
            System.out.print(Queue.getItems() + ", ");
            Queue = Queue.getNext();
        }//end while

        System.out.println();//skips a line      
    }//end printQueue()












}// end class











