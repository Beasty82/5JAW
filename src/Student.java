
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
public class Student extends Person{
    
    /**
     *
     */
    public String program;

    /**
     *
     */
    public int dateRegistered;

    /**
     *
     * @param program
     * @param dateRegistered
     * @param id
     * @param name
     * @param email
     * @param telNum
     */
    public Student(String program, int dateRegistered, int id, String name, String email, int telNum) {
        super(id, name, email, telNum);
        this.program = program;
        this.dateRegistered = dateRegistered;
    }

    /**
     *
     * @return
     */
    public String getProgram() {
        return program;
    }

    /**
     *
     * @param program
     */
    public void setProgram(String program) {
        this.program = program;
    }

    /**
     *
     * @return
     */
    public int getDateRegistered() {
        return dateRegistered;
    }

    /**
     *
     * @param dateRegistered
     */
    public void setDateRegistered(int dateRegistered) {
        this.dateRegistered = dateRegistered;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return super.toString() + "Program= " + program + ", Date Registered= " + dateRegistered + '}';
    }

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.program);
        hash = 79 * hash + this.dateRegistered;
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
        final Student other = (Student) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    
}
