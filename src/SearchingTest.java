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

/**
 *
 * @author Beasty
 */
public class SearchingTest {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("\nSearching Enrollments");
        
        // Creating Enrollments and Enrollments array
        ArrayList<Enrollment> enrollments = new ArrayList();
        
        Enrollment e1 = new Enrollment(0001, "2020", 99, 2);
        Enrollment e2 = new Enrollment(0002, "2019", 68, 2);
        Enrollment e3 = new Enrollment(0003, "2017", 72, 1);
        Enrollment e4 = new Enrollment(0004, "2018", 55, 2);
        Enrollment e5 = new Enrollment(0005, "2021", 75, 2);
        
        enrollments.add(e1);
        enrollments.add(e2);
        enrollments.add(e3);
        enrollments.add(e4);
        enrollments.add(e5);
        
        // Searching
        System.out.println("Search for enrollment 0003: " + enrollmentBinarySearch(enrollments, 0003));
        System.out.println("Search for enrollment 0007: " + enrollmentBinarySearch(enrollments, 0007));
        System.out.println("Search for enrollment 0003: " + enrollmentLinearSearch(enrollments, 0002));
        System.out.println("Search for enrollment 0003: " + enrollmentLinearSearch(enrollments, 0101));
        
        // Students
        System.out.println("Searching Students");
        
        // Creating Students and Student and array
        ArrayList<Student> students = new ArrayList();
        
        Student s1 = new Student("Programming", 2019, 001, "Brendan", "brendan@gmail.com", 81234567);
        Student s2 = new Student("Science", 2020, 002, "Kristen", "kristen@gmail.com", 81234566);
        Student s3 = new Student("Hairdressing", 2017, 003, "Jim", "jim@gmail.com", 81234565);
        Student s4 = new Student("Culinary", 2020, 004, "Mike", "mike@gmail.com", 81234545);
        Student s5 = new Student("Science", 2021, 005, "Jill", "jill@gmail.com", 81234564);
        
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        
        // Searching
        
        System.out.println("Search for student 007: " + studentBinarySearch(students, 007));
        System.out.println("Search for student 002: " + studentBinarySearch(students, 002));
        System.out.println("Search for student 001" + studentLinearSearch(students, 001));
        System.out.println("Search for student 006: " + studentLinearSearch(students, 006));

        // Courses
        System.out.println("\nSearching Courses");
        
        // Creating Courses and Courses array
        ArrayList<Course> courses = new ArrayList();
        
        Course c1 = new Course(0001, "Java", 500);
        Course c2 = new Course(0002, "C#", 250);
        Course c3 = new Course(0003, "PowerShell", 300);
        Course c4 = new Course(0004, "Python", 455);
        Course c5 = new Course(0005, "C++", 199);
        
        courses.add(c1);
        courses.add(c2);
        courses.add(c3);
        courses.add(c4);
        courses.add(c5);
        
        // Searching
        System.out.println("Searching for Course Code 0101: " + courseBinarySearch(courses, 0101));
        System.out.println("Searching for Course Code 0001: " + courseBinarySearch(courses, 0001));
        System.out.println("Search for course 0002: " + courseLinearSearch(courses, 0002));
        System.out.println("Search for course 0006: " + courseLinearSearch(courses, 0));
    }
    
    // Searching Algorithms

    /**
     *
     * @param enrollments
     * @param targetID
     * @return
     */
    
    public static int enrollmentBinarySearch(ArrayList<Enrollment> enrollments, int targetID) {
         
        // Min & Max indexes
        int min = 0;
         int N = enrollments.size();
         int max = N - 1;
         int compareID;
        
         // Creating comparator
         EnrollmentComparator ec = new EnrollmentComparator();
         enrollments.sort(ec);
         
         // while loop to search array
         while (min <= max) {
             int mid = (min + max) / 2;
             compareID = enrollments.get(mid).getEnrollId();
             
             if (targetID > compareID) {
                min = mid + 1;
             } if (targetID < compareID){
                 max = mid -1;
             }
             
             // returning index if found
             if (targetID == compareID) {
                 return mid;
             }
         }
         // If not found return -1
         return -1;
     }
    
    /**
     *
     * @param enrollments
     * @param targetID
     * @return
     */
    public static Enrollment enrollmentLinearSearch(ArrayList<Enrollment> enrollments, int targetID){
            for (Enrollment enrollment : enrollments){
                if (enrollment.getEnrollId() == targetID) {
                    return enrollment;
                }
            }
            return null;
            
        }
    
    /**
     *
     * @param students
     * @param targetID
     * @return
     */
    public static int studentBinarySearch(ArrayList<Student> students, int targetID) {
         
        // Min & Max indexes
         int min = 0;
         int N = students.size();
         int max = N - 1;
         int compareID = 0;
        
         // Creating comparator
         StudentComparator sc = new StudentComparator();
         students.sort(sc);
         
         // While loop to search array
         while (min <= max) {
             int mid = (min + max) / 2;
             compareID = students.get(mid).getId();
             
             if (targetID > compareID) {
                min = mid + 1;
             } if (targetID < compareID){
                 max = mid -1;
             }
             
             // Return index if found
             if (targetID == compareID) {
                 return mid;
             }
         }
         // return -1 if not found
         return -1;
     }
    
    /**
     *
     * @param students
     * @param targetID
     * @return
     */
    public static Student studentLinearSearch(ArrayList<Student> students, int targetID)
        {
            for (Student student : students){
                if (student.getId() == targetID) {
                    return student;
                }
            }
            return null;
            
        }
    
    /**
     *
     * @param courses
     * @param targetID
     * @return
     */
    public static int courseBinarySearch(ArrayList<Course> courses, int targetID) {

        // Min & Max array indexes
         int min = 0;
         int N = courses.size();
         int max = N - 1;
         int compareID = 0;
         
         // Creating comparator
         CourseComparator cc = new CourseComparator();
         courses.sort(cc);
         
         // While loop to search array
         while (min <= max) {
             int mid = (min + max) / 2;
             compareID = courses.get(mid).getCourseCode();
             
             if (targetID > compareID) {
                min = mid + 1;
             } if (targetID < compareID){
                 max = mid -1;
             }
             
             if (targetID == compareID) {
                 return mid;
             }
         }
         // return -1 if not found
         return -1;
     }
    
    /**
     *
     * @param courses
     * @param targetID
     * @return
     */
    public static Course courseLinearSearch(ArrayList<Course> courses, int targetID)
        {
            for (Course course : courses){
                if (course.getCourseCode() == targetID) {
                    return course;
                }
            }
            return null;
            
        }
}
