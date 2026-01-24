package org.gevernova.JavaEightFeatures.VirtualClassRoom;


import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

/**
 * Represents an assignment in a virtual classroom.
 * Handles submissions (on-time and late) and grading logic.
 */
public class Assignments {

    // Title of the assignment
    String title;

    // Deadline date for the assignment
    LocalDate deadline;

    // Stores on-time submissions: Student -> Submitted Work
    Map<Student, String> Normalsubmissions = new HashMap<>();

    // Stores late submissions: Student -> Submitted Work
    Map<Student, String> Latesubmissions = new HashMap<>();

    // Stores grades awarded to students: Student -> Marks
    Map<Student, Integer> grades = new HashMap<>();

    /**
     * Constructor to initialize assignment details.
     *
     * @param title    Title of the assignment
     * @param deadline Submission deadline
     */
    public Assignments(String title, LocalDate deadline) {
        this.deadline = deadline;
        this.title = title;
    }

    /**
     * Allows a student to submit their assignment.
     * Classifies the submission as on-time or late based on the deadline.
     *
     * @param Student        Student who is submitting
     * @param Work           Submitted work content
     * @param SubmissionDate Date of submission
     */
    public void submit(Student Student, String Work, LocalDate SubmissionDate) {
        // Check if submission is after the deadline
        if (SubmissionDate.isAfter(deadline)) {
            System.out.println("Late Submission By " + Student.name);
            Latesubmissions.put(Student, Work);
            return;
        }
        // On-time submission
        Normalsubmissions.put(Student, Work);
    }

    /**
     * Assigns full marks to all students
     * who submitted the assignment on time.
     */
    public void DoGradingForOnTime() {
        for (Student s : Normalsubmissions.keySet()) {
            Grading(s, 10);
        }
    }

    /**
     * Assigns reduced marks to students
     * who submitted the assignment late.
     */
    public void DoGradingForLate() {
        for (Student s : Latesubmissions.keySet()) {
            Grading(s, 9);
        }
    }

    /**
     * Displays grades of all students.
     */
    public void ShowGrades() {
        for (var v : grades.entrySet()) {
            System.out.println(v.getKey().name + " -> " + v.getValue());
        }
    }

    /**
     * Assigns marks to a specific student.
     *
     * @param Student Student to be graded
     * @param marks   Marks awarded
     */
    public void Grading(Student Student, int marks) {
        grades.put(Student, marks);
    }
}

