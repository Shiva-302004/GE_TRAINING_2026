package org.gevernova.JavaEightFeatures.VirtualClassRoom;

import java.time.LocalDate;

/**
 * Entry point of the Virtual Classroom application.
 * Demonstrates student enrollment, approval workflow,
 * assignment creation, submission, and grading.
 */
public class Main {

    public static void main(String[] args) {

        // Creating student objects
        Student shiva = new Student(1, "Shiva Verma");
        Student aryan = new Student(2, "Aryan");
        Student Jay = new Student(3, "Jay V");
        Student Ashutosh = new Student(4, "Ashutosh");

        // Creating instructor objects
        Instructor Vinay = new Instructor(1, "Vinay");
        Instructor Karthik = new Instructor(2, "Karthik");

        // Creating courses and assigning instructors
        Course java1 = new Course(1, "java1", Karthik);
        Course java2 = new Course(2, "java2", Vinay);

        // Shiva and Aryan request enrollment for Java 1
        // Jay and Ashutosh request enrollment for Java 2
        java1.RequestEnrollment(shiva);
        java1.RequestEnrollment(aryan);
        java2.RequestEnrollment(Jay);
        java2.RequestEnrollment(Ashutosh);

        System.out.println();

        // Instructors view pending enrollment requests
        java1.seeRequestsForApproval();
        java2.seeRequestsForApproval();

        System.out.println();

        // Instructors approve or reject enrollment requests
        java1.ApproveEnrollment(shiva);
        java1.seeRequestsForApproval();
        System.out.println();

        java2.ApproveEnrollment(Jay);
        java2.ApproveEnrollment(Ashutosh);
        java1.RejectEnrollment(aryan);

        // Instructor creates an assignment for Java 1 course
        Assignments generatedAssignment =
                java1.GenerateAssignment("Virtual ClassRoom", LocalDate.now());

        // Student submits assignment
        generatedAssignment.submit(
                shiva,
                "virtual classroom completed",
                LocalDate.now()
        );

        // Instructor grades both on-time and late submissions
        generatedAssignment.DoGradingForOnTime();
        generatedAssignment.DoGradingForLate();

        System.out.println();

        // Display final grades
        generatedAssignment.ShowGrades();
    }
}
