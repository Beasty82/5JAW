
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
public class CourseComparator implements Comparator<Course> {
    
    /**
     *
     * @param c1
     * @param c2
     * @return
     */
    @Override
    public int compare(Course c1, Course c2) {
        return (c1.getCourseCode() - c2.getCourseCode());
    }
    
}
