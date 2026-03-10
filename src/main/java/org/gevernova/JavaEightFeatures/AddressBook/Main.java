package org.gevernova.JavaEightFeatures.AddressBook;

/**
 * Entry point for the Address Book application.
 * Demonstrates adding members and performing
 * various search, grouping, counting, and sorting operations
 * using Java 8 Streams.
 */
public class Main {

    public static void main(String[] args) {

        // Create an AddressBook instance
        AddressBook book = new AddressBook();

        // Add members to the address book
        book.addMembers(new Person("Shiva", "Verma", "Gaya", "800", "Bihar"));
        book.addMembers(new Person("Shiva", "Kumar", "Bhagalpur", "400", "Assam"));
        book.addMembers(new Person("Komal", "Verma", "Siwan", "300", "Maharashtra"));
        book.addMembers(new Person("Aryan", "Verma", "Jehanabad", "100", "Kerala"));

        // Search members by city or state
        System.out.println("--------------------Search By City Or State--------------------");
        book.searchByCityOrState("Gaya");

        // Group and display members by city
        System.out.println("--------------------Group By City--------------------");
        book.GroupByCity();

        // Group and display members by state
        System.out.println("--------------------Group By State--------------------");
        book.GroupByState();

        // Display count of members grouped by city
        System.out.println("--------------------Print By Count of City--------------------");
        book.printCountByCity();

        // Display count of members grouped by state
        System.out.println("--------------------Print By Count of State--------------------");
        book.printCountByState();

        // Display members sorted by name
        System.out.println("--------------------Print By Name in sorted order--------------------");
        book.printSortedByName();

        // Display members sorted by state
        System.out.println("--------------------Print By state in sorted order--------------------");
        book.printSortedByState();

        // Display members sorted by ZIP code
        System.out.println("--------------------Print By zip in sorted order--------------------");
        book.printSortedByZip();

        // Display members sorted by city
        System.out.println("--------------------Print By City in sorted order--------------------");
        book.printSortedByCity();

        System.out.println("--------------------------------------------------------------");
    }
}
