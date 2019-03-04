import java.util.Scanner;

/** Create a class GradeBookMain to instantiate GradeBook class
*/

public class GradeBookMain {
  /** main method where execution begins.
  */
  public static void main (String args[]) {

	   // call the constructor
    GradeBook myGradeBook  = new GradeBook ();

    // call the displayMessage method
    myGradeBook.displayMessage("CMPSC 100");
  }
}
