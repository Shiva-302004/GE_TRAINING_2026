package org.gevernova.JavaEightFeatures.VirtualClassRoom;

import java.util.Objects;

/**
 * Represents a student in the virtual classroom.
 * Each student is uniquely identified using an ID.
 */
public class Student {

    // Unique identifier for the student
    int id;

    // Name of the student
    String name;

    /**
     * Constructor to initialize student details.
     *
     * @param id   Unique student ID
     * @param name Name of the student
     */
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Overrides equals() to define student uniqueness.
     * Two Student objects are considered equal if they have the same ID.
     * This helps prevent duplicate student entries in collections.
     *
     * @param o Object to be compared
     * @return true if both objects represent the same student, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;              // Same object reference
        if (!(o instanceof Student s)) return false; // Type check
        return id == s.id;                       // Compare based on student ID
    }

    /**
     * Overrides hashCode() to be consistent with equals().
     * Uses student ID to generate hash code for efficient storage
     * in hash-based collections like HashMap and HashSet.
     *
     * @return hash code based on student ID
     */
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
