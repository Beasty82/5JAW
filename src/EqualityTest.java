/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Beasty
 */
public class EqualityTest {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        // Testing Student Equality
        
         System.out.println("Testing Student Equality");
        // Creating 2 students with same ID
        Person s1 = new Person(001, "Jim", "jim@gmail.com", 81234567);
        Person s2 = new Person(001, "Mike", "mike@gmail.com", 81234566);
        Person s3 = new Person(002, "Mike", "mike@gmail.com", 81234566);
        
        System.out.println("\ns1 equals s2(expecting true): " + s1.equals(s2));
        System.out.println("\ns1 equals s3(expecting false): " + s1.equals(s3));
        System.out.println("\ns2 equals s3(expecting false): " + s2.equals(s3));
        
        System.out.println("\nTesting Course Equality");
        
        // Creating 2 courses with same ID
        Course c1 = new Course(0001, "Java", 150);
        Course c2 = new Course(0001, "C#", 175);
        Course c3 = new Course(0002, "Powershell", 99);
        
        System.out.println("\nc1 equals c2(expecting true): " + c1.equals(c2));
        System.out.println("\nc1 equals c3(expecting false): " + c1.equals(c3));
        System.out.println("\nc2 equals c3(expecting false): " + c1.equals(c3));
        
        System.out.println("\nTesting Enrollment Equality");
        // Creating 2 enrollments with same ID
        Enrollment e1 = new Enrollment(001, "02/2020", 98, 1);
        Enrollment e2 = new Enrollment(001, "07/2021", 69, 2);
        Enrollment e3 = new Enrollment(002, "01/2019", 75, 2);
        
        System.out.println("\ne1 equals e2(expecting true): " + e1.equals(e2));
        System.out.println("\ne1 equals e3(expecting false): " + e1.equals(e3));
        System.out.println("\ne2 equals e3(expecting false): " + e1.equals(e3));
    }
    
}
