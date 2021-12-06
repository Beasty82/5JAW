
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Beasty
 */
public class LinkedListTest {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        
        // Enrollments LinkedLists
        LinkedList<Enrollment> enrollmentsLinkedList = new LinkedList();
        LinkedList<Enrollment> enrollmentsDoublyLinkedList = new LinkedList();
        
        Enrollment e1 = new Enrollment(0001, "2020", 99, 2);
        Enrollment e2 = new Enrollment(0002, "2019", 68, 2);
        Enrollment e3 = new Enrollment(0003, "2017", 72, 1);
        Enrollment e4 = new Enrollment(0004, "2018", 55, 2);
        Enrollment e5 = new Enrollment(0005, "2021", 75, 2);
        Enrollment e6 = new Enrollment(0005, "2021", 75, 2);
        
        // Adding to start of Linked List
        enrollmentsLinkedList.addFirst(e1);
        enrollmentsLinkedList.addFirst(e2);
        enrollmentsLinkedList.addFirst(e3);
        enrollmentsDoublyLinkedList.addFirst(e1);
        enrollmentsDoublyLinkedList.addFirst(e2);
        enrollmentsDoublyLinkedList.addFirst(e3);
        
        // Adding to end of Linked List
        enrollmentsLinkedList.addFirst(e4);
        enrollmentsLinkedList.addFirst(e5);
        enrollmentsDoublyLinkedList.addFirst(e4);
        enrollmentsDoublyLinkedList.addFirst(e5);
        
        //Removing from start of List
        enrollmentsLinkedList.removeFirst();
        enrollmentsDoublyLinkedList.removeFirst();
                
        // Removing from end of List
        enrollmentsLinkedList.removeLast();
        enrollmentsDoublyLinkedList.removeLast();
                
        // Finding item in Linked List
        System.out.println("Checking for e1(expect true): " + enrollmentsLinkedList.contains(e1));
        System.out.println("Checking for e6(expect false): " + enrollmentsLinkedList.contains(e6));
        System.out.println("Checking for e1(expect true): " + enrollmentsDoublyLinkedList.contains(e1));
        System.out.println("Checking for e6(expect false): " + enrollmentsDoublyLinkedList.contains(e6));
        
        //Print List forward
        printLinkedList(enrollmentsLinkedList.getHead());
        
        // Print DoublyLinkedList backwards
        printLinkedList(enrollmentsDoublyLinkedList.getTail());
        
        // Students LinkedLists
        LinkedList<Student> studentsLinkedList = new LinkedList();
        LinkedList<Student> studentsDoublyLinkedList = new LinkedList();
        
        Student s1 = new Student("SoftwareDev", 2020, 5555, "Michael", "kolev@gmail.com", 12345678);
        Student s2 = new Student("Culinary", 2019, 3333, "Daniel", "saunders@gmail.com", 2362342);
        Student s3 = new Student("Security", 2018, 4444, "Sasha", "test@gmail.com", 234623623);
        Student s4 = new Student("Science", 2021, 2222, "Nick", "kolev@gmail.com", 12378346);
        Student s5 = new Student("Security", 2020, 1111, "Connor", "miller@gmail.com", 12341512);
        Student s6 = new Student("Security", 2020, 1111, "Connor", "miller@gmail.com", 12341512);
        
        // Adding to start of Linked List
        studentsLinkedList.addFirst(s1);
        studentsLinkedList.addFirst(s2);
        studentsLinkedList.addFirst(s3);
        studentsDoublyLinkedList.addFirst(s1);
        studentsDoublyLinkedList.addFirst(s2);
        studentsDoublyLinkedList.addFirst(s3);
        
        // Adding to end of Linked List
        studentsLinkedList.addFirst(s4);
        studentsLinkedList.addFirst(s5);
        studentsDoublyLinkedList.addFirst(s4);
        studentsDoublyLinkedList.addFirst(s5);
        
        //Removing from start of List
        studentsLinkedList.removeFirst();
        studentsDoublyLinkedList.removeFirst();
                
        // Removing from end of List
        studentsLinkedList.removeLast();
        studentsDoublyLinkedList.removeLast();
                
        // Finding item in Linked List
        System.out.println("Checking for s1(expect true): " + studentsLinkedList.contains(s1));
        System.out.println("Checking for s6(expect false): " + studentsLinkedList.contains(s6));
        System.out.println("Checking for s1(expect true): " + studentsDoublyLinkedList.contains(s1));
        System.out.println("Checking for s6(expect false): " + studentsDoublyLinkedList.contains(s6));
        
        //Print List forward
        printLinkedList(studentsLinkedList.getHead());
        
        // Print DoublyLinkedList backwards
        printLinkedList(studentsDoublyLinkedList.getTail());
        
        // Courses LinkedLists
        LinkedList<Course> coursesLinkedList = new LinkedList();
        LinkedList<Course> coursesDoublyLinkedList = new LinkedList();
        
        Course c1 = new Course(5555, "Science", 400);
        Course c2 = new Course(3333, "SOSE", 59);
        Course c3 = new Course(1111, "Maths", 100);
        Course c4 = new Course(4444, "Engineering", 3000);
        Course c5 = new Course(2222, "English", 75);
        Course c6 = new Course(2222, "English", 75);
        
        // Adding to start of Linked List
        coursesLinkedList.addFirst(c1);
        coursesLinkedList.addFirst(c2);
        coursesLinkedList.addFirst(c3);
        coursesDoublyLinkedList.addFirst(c1);
        coursesDoublyLinkedList.addFirst(c2);
        coursesDoublyLinkedList.addFirst(c3);
        
        // Adding to end of Linked List
        coursesLinkedList.addFirst(c4);
        coursesLinkedList.addFirst(c5);
        coursesDoublyLinkedList.addFirst(c4);
        coursesDoublyLinkedList.addFirst(c5);
        
        //Removing from start of List
        coursesLinkedList.removeFirst();
        coursesDoublyLinkedList.removeFirst();
                
        // Removing from end of List
        coursesLinkedList.removeLast();
        coursesDoublyLinkedList.removeLast();
                
        // Finding item in Linked List
        System.out.println("Checking for c1(expect true): " + coursesLinkedList.contains(c1));
        System.out.println("Checking for c6(expect false): " + coursesLinkedList.contains(c6));
        System.out.println("Checking for c1(expect true): " + coursesDoublyLinkedList.contains(c1));
        System.out.println("Checking for c6(expect false): " + coursesDoublyLinkedList.contains(c6));
        
        //Print List forward
        printLinkedList(coursesLinkedList.getHead());
        
        // Print DoublyLinkedList backwards
        printLinkedList(coursesDoublyLinkedList.getTail());

    }
    
    /**
     *
     * @param node
     */
    public static void printLinkedList(Node node) {
        while (node != null) {
            System.out.println(node.getValue());
            node = node.getNext();
        }
    }
    
    /**
     *
     * @param node
     */
    public static void printLinkedListBackwards(Node node) {
        while (node != null) {
            System.out.println(node.getValue());
            node = node.getPrevious();
        }
    }
    
}
