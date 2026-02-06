 
package loginsystem1;

import java.util.Scanner;

/**
 * A simple Java program that performs a login function with 3 tries.
 */
public class LoginSystem1 {
    public static void main(String[] args) {
        // Define the correct credentials for validation
        String correctUsername = "user"; 
        String correctPassword = "password123"; 
        // Set the maximum number of login attempts allowed
        int maxAttempts = 3;
        int attemptsMade = 0;
        // Flag to check if login was successful
        boolean loggedIn = false;

        // Scanner object for reading input from the console
        Scanner scanner = new Scanner(System.in);
        
        // Loop to give the user 3 tries to log in
        while (attemptsMade < maxAttempts) {
            System.out.print("Enter username: ");
            String username = scanner.nextLine();

            System.out.print("Enter password: ");
            // Note: Basic Scanner input reads the whole line.
            // Printing '*' after input to simulate obfuscation as requested.
            String password = scanner.nextLine(); 
            // Print asterisks equivalent to the password length for visual effect
            System.out.print("Password entered: ");
            for (int i = 0; i < password.length(); i++) {
                System.out.print("*");
            }
            System.out.println(); // Newline after asterisks

            // Check if entered credentials match the correct ones
            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("Login successful! Welcome, " + username + "."); 
                // Comment: The user successfully logged in on this attempt
                loggedIn = true;
                break; // Exit the loop as the user is logged in
            } else {
                attemptsMade++;
                // Check if there are remaining attempts
                if (attemptsMade < maxAttempts) {
                    System.out.println("Invalid username or password. You have " + (maxAttempts - attemptsMade) + " tries remaining."); 
                    // Comment: Invalid attempt, informing user of remaining tries
                } else {
                    System.out.println("Invalid username or password. Maximum attempts reached. Account locked."); 
                    // Comment: Invalid attempt, user ran out of tries
                }
            }
        }

        // Close the scanner resource
        scanner.close();
    }
}