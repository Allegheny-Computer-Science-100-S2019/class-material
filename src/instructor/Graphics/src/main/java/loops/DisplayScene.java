package loops;

import javafx.application.Application;
import javafx.stage.Stage;

/**
* This class uses another class to produce a random graphical output.
*
* <p>Bugs: This program has no known bugs.
*
* @author Janyl Jumadinova
*/

public class DisplayScene extends Application {
  /**
  * This method creates a window frame to display the graphical scene.
  * It connects to a class PaintScene to produce the graphical output.
  */
  public void start(Stage primaryStage) {

    PaintScene drawing = new PaintScene(primaryStage);
    drawing.paint();

  }

  /** Main method to launch the application.
  */
  public static void main(String[] args) {
    launch(args);
  }
}
