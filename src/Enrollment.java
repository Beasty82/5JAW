
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Beasty
 */
public class Enrollment {
    
    // Added enrollment Id for equality testing

    /**
     *
     */
    public int enrollId;

    /**
     *
     */
    public String dateEnrolled;

    /**
     *
     */
    public int grade;

    /**
     *
     */
    public int semester;

    /**
     *
     * @param enrollId
     * @param dateEnrolled
     * @param grade
     * @param semester
     */
    public Enrollment(int enrollId, String dateEnrolled, int grade, int semester) {
        this.enrollId = enrollId;
        this.dateEnrolled = dateEnrolled;
        this.grade = grade;
        this.semester = semester;
    }

    /**
     *
     * @return
     */
    public int getEnrollId() {
        return enrollId;
    }

    /**
     *
     * @param enrollId
     */
    public void setEnrollId(int enrollId) {
        this.enrollId = enrollId;
    }

    /**
     *
     * @return
     */
    public String getDateEnrolled() {
        return dateEnrolled;
    }

    /**
     *
     * @param dateEnrolled
     */
    public void setDateEnrolled(String dateEnrolled) {
        this.dateEnrolled = dateEnrolled;
    }

    /**
     *
     * @return
     */
    public int getGrade() {
        return grade;
    }

    /**
     *
     * @param grade
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     *
     * @return
     */
    public int getSemester() {
        return semester;
    }

    /**
     *
     * @param semester
     */
    public void setSemester(int semester) {
        this.semester = semester;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Enrollment{" + "enrollId=" + enrollId + ", dateEnrolled=" + dateEnrolled + ", grade=" + grade + ", semester=" + semester + '}';
    }

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.enrollId;
        hash = 97 * hash + Objects.hashCode(this.dateEnrolled);
        hash = 97 * hash + this.grade;
        hash = 97 * hash + this.semester;
        return hash;
    }

    /**
     *
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Enrollment other = (Enrollment) obj;
        if (this.enrollId != other.enrollId) {
            return false;
        }
        return true;
    }
    
    
    
}
