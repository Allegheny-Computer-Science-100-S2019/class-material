import java.util.Scanner;

/** A program that uses a switch statement on a character
* to determine if a given character is a lower case vowel or not.
*/
public class SwitchVowel {
  /** Main method to get user's input and to evaluate
  * it using a switch statement.
  */
  public static void main ( String args[] ) {
    Scanner input = new Scanner ( System.in );
    System.out.print ( "Enter a character to test: " );
    char character ;
    character = input.next().charAt(0);
    switch ( character ) {
      case 'a': 	// case labels
      case 'e': 	// separated by :
      case 'i': 	// character
      case 'o': 	// notice use of ' '
      case 'u': 	// marks for char tests
        System.out.println (character + " is a lowercase vowel");
        break;
      default:
        System.out.println (character + " is not a lowercase vowel");
    }
  }
}
