package org.gevernova.JavaEightFeatures.UserRegistration;

import java.util.Scanner;

/**
 * Entry point for the User Registration problem.
 * Demonstrates user input validation using Java 8
 * functional interfaces and lambda expressions.
 */
public class Main {

    public static void main(String[] args) {

        // Scanner object to read user input from console
        Scanner sc = new Scanner(System.in);

        // Validation for first name:
        // Starts with capital letter and has minimum 3 characters
        UserValidation<String, Boolean> FirstNameValidation =
                (String FirstName) -> FirstName.matches("^[A-Z][a-z]{2,}$");

        // Validation for last name:
        // Starts with capital letter and has minimum 3 characters
        UserValidation<String, Boolean> LastNameValidation =
                (String LastName) -> LastName.matches("^[A-Z][a-z]{2,}$");

        // Validation for email format
        UserValidation<String, Boolean> EmailValidation =
                (String Email) -> Email.matches(
                        "^[a-zA-Z0-9]+[.+_-]?[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}$"
                );

        // Validation for mobile number:
        // Country code (2 digits), space, and 10-digit mobile number
        UserValidation<String, Boolean> MobileValidation =
                (String Mobile) -> Mobile.matches("^[0-9]{2}\\s[0-9]{10}$");

        // Validation for password:
        // Minimum 8 characters, at least one uppercase letter,
        // one digit, and one special character
        UserValidation<String, Boolean> PasswordValidation =
                (String Password) -> Password.matches(
                        "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=]).{8,}$"
                );

        System.out.println("------------------------------");
        System.out.println("Please Enter The First Name");

        // Read and validate first name
        String FirstName = sc.next();
        while (!FirstNameValidation.ValidateUserCredentials(FirstName)) {
            System.out.println("Please Provide the valid input");
            FirstName = sc.next();
        }

        System.out.println("------------------------------");
        System.out.println("Please Enter The Last Name");

        // Read and validate last name
        String LastName = sc.next();
        while (!LastNameValidation.ValidateUserCredentials(LastName)) {
            System.out.println("Please Provide the valid input");
            LastName = sc.next();
        }

        System.out.println("------------------------------");
        System.out.println("Please Enter The Email");

        // Read and validate email
        String Email = sc.next();
        while (!EmailValidation.ValidateUserCredentials(Email)) {
            System.out.println("Please Provide the valid input");
            Email = sc.next();
        }

        System.out.println("------------------------------");
        System.out.println("Please Enter The Mobile Number");

        // Read and validate mobile number
        String Mobile = sc.nextLine();
        while (!MobileValidation.ValidateUserCredentials(Mobile)) {
            System.out.println("Please Provide the valid input");
            Mobile = sc.nextLine();
        }

        System.out.println("------------------------------");
        System.out.println("Please Enter The Password");

        // Read and validate password
        String Password = sc.next();
        while (!PasswordValidation.ValidateUserCredentials(Password)) {
            System.out.println("Please Provide the valid input");
            Password = sc.next();
        }

        System.out.println("------------------------------");

        // Successful registration message
        System.out.println(
                FirstName + " " + LastName + " Congratulations on successful Registration"
        );
    }
}