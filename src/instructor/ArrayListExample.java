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

    // create an instance of an ArrayList
    ArrayList<String> wordList = new ArrayList<String>();

    while(input.hasNext()) {
      String word = input.next();
      wordList.add(word);
    }
    System.out.println(wordList.size());

    int count = 0;
    int count1 = 0;
    while(count < wordList.size()) {
      //System.out.println("Inside the while loop");
      String word = wordList.get(count);
      if(word.equals("addiction")) {
        System.out.println(word);
        count1++;
      }
      count++;
    }
    System.out.println("count " + count1);
  }
}
