/** Class Example
* 1 April, 2019
* Purpose: This program demonstrates the usage of
* the ArrayList and a while loop.
*/
//==========================================
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ArrayListExample {
  public static void main (String args[]) {
    // declare the starting file and scanner
    File inputsFile = null;
    Scanner input = null;
    // connect the scanner to the input file
    try {
      inputsFile = new File("story.txt");
      input = new Scanner(inputsFile);
    } catch (FileNotFoundException noFile) {
      System.out.println("Unable to locate file");
    }


  }
}
