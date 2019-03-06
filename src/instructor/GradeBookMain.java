import java.util.Scanner;

/** Create a class GradeBookMain to instantiate GradeBook class
*/

public class GradeBookMain {
  /** main method where execution begins.
  */
  public static void main (String args[]) {

	   // call the constructor
    // GradeBook myGradeBook  = new GradeBook ();

    // call the displayMessage method
    // myGradeBook.displayMessage("CMPSC 100");

    // call the contructor with parameter
    GradeBook csGradeBook = new GradeBook ("CS 300");
    csGradeBook.setCourseName("CS 200");
    System.out.println(csGradeBook.getCourseName());
  }
}
