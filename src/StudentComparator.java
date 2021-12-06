
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Beasty
 */
public class StudentComparator implements Comparator<Student>{
    
    /**
     *
     * @param s1
     * @param s2
     * @return
     */
    @Override
    public int compare(Student s1, Student s2) {
        return (s1.getId() - s2.getId());
    }
    
}
