import java.util.Scanner;

/** Program to convert some metrics.
*/
public class Conversion {

  /** Use Scanner class to get user's input.
  * Convert time metrics using expressions.
  */
  public static void main (String [] args) {
    Scanner userInput = new Scanner (System.in);

    System.out.println("Enter your name: ");
    String name = userInput.nextLine();
    System.out.println("Your name is " + name);

    // get user's age
    System.out.println("Enter your age: ");
    int age = userInput.nextInt();
    System.out.println("Your age is " + age);

    // Conversion
    int result = age * 365 * 24;
    System.out.println("Your age in hours is: " + result);

    // Get user's color preference
    System.out.println("Enter a color of your choice");
    String userColor = userInput.next();
    System.out.println("You entered: " + userColor);


  }
}
