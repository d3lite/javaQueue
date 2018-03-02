/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

/**
 *
 * @author David
 */
public class QueueElement {
    private int items;
    private QueueElement next;
    
    // constructor

   public QueueElement(){
   
   }
    
   public QueueElement(int items, QueueElement next) {
        this.items = items;
        this.next = next;
    }
  
   public QueueElement(int items){
       this.items = items;
   }
   // end constructor
 //***************************************************************************//
    //accessors

    public int getItems() {
        return items;
    }

    public QueueElement getNext() {
        return next;
    }
 //***************************************************************************//
    // mutators
    public void setItems(int items) {
        this.items = items;
    }

    public void setNext(QueueElement next) {
        this.next = next;
    }
 //***************************************************************************//  
    // toString

    @Override
    public String toString() {
        return "QueueElement{" + "items=" + items + ", next=" + next + '}';
    }
    
   
   
}
