package example;

import org.jfugue.pattern.Pattern;
import org.jfugue.player.Player;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class MusicGenerator {

  public static void main(String[] args) {

    File inputFile = null;
    Scanner scanner = null;

    try {
      inputFile = new File("input/user_inputs.txt");
      scanner = new Scanner(inputFile);
    } catch (FileNotFoundException noFile) {
      System.out.println("Unable to find the file");
    }

    String instrument = scanner.next();
    String tempo = scanner.next();

    // if statement that map "p" to piano
    if(instrument.equals("p")) {
      instrument = "piano";
    }
    
    String choice = "I[" + instrument + "] T[" + tempo + "]";

    // TODO: create your own music strings
    String part1 = "C5q C5q C5i. D5s E5q E5i. D5s E5i. F5s G5h";
    String part2 = "C6i C6i C6i G5i G5i G5i E5i E5i E5i C5i";
    String part3 = "C5i C5i";
    String part4 = "G5i. F5s E5i. D5s C5h";

    //String music = "A B C";

    Pattern piece = new Pattern();
    piece.add(choice);
    piece.add(part1);
    piece.add(part2).add(part3);
    piece.add(part4);

    piece.repeat(2);

    Player player = new Player();
    player.play(piece);
  }
}
