import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Beasty
 */
public class ComparatorTest {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        
        System.out.println("Testing Student Comparator");
        
        // Creating Students 
        Student s1 = new Student("Programming", 2019, 001, "Brendan", "brendan@gmail.com", 81234567);
        Student s2 = new Student("Science", 2020, 002, "Kristen", "kristen@gmail.com", 81234566);
        Student s3 = new Student("Hairdressing", 2017, 003, "Jim", "jim@gmail.com", 81234565);
        Student s4 = new Student("Culinary", 2020, 004, "Mike", "mike@gmail.com", 81234545);
        Student s5 = new Student("Science", 2021, 005, "Jill", "jill@gmail.com", 81234564);
        Student s6 = new Student("Science", 2021, 005, "Jill", "jill@gmail.com", 81234564);
        
        // Creating a Student Hash Set
        // Trying to add duplicate Students s5 and s6
        Set<Student> StudentHash = new HashSet<Student>();
        StudentHash.add(s1);
        StudentHash.add(s2);
        StudentHash.add(s3);
        StudentHash.add(s4);
        StudentHash.add(s5);
        StudentHash.add(s6);
        
        
        System.out.println("\nChecking for duplicate in Hash Set");
        for (Student s : StudentHash)
        {
            System.out.println(s);
        }
        
        // Creating Students array
        Student[] _students = new Student[5];
        _students[0] = s1;
        _students[1] = s2;
        _students[2] = s3;
        _students[3] = s4;
        _students[4] = s5;
        
        System.out.println("\nBefore Sorting");
        
        for (Student s : _students)
        {
            System.out.println(s);
        }
        
        // Sorting using StudentComparator.
        System.out.println("\nAfter Sorting");
        
        StudentComparator sc = new StudentComparator();
        Arrays.sort(_students, sc);
        for (Student s : _students)
        {
            System.out.println(s);
        }
        
        System.out.println("\nTesting Course Comparator");
        // Creating Courses
        Course c1 = new Course(0001, "Java", 500);
        Course c2 = new Course(0002, "C#", 250);
        Course c3 = new Course(0003, "PowerShell", 300);
        Course c4 = new Course(0004, "Python", 455);
        Course c5 = new Course(0005, "C++", 199);
        Course c6 = new Course(0005, "C++", 199);
        
        // Creating a Course Hash Set
        // Trying to add duplicate Courses c5 and c6
        Set<Course> CoursesHash = new HashSet<Course>();
        CoursesHash.add(c1);
        CoursesHash.add(c2);
        CoursesHash.add(c3);
        CoursesHash.add(c4);
        CoursesHash.add(c5);
        CoursesHash.add(c6);
        
        
        System.out.println("\nChecking for duplicate in Hash Set");
        for (Course c : CoursesHash)
        {
            System.out.println(c);
        }
        
        // Creating Courses array
        Course[] _courses = new Course[5];
        _courses[0] = c1;
        _courses[1] = c2;
        _courses[2] = c3;
        _courses[3] = c4;
        _courses[4] = c5;
        

        System.out.println("\nBefore sorting");
        
        for (Course c : _courses)
        {
            System.out.println(c);
        }
        
        // Sorting using CourseCodeComparator.
        System.out.println("\nAfter sorting");
        
        CourseComparator cc = new CourseComparator();
        Arrays.sort(_courses, cc);
        for (Course c : _courses)
        {
            System.out.println(c);
        }
        
        System.out.println("\nTesting Enrollment Comparator");
        // Creating Enrollments 
        Enrollment e1 = new Enrollment(0001, "2020", 99, 2);
        Enrollment e2 = new Enrollment(0002, "2019", 68, 2);
        Enrollment e3 = new Enrollment(0003, "2017", 72, 1);
        Enrollment e4 = new Enrollment(0004, "2018", 55, 2);
        Enrollment e5 = new Enrollment(0005, "2021", 75, 2);
        Enrollment e6 = new Enrollment(0005, "2021", 75, 2);
        
        // Creating an Enrollment Hash Set
        // Trying to add duplicate Enrollments e5 and e6
        Set<Enrollment> EnrollmentHash = new HashSet<Enrollment>();
        EnrollmentHash.add(e1);
        EnrollmentHash.add(e2);
        EnrollmentHash.add(e3);
        EnrollmentHash.add(e4);
        EnrollmentHash.add(e5);
        EnrollmentHash.add(e6);
        
        
        System.out.println("\nChecking for duplicate in Hash Set");
        for (Enrollment e : EnrollmentHash)
        {
            System.out.println(e);
        }
        
        
        // Creating Enrollments array
        Enrollment[] _enrollments = new Enrollment[5];
        _enrollments[0] = e1;
        _enrollments[1] = e2;
        _enrollments[2] = e3;
        _enrollments[3] = e4;
        _enrollments[4] = e5;
        
        
        System.out.println("\nBefore sorting");
        
        for (Enrollment e : _enrollments)
        {
            System.out.println(e);
        }
        
        // Sorting using EnrollmentComparator
        System.out.println("\nAfter sorting");
        
        EnrollmentComparator ec = new EnrollmentComparator();
        Arrays.sort(_enrollments, ec);
        for (Enrollment e : _enrollments)
        {
            System.out.println(e);
        }
        
    }
    
}
