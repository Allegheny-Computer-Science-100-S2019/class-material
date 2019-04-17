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
      case 'a': case 'A':	// case labels
      case 'e': case 'E':	// separated by :
      case 'i': case 'I':	// character
      case 'o': case 'O':	// notice use of ' '
      case 'u': case 'U':	// marks for char tests
        System.out.println (character + " is a  vowel");
        break;
      default:
        System.out.println (character + " is not a  vowel");
    }
  }
}
