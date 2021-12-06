
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
public class EnrollmentComparator implements Comparator<Enrollment> {
    
    /**
     *
     * @param e1
     * @param e2
     * @return
     */
    @Override
    public int compare(Enrollment e1, Enrollment e2) {
        return (e1.getDateEnrolled().compareTo(e2.getDateEnrolled()));
    }
    
}
