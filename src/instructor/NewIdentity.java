import java.util.Scanner;
import java.util.Random;

/** Class to create random fields.
*/
public class NewIdentity {

  /** Use methods of the Random class.
  */
  public static void main (String [] args) {
    String firstName;
    String lastName;
    int age;

    Scanner scan = new Scanner (System.in);
    Random rand = new Random();

    // ask for user's input and read it interface
    System.out.println("Please enter your first name");
    firstName = scan.nextLine();
    System.out.println("Please enter your last name");
    lastName = scan.nextLine();
    System.out.println("Please enter your age");
    age = scan.nextInt();

    int index = rand.nextInt(firstName.length());
    char letter = firstName.charAt(index);
    firstName = firstName.replace(letter, 't');
    System.out.println("New first name is: " + firstName);
  }
}
