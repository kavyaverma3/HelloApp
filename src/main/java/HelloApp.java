/**
 * HelloApp.java - A simple Java application that Displays "Hello, Name!" to
 * the console using command-line arguments.
 *
 * This is the second step in the HelloApp journey, where we extend the basic
 * "Hello, World!" program to accept a name as a command-line argument and
 * display a personalized greeting to the console.
 *
 * @author Developer Name
 * @version 2.0
 */

/**
 * Key Java Concepts Used:
 * 1. Command-Line Arguments - Accepting input from the user
 * 2. String Array - Storing command-line arguments
 * 3. String Concatenation - Combining strings to form a message
 * 4. System.out.println() - Standard output stream for printing
 */
public class HelloApp {
    public static void main(String[] args) {
        String name = args[0];
        System.out.println("Hello, " + name + "!");
    }
}