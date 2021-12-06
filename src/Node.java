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
public class Node<T> {

    /**
     *
     */
    public T value;

    /**
     *
     */
    public Node<T> next;

    /**
     *
     */
    public Node<T> previous;
    
    /**
     *
     * @param value
     */
    public Node(T value)
    {
        this.value = value;
    }

    /**
     *
     * @return
     */
    public T getValue() {
        return value;
    }

    /**
     *
     * @return
     */
    public Node getNext() {
        return next;
    }

    /**
     *
     * @return
     */
    public Node getPrevious() {
        return previous;
    }

    /**
     *
     * @param value
     */
    public void setValue(T value) {
        this.value = value;
    }

    /**
     *
     * @param next
     */
    public void setNext(Node next) {
        this.next = next;
    }

    /**
     *
     * @param previous
     */
    public void setPrevious(Node previous) {
        this.previous = previous;
    } 
}
