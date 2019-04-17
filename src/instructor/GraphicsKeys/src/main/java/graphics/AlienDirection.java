package graphics;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.IOException;

/***  AlienDirection.java       Author: Lewis/Loftus
* Modified by Janyl Jumadinova
*  Demonstrates the handling of keyboard events.
*/
public class AlienDirection extends Application {
  private int jump = 10;

  private ImageView imageView;

  /**  Displays an image that can be moved using the arrow keys.
  */
  public void start(Stage primaryStage) throws IOException {
    FileInputStream input = new FileInputStream("alien.png");
    Image alien = new Image(input);

    imageView = new ImageView(alien);
    imageView.setX(20);
    imageView.setY(20);

    Group root = new Group(imageView);

    Scene scene = new Scene(root, 400, 200, Color.BLACK);
    scene.setOnKeyPressed(this::processKeyPress);

    primaryStage.setTitle("Alien Direction");
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  /**  Modifies the position of the image view when
  * an arrow key is pressed.
  */
  public void processKeyPress(KeyEvent event) {
    switch (event.getCode()) {
      case UP:
        imageView.setY(imageView.getY() - jump);
        break;
      case DOWN:
        imageView.setY(imageView.getY() + jump);
        break;
      case RIGHT:
        imageView.setX(imageView.getX() + jump);
        break;
      case LEFT:
        imageView.setX(imageView.getX() - jump);
        break;
      default:
        break;  // do nothing if it's not an arrow key
    }
  }

  /** Main method to launch the application.
  */
  public static void main(String[] args) {
    launch(args);
  }
}
