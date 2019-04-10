import java.io.IOException;
import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class FirstNames {
  public static void main (String [] args) throws IOException {
    String[] names = new String[41];

    File file = new File("names.txt");
    Scanner input = new Scanner(file);

    // read from the file and save into an array
    int index = 0;
    while(input.hasNext()) {
      String name = input.next();
      names[index] = name;
      index++;
    }
    Arrays.sort(names);
    // print an array
    index = 0;
    do {
      System.out.println(names[index]);
      index++;
    } while(index < names.length);

    // select certain letters
    for(index = 0; index < names.length; index++) {
      if(names[index].startsWith("A")) {
        System.out.println("-----");
        System.out.println(names[index]);
      }
    }
  }
}
