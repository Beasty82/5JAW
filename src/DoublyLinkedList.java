/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Beasty
 * @param <T>
 */
public class DoublyLinkedList<T> {
    
    Node<T> head;
    Node<T> tail;
    int count = 0;

    /**
     *
     * @return
     */
    public Node<T> getHead() {
        return head;
    }

    /**
     *
     * @return
     */
    public Node<T> getTail() {
        return tail;
    }

    /**
     *
     * @return
     */
    public int getCount() {
        return count;
    }

    /**
     *
     * @param head
     */
    public void setHead(Node<T> head) {
        this.head = head;
    }

    /**
     *
     * @param tail
     */
    public void setTail(Node<T> tail) {
        this.tail = tail;
    }

    /**
     *
     * @param count
     */
    public void setCount(int count) {
        this.count = count;
    }
    
    /**
     *
     */
    public void removeLast(){
        if (count != 0) {
            if(count == 1) {
                head = null;
                tail = null;
            } else {
                tail.previous.next = null;
                tail = tail.previous;
            }
            count--;
         }
    }
    
    /**
     *
     * @param node
     */
    public void addFirst(Node<T> node){
        Node<T> temp = head;
        head = node;
        head.next = temp;
        if(count == 0)
        {
            // Empty list, should point to new node. 
            tail = head;
        } else {
            temp.previous = head;
        }
        count++;
    }
    
    /**
     *
     * @param value
     */
    public void addFirst(T value) {
        addFirst(new Node<T>(value));
    }
    
    /**
     *
     */
    public void removeFirst(){
        if(count !=0){
            head = head.next;
            count--;
            if (count == 0) {
                tail = null;
            } else {
                head.previous = null;
            }
        }
    }
    
    /**
     *
     * @param node
     */
    public void addLast(Node<T> node){
        if (count ==0) {
            head = node;
        } else {
            tail.next = node;
            node.previous = tail;
        }
        tail = node;
        count++;
    }
    
    /**
     *
     * @param value
     */
    public void addLast(T value) {
        addLast(new Node<T>(value));
    }
    
    /**
     *
     * @param item
     * @return
     */
    public boolean contains(T item) {
        Node<T> current = head;
        while(current != null)
        {
            if (current.value.equals(item)){
                return true;
            }
            current = current.next;
        }
        return false;
    }
    
    /**
     *
     * @param item
     * @return
     */
    public boolean Remove(T item) {
        Node<T> previous = null;
        Node<T> current = head;
        
       while (current != null) {
           if (current.value.equals(item)) {
               if (previous != null) {
                   previous.next = current.next;
                   
                   if (current.next == null) {
                   tail = previous;
               }
                   count--;
               }
               
            } else {
               removeFirst();
           }
           return true;
    }
       return false;
    }
}
