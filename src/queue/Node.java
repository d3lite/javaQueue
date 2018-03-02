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
public class Node {

    private int items;
    private Node next;

    public Node(int items, Node next) {
        this.items = items;
        this.next = next;
    }

    public Node() {

    }

   

    public int getItems() {
        return items;
    }

    public Node getNext() {
        return next;
    }

    public void setItems(int items) {
        this.items = items;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" + "items=" + items + ", next=" + next + '}';
    }



}
