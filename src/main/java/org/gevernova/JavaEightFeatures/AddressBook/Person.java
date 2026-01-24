package org.gevernova.JavaEightFeatures.AddressBook;

import java.util.Objects;

/**
 * Represents a person in the Address Book.
 * Stores basic personal and location details.
 */
public class Person {

    // First name of the person
    String firstName;

    // Last name of the person
    String lastName;

    // City where the person resides
    String city;

    // ZIP / Postal code of the person's address
    String zip;

    // State where the person resides
    String state;

    /**
     * Constructor to initialize person details.
     *
     * @param firstName First name of the person
     * @param lastName  Last name of the person
     * @param city      City of residence
     * @param zip       ZIP / Postal code
     * @param state     State of residence
     */
    public Person(String firstName, String lastName, String city, String zip, String state) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.zip = zip;
        this.state = state;
    }

    /**
     * @return First name of the person
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @return Last name of the person
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @return City of residence
     */
    public String getCity() {
        return city;
    }

    /**
     * @return ZIP / Postal code
     */
    public String getZip() {
        return zip;
    }

    /**
     * @return State of residence
     */
    public String getState() {
        return state;
    }

    /**
     * Overrides equals() to define uniqueness of a person.
     * Two persons are considered equal if they have the same
     * first name and last name.
     *
     * @param obj Object to compare
     * @return true if both represent the same person
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Person)) return false;

        Person p = (Person) obj;
        return firstName.equals(p.firstName) && lastName.equals(p.lastName);
    }

    /**
     * Overrides hashCode() to be consistent with equals().
     * Uses lowercase names to ensure case-insensitive hashing.
     *
     * @return hash code based on first and last name
     */
    @Override
    public int hashCode() {
        return Objects.hash(firstName.toLowerCase(), lastName.toLowerCase());
    }
}
