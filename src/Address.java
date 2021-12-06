
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
public class Address {
    
    /**
     *
     */
    public int number;

    /**
     *
     */
    public String street;

    /**
     *
     */
    public String suburb;

    /**
     *
     */
    public int postcode;

    /**
     *
     */
    public String state;

    /**
     *
     * @param number
     * @param street
     * @param suburb
     * @param postcode
     * @param state
     */
    public Address(int number, String street, String suburb, int postcode, String state) {
        this.number = number;
        this.street = street;
        this.suburb = suburb;
        this.postcode = postcode;
        this.state = state;
    }

    /**
     *
     * @return
     */
    public int getNumber() {
        return number;
    }

    /**
     *
     * @param number
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     *
     * @return
     */
    public String getStreet() {
        return street;
    }

    /**
     *
     * @param street
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     *
     * @return
     */
    public String getSuburb() {
        return suburb;
    }

    /**
     *
     * @param suburb
     */
    public void setSuburb(String suburb) {
        this.suburb = suburb;
    }

    /**
     *
     * @return
     */
    public int getPostcode() {
        return postcode;
    }

    /**
     *
     * @param postcode
     */
    public void setPostcode(int postcode) {
        this.postcode = postcode;
    }

    /**
     *
     * @return
     */
    public String getState() {
        return state;
    }

    /**
     *
     * @param state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Address{" + "number=" + number + ", street=" + street + ", suburb=" + suburb + ", postcode=" + postcode + ", state=" + state + '}';
    }

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.number;
        hash = 89 * hash + Objects.hashCode(this.street);
        hash = 89 * hash + Objects.hashCode(this.suburb);
        hash = 89 * hash + this.postcode;
        hash = 89 * hash + Objects.hashCode(this.state);
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
        final Address other = (Address) obj;
        if (this.number != other.number) {
            return false;
        }
        if (!Objects.equals(this.street, other.street)) {
            return false;
        }
        if (!Objects.equals(this.suburb, other.suburb)) {
            return false;
        }
        return true;
    }

    
    
    
    
}
