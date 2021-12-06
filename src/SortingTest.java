/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Beasty
 */

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Beasty
 */
public class SortingTest {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("Sorting Enrollments");
        
        // Creating Enrollments and arrays
        ArrayList<Enrollment> enrollmentSelectionList = new ArrayList();
        ArrayList<Enrollment> enrollmentsBubbleList = new ArrayList();
        
        Enrollment e1 = new Enrollment(0001, "2020", 99, 2);
        Enrollment e2 = new Enrollment(0002, "2019", 68, 2);
        Enrollment e3 = new Enrollment(0003, "2017", 72, 1);
        Enrollment e4 = new Enrollment(0004, "2018", 55, 2);
        Enrollment e5 = new Enrollment(0005, "2021", 75, 2);
        
        enrollmentSelectionList.add(e1);
        enrollmentSelectionList.add(e2);
        enrollmentSelectionList.add(e3);
        enrollmentSelectionList.add(e4);
        enrollmentSelectionList.add(e5);
        
        enrollmentsBubbleList.add(e1);
        enrollmentsBubbleList.add(e2);
        enrollmentsBubbleList.add(e3);
        enrollmentsBubbleList.add(e4);
        enrollmentsBubbleList.add(e5);
        
        // Selection Sort
        System.out.println("\nBefore Selection sort: ");
        enrollmentSelectionList.forEach(System.out::println);
        enrollmentSelectionSort(enrollmentSelectionList);
        System.out.println("\nAfter Selection sort: ");
        enrollmentSelectionList.forEach(System.out::println);
        
        // Bubble SOrt
        System.out.println("\nBefore Bubble sort: ");
        enrollmentsBubbleList.forEach(System.out::println);
        enrollmentBubbleSort(enrollmentsBubbleList);
        System.out.println("\nAfter Bubble sort: ");
        enrollmentsBubbleList.forEach(System.out::println);
        
        
        System.out.println("\nSorting Students");

        // Creatring Students and arrays
        ArrayList<Student> studentSelectionList = new ArrayList();
        ArrayList<Student> studentBubbleList = new ArrayList();

        Student s1 = new Student("Programming", 2019, 001, "Brendan", "brendan@gmail.com", 81234567);
        Student s2 = new Student("Science", 2020, 002, "Kristen", "kristen@gmail.com", 81234566);
        Student s3 = new Student("Hairdressing", 2017, 003, "Jim", "jim@gmail.com", 81234565);
        Student s4 = new Student("Culinary", 2020, 004, "Mike", "mike@gmail.com", 81234545);
        Student s5 = new Student("Science", 2021, 005, "Jill", "jill@gmail.com", 81234564);

        studentSelectionList.add(s1);
        studentSelectionList.add(s2);
        studentSelectionList.add(s3);
        studentSelectionList.add(s4);
        studentSelectionList.add(s5);
        
        studentBubbleList.add(s1);
        studentBubbleList.add(s2);
        studentBubbleList.add(s3);
        studentBubbleList.add(s4);
        studentBubbleList.add(s5);
        
        // Selection Sort
        System.out.println("\nBefore Selection sort: ");
        studentSelectionList.forEach(System.out::println);
        studentSelectionSort(studentSelectionList);
        System.out.println("\nAfter Selection sort: ");
        studentSelectionList.forEach(System.out::println);

        // Bubble Sort
        System.out.println("\nBefore Bubble sort: ");
        studentBubbleList.forEach(System.out::println);
        studentBubbleSort(studentBubbleList);
        System.out.println("\nAfter Bubble sort: ");
        studentBubbleList.forEach(System.out::println);
        
        
        System.out.println("Sorting Courses");
        
        // Creating Courses and arrays
        ArrayList<Course> courseListSelection = new ArrayList();
        ArrayList<Course> courseListBubble = new ArrayList();
        
        Course c1 = new Course(0001, "Java", 500);
        Course c2 = new Course(0002, "C#", 250);
        Course c3 = new Course(0003, "PowerShell", 300);
        Course c4 = new Course(0004, "Python", 455);
        Course c5 = new Course(0005, "C++", 199);
        
