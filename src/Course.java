
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
public class Course {
    
    /**
     *
     */
    public int courseCode;

    /**
     *
     */
    public String courseName;

    /**
     *
     */
    public int cost;

    /**
     *
     * @param courseCode
     * @param courseName
     * @param cost
     */
    public Course(int courseCode, String courseName, int cost) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.cost = cost;
    }

    /**
     *
     * @return
     */
    public int getCourseCode() {
        return courseCode;
    }

    /**
     *
     * @param courseCode
     */
    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }

    /**
     *
     * @return
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     *
     * @param courseName
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    /**
     *
     * @return
     */
    public int getCost() {
        return cost;
    }

    /**
     *
     * @param cost
     */
    public void setCost(int cost) {
        this.cost = cost;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Course{" + "courseCode=" + courseCode + ", courseName=" + courseName + ", cost=" + cost + '}';
    }

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.courseCode;
        hash = 17 * hash + Objects.hashCode(this.courseName);
        hash = 17 * hash + this.cost;
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
        final Course other = (Course) obj;
        if (this.courseCode != other.courseCode) {
            return false;
        }
        return true;
    }

    
    
    
    
}
