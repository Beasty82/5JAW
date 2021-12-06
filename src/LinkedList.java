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
public class LinkedList<T> {
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
     * @param node
     */
    public void addFirst(Node<T> node){
        
        // Save the head
        Node<T> temp = head;
        // Point head to new node
        head = node;
        // Insert the rest of thte list behind the head
        head.next = temp;
        count++;
        // If the list was empty then the head and tail should both point to the new node.
        if(count ==1){
            tail = head;
        }
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
     * @param node
     */
    public void addLast(Node<T> node) {
        // no nodes
        if(count == 0){
            head = node;
        } else {
            tail.next = node;
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
     */
    public void removeFirst(){
        if(count != 0) {
            head = head.next;
            count--;
            if(count == 0) {
                tail = null;
            }
        }
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
            if(current.value.equals(item)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
    
    /**
     *
     */
    public void removeLast() {
        if(count !=0) {
            if(count==1) {
                head = null;
                tail = null;
            } else  {
                Node<T> current = head;
                while(current.next != tail) {
                    current = current.next;
                }
                current.next = null;
                tail = current;
            }
            count--;
        }
    }
    
    /**
     *
     * @param array
     * @param arrayIndex
     */
    public void CopyTo(T[] array, int arrayIndex) {
        Node<T> current = head;
        while (current != null) {
            array[arrayIndex++] = current.value;
            current = current.next;
        }
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