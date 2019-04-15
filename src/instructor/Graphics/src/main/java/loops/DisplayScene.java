package loops;

import java.util.Date;
import javax.swing.JFrame;

/**
 * This class uses another class to produce a random graphical output.
 *
 * <p>Bugs: This program has no known bugs.
 *
 * @author Janyl Jumadinova
 */

public class DisplayScene {
  private static final int CANVAS_WIDTH = 600;
  private static final int CANVAS_HEIGHT = 400;
  
  /**
   * This method creates a window frame to display the graphical scene.
   * It connects to a class PaintScene to produce the graphical output.
  */
  public static void main(String[] args) {
    JFrame window = new JFrame("Janyl Jumadinova " + new Date());

    // Add the drawing canvas and do necessary things to
    // make the window appear on the screen
    window.getContentPane().add(new PaintScene());
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // make the window visible on the computer screen
    window.setVisible(true);
    // set the size of the window that the program displays
    window.setSize(CANVAS_WIDTH, CANVAS_HEIGHT);

  }
}