        courseListSelection.add(c1);
        courseListSelection.add(c2);
        courseListSelection.add(c3);
        courseListSelection.add(c4);
        courseListSelection.add(c5);
        
        courseListBubble.add(c1);
        courseListBubble.add(c2);
        courseListBubble.add(c3);
        courseListBubble.add(c4);
        courseListBubble.add(c5);
        
        // Selection Sort
        System.out.println("\nBefore Selection sort: ");
        courseListSelection.forEach(System.out::println);
        courseSelectionSort(courseListSelection);
        System.out.println("\nAfter Selection sort: ");
        courseListSelection.forEach(System.out::println);
        
        // Bubble Sort
        System.out.println("\nBefore Bubble sort: ");
        courseListBubble.forEach(System.out::println);
        courseBubbleSort(courseListBubble);
        System.out.println("\nAfter Bubble sort: ");
        courseListBubble.forEach(System.out::println);
    }

    /**
     *
     * @param enrollments
     */
    public static void enrollmentSelectionSort(ArrayList<Enrollment> enrollments){
        Enrollment e;
        int min;
        
        for (int i = 0; i < enrollments.size() -1; i++) {
            min = i;
            
            for (int j = i + 1; j < enrollments.size(); j++ ){
                if (enrollments.get(j).getEnrollId() < enrollments.get(min).getEnrollId()){
                    min = j;
                }
            }
            e = enrollments.get(min);
            enrollments.set(min, enrollments.get(i));
            enrollments.set(i, e);
        }
    }
    
    private static void enrollmentBubbleSort(ArrayList<Enrollment> enrollments) {
        Enrollment e;

        for (int i = 0; i <= enrollments.size() - 2; i++) {
            for (int j = 0; j <= enrollments.size() - 2; j++) {
                if (enrollments.get(j).getEnrollId() > enrollments.get(j + 1).getEnrollId()) {
                    e = enrollments.get(j + 1);
                    enrollments.set(j + 1, enrollments.get(j));
                    enrollments.set(j, e);
                }
            }
        }
    }
    
    /**
     *
     * @param students
     */
    public static void studentSelectionSort(ArrayList<Student> students){
        Student s;
        int min;
        
        for (int i = 0; i < students.size() -1; i++) {
            min = i;
            
            for (int j = i + 1; j < students.size(); j++ ) {
                if (students.get(j).getId() < students.get(min).getId()){
                    min = j;
                }
            }
            s = students.get(min);
            students.set(min, students.get(i));
            students.set(i, s);
        }
    }

    private static void studentBubbleSort(ArrayList<Student> students) {
        Student s;
        
        for (int k = 0; k <= students.size() - 2; k++) {
            for (int j = 0; j <= students.size() - 2; j++) {
                if (students.get(j).getId() > students.get(j + 1).getId()) {
                    s = students.get(j + 1);
                    students.set(j + 1, students.get(j));
                    students.set(j, s);
                }
            }
        }
    }
    
    /**
     *
     * @param courses
     */
    public static void courseSelectionSort(ArrayList<Course> courses){
        Course c;
        int min;
        
        for (int i = 0; i < courses.size() -1; i++) 
        {
            min = i;
            
            for (int j = i + 1; j < courses.size(); j++ ){
                if (courses.get(j).getCourseCode() < courses.get(min).getCourseCode()){
                    min = j;
                }
            }
            c = courses.get(min);
            courses.set(min, courses.get(i));
            courses.set(i, c);
        }
    }
    
    private static void courseBubbleSort(ArrayList<Course> courses) {
        Course c;

        for (int i = 0; i <= courses.size() - 2; i++) {
            for (int j = 0; j <= courses.size() - 2; j++) {
                if (courses.get(j).getCourseCode() > courses.get(j + 1).getCourseCode()) {
                    c = courses.get(j + 1);
                    courses.set(j + j, courses.get(j));
                    courses.set(j, c);
                }
            }
        }
    }
   
}
