package org.gevernova.JavaEightFeatures.EmployeeDataProcessing;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Entry point for Employee Data Processing.
 * Demonstrates filtering, sorting, grouping,
 * and aggregation using Java 8 Streams.
 */
public class Main {

    /**
     * Filters employees who belong to the Engineering department
     * and have a salary greater than or equal to 80,000.
     *
     * @param Employees List of employees
     */
    public static void filter(List<Employee> Employees) {
        Employees.stream()
                // Filter by department (case-insensitive)
                .filter(s -> s.getDepartment().equalsIgnoreCase("engineering"))
                // Filter by salary condition
                .filter(s -> (s.getSalary() >= 80000))
                // Print filtered employees
                .forEach(System.out::println);
    }

    /**
     * Sorts employees in descending order of salary
     * and prints the sorted list.
     *
     * @param Employees List of employees
     */
    public static void sort(List<Employee> Employees) {
        Employees.stream()
                // Sort employees by salary in decreasing order
                .sorted((a, b) -> b.getSalary() - a.getSalary())
                // Print sorted employees
                .forEach(System.out::println);
    }

    /**
     * Groups employees by department and maps
     * each department to a list of employee names.
     *
     * @param Employees List of employees
     * @return Map of department -> list of employee names
     */
    public static Map<String, List<String>> GroupingByDepartment(List<Employee> Employees) {
        return Employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,                 // Group by department
                        Collectors.mapping(
                                Employee::getName,               // Extract employee name
                                Collectors.toList()              // Collect names into a list
                        )
                ));
    }

    /**
     * Calculates the average salary for each department.
     *
     * @param Employees List of employees
     * @return Map of department -> average salary
     */
    public static Map<String, Double> Aggregate(List<Employee> Employees) {
        return Employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,                 // Group by department
                        Collectors.averagingDouble(
                                Employee::getSalary              // Calculate average salary
                        )
                ));
    }

    public static void main(String[] args) {

        // Create a list of Employee objects
        List<Employee> Employees = new ArrayList<>(
                List.of(
                        new Employee(1, "shiva verma", "engineering", 100000),
                        new Employee(2, "komal raj verma", "dt", 90000),
                        new Employee(3, "shiv kumar", "hr", 90000),
                        new Employee(4, "shivanshu verma", "engineering", 80000),
                        new Employee(5, "shivani verma", "engineering", 60000),
                        new Employee(6, "shivam", "dt", 80000),
                        new Employee(7, "manya", "hr", 80000)
                )
        );

        // Filter employees based on department and salary
        System.out.println("--- filtered list on basis of department and salary ---");
        filter(Employees);

        // Sort employees by salary in descending order
        System.out.println("---- sorted list on basis of decreasing salary -----");
        sort(Employees);

        // Group employees by department and display employee names
        System.out.println("---- create map with department and employees names");
        Map<String, List<String>> mp = GroupingByDepartment(Employees);
        System.out.println(mp);

        // Calculate and display average salary per department
        System.out.println("---- create map with department and average salary");
        Map<String, Double> map = Aggregate(Employees);
        System.out.println(map);
    }
}
