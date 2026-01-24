package org.gevernova.JavaEightFeatures.VirtualClassRoom;

import java.time.LocalDate;
import java.util.*;

/**
 * Represents a course in the virtual classroom.
 * Handles enrollment requests, approvals, and assignment management.
 */
public class Course {

    // Unique identifier for the course
    int CourseId;

    // Name of the course
    String CourseName;

    // Instructor assigned to the course
    Instructor instructor;

    // Stores students who have requested enrollment but are not yet approved
    Set<Student> pendingRequests = new HashSet<>();

    // Stores students whose enrollment has been approved
    Set<Student> approvedRequests = new HashSet<>();

    // List of assignments created for this course
    List<Assignments> assignments = new ArrayList<>();

    /**
     * Constructor to initialize course details.
     *
     * @param id         Course ID
     * @param name       Course name
     * @param instructor Instructor handling the course
     */
    public Course(int id, String name, Instructor instructor) {
        this.CourseId = id;
        this.CourseName = name;
        this.instructor = instructor;
    }

    /**
     * Allows a student to request enrollment in the course.
     * Prevents duplicate requests and re-approval.
     *
     * @param student Student requesting enrollment
     */
    public void RequestEnrollment(Student student) {
        // Check if the student is already approved
        if (approvedRequests.contains(student)) {
            System.out.println(student.name + " already approved");
            return;
        }

        // Add student to pending requests if not already present
        if (pendingRequests.add(student)) {
            System.out.println(student.name + " requested approval");
        } else {
            System.out.println("Duplicate registration Requests");
        }
    }

    /**
     * Approves a student's enrollment request.
     * Moves the student from pending to approved list.
     *
     * @param student Student to approve
     */
    public void ApproveEnrollment(Student student) {
        if (pendingRequests.remove(student)) {
            approvedRequests.add(student);
            System.out.println("enrollment approved for " + student.name);
        }
    }

    /**
     * Rejects a student's enrollment request.
     * Removes the student from pending requests.
     *
     * @param student Student to reject
     */
    public void RejectEnrollment(Student student) {
        if (pendingRequests.remove(student)) {
            System.out.println("enrollment rejected for " + student.name);
        }
    }

    /**
     * Creates and adds a new assignment to the course.
     *
     * @param title    Assignment title
     * @param deadline Submission deadline
     * @return Created assignment
     */
    public Assignments GenerateAssignment(String title, LocalDate deadline) {
        Assignments assignment1 = new Assignments(title, deadline);
        assignments.add(assignment1);
        return assignment1;
    }

    /**
     * Displays all students whose enrollment requests are pending approval.
     */
    public void seeRequestsForApproval() {
        for (Student v : pendingRequests) {
            System.out.println(v.id + " -> " + v.name);
        }
    }
}
