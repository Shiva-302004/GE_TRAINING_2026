package org.gevernova.JavaEightFeatures.AddressBook;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 Represents an Address BookProvides functionalities to add members, search,group, count, and sort persons using Java 8 Streams.
 */
public class AddressBook {

    // Stores all members of the address book
    private List<Person> Members = new ArrayList<>();

    /**
     * Adds a person to the address book.
     * Ensures no duplicate entry of the same person exists.
     *
     * @param person Person to be added
     * @return true if added successfully, false if duplicate found
     */
    public boolean addMembers(Person person) {
        // Check if person already exists in the address book
        boolean exists = Members.stream().anyMatch(p -> p.equals(person));
        if (exists) {
            System.out.println("Duplicate entry found");
            return false;
        }
        Members.add(person);
        return true;
    }

    /**
     * Searches and displays persons belonging to a given city or state.
     *
     * @param city City or state name to search
     */
    public void searchByCityOrState(String city) {
        Members.stream()
                .filter(p -> p.getCity().equalsIgnoreCase(city)
                        || p.getState().equalsIgnoreCase(city))
                .forEach(a -> System.out.println(
                        a.firstName + " " + a.lastName + " "
                                + a.city + " " + a.state + " " + a.zip
                ));
    }

    /**
     * Groups and displays persons by city.
     */
    public void GroupByCity() {
        Members.stream()
                .collect(Collectors.groupingBy(Person::getCity))
                .forEach((city, list) -> {
                    System.out.println("City: " + city);
                    list.forEach(a -> System.out.println(
                            a.firstName + " " + a.lastName + " "
                                    + a.city + " " + a.state + " " + a.zip
                    ));
                });
    }

    /**
     * Groups and displays persons by state.
     */
    public void GroupByState() {
        Members.stream()
                .collect(Collectors.groupingBy(Person::getState))
                .forEach((state, list) -> {
                    System.out.println("City: " + state);
                    list.forEach(a -> System.out.println(
                            a.firstName + " " + a.lastName + " "
                                    + a.city + " " + a.state + " " + a.zip
                    ));
                });
    }

    /**
     * Prints count of persons grouped by city.
     */
    public void printCountByCity() {
        Members.stream()
                .collect(Collectors.groupingBy(
                        Person::getCity, Collectors.counting()))
                .forEach((city, count) ->
                        System.out.println(city + "->" + count));
    }

    /**
     * Prints count of persons grouped by state.
     */
    public void printCountByState() {
        Members.stream()
                .collect(Collectors.groupingBy(
                        Person::getState, Collectors.counting()))
                .forEach((state, count) ->
                        System.out.println(state + "->" + count));
    }

    /**
     * Sorts and displays persons by name.
     */
    public void printSortedByName() {
        Members.stream()
                .sorted((a, b) ->
                        (a.firstName + b.lastName)
                                .compareTo(a.firstName + b.lastName))
                .forEach(a -> System.out.println(
                        a.firstName + " " + a.lastName + " "
                                + a.city + " " + a.state + " " + a.zip
                ));
    }

    /**
     * Sorts and displays persons by city.
     */
    public void printSortedByCity() {
        Members.stream()
                .sorted((a, b) -> a.getCity().compareTo(b.getCity()))
                .forEach(a -> System.out.println(
                        a.firstName + " " + a.lastName + " "
                                + a.city + " " + a.state + " " + a.zip
                ));
    }

    /**
     * Sorts and displays persons by state.
     */
    public void printSortedByState() {
        Members.stream()
                .sorted((a, b) -> a.getState().compareTo(b.getState()))
                .forEach(a -> System.out.println(
                        a.firstName + " " + a.lastName + " "
                                + a.city + " " + a.state + " " + a.zip
                ));
    }

    /**
     * Sorts and displays persons by ZIP code.
     */
    public void printSortedByZip() {
        Members.stream()
                .sorted((a, b) -> a.getZip().compareTo(b.getZip()))
                .forEach(a -> System.out.println(
                        a.firstName + " " + a.lastName + " "
                                + a.city + " " + a.state + " " + a.zip
                ));
    }
}
