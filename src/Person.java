
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
public class Person {
    
    // Created an id to make it easier for equality testing

    /**
     *
     */
    public int id;

    /**
     *
     */
    public String name;

    /**
     *
     */
    public String email;

    /**
     *
     */
    public int telNum;

    /**
     *
     * @param id
     * @param name
     * @param email
     * @param telNum
     */
    public Person(int id, String name, String email, int telNum) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.telNum = telNum;
    }

    /**
     *
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     * @return
     */
    public int getTelNum() {
        return telNum;
    }

    /**
     *
     * @param telNum
     */
    public void setTelNum(int telNum) {
        this.telNum = telNum;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Person{" + "id= " + id + ", name= " + name + ", email= " + email + ", telNum= " + telNum + '}';
    }

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.id;
        hash = 41 * hash + Objects.hashCode(this.name);
        hash = 41 * hash + Objects.hashCode(this.email);
        hash = 41 * hash + this.telNum;
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
        final Person other = (Person) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    
    
}
