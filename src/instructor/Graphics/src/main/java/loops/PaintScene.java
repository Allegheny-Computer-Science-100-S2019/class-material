package loops;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JApplet;

/**
 * This class produces random graphical output.
 *
 * <p>Bugs: This program has no known bugs.
 *
 * @author Janyl Jumadinova
 */

public class PaintScene extends JApplet {

  /**
   * This pain method will draw the graphics on the screen.
   *
  */
  public void paint(Graphics page) {
    // variable declarations:
    int total = 10;
    int xpoint = 10;
    int ypoint = 10;
    int size = 30;
    // create an instance of a Random class
    Random rand = new Random();

    // 1. Set the color
    page.setColor(Color.red);
    // 2. Create total # of randomly created circles
    int count = 0;
    while (count < total) {
      page.fillOval(xpoint, ypoint, size, size * 2);
      xpoint += rand.nextInt(50);
      ypoint += rand.nextInt(50);
      count ++;
    }

    // TO DO: 1) Set a different Color

    // TO DO: 2) Create a total # of randomly created squares, use do while loop
    // 2.1) Reset x and y starting location
    // 2.2) Reset the count
    // 2.3) Use fillRect method

    // TO DO: 3) Set a different Color

    // TO DO: 4) Create a total # of randomly created circles, use a for loop
    // 4.1) Reset x and y starting location
    // 4.2) Reset the count
    // 4.3) Use fillOval method

  }
}
