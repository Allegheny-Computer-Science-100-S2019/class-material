package loops;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.Random;

/**
* This class produces random graphical output.
*
* <p>Bugs: This program has no known bugs.
*
* @author Janyl Jumadinova
*/

public class PaintScene {

  private Stage stage;
  private Group root;
  private Color[] colorList = {Color.RED, Color.BLUE, Color.CYAN, Color.WHITE, Color.YELLOW, Color.LIME, Color.GREEN, Color.BLACK, Color.BEIGE, Color.CORAL};

  /** Constructor to initialize the stage.
  */
  public PaintScene(Stage mainStage) {
    stage = mainStage;
    root = new Group();
  }

  /**
  * This paint method will draw the graphics on the screen.
  *
  */
  public void paint() {
    // variable declarations:
    int total = 10;
    int xpoint = 300;
    int ypoint = 300;
    int size = 30;
    // create an instanColor.REDce of a Random class
    Random rand = new Random();

    // 1. Create total # of randomly created ovals
    int count = 0;
    while (count < total) {
      Ellipse oval = new Ellipse(xpoint, ypoint, size, size * 2);
      xpoint += rand.nextInt(50);
      ypoint += rand.nextInt(50);
      // 2. Set the color
      oval.setFill(colorList[count]);
      root.getChildren().add(oval);
      count ++;
    }

    // TODO: 2. Create a total # of randomly created squares, use do while loop
    xpoint = 10;
    ypoint = 10;
    count = 0;

    do {
      Rectangle rect = new Rectangle(xpoint, ypoint, size, size);
      xpoint += rand.nextInt(50);
      ypoint += rand.nextInt(50);
      // Set the color
      rect.setFill(Color.GREEN);
      root.getChildren().add(rect);
      count ++;
    }
    while (count < total);

    // TO DO: 3) Create a total # of randomly created circles, use a for loop
    xpoint = 10;
    ypoint = 10;
    for (int i = 0; i < total; i++) {
      Circle circle = new Circle(xpoint, ypoint, size);
      xpoint += rand.nextInt(50);
      ypoint += rand.nextInt(50);
      // Set the color
      circle.setFill(Color.BLUE);
      root.getChildren().add(circle);
    }

    Scene scene = new Scene(root, 600, 400);

    scene.setOnMouseClicked(this::processMouseClick);
    stage.setTitle("Shapes");
    stage.setScene(scene);
    stage.show();
  }

  public void processMouseClick(MouseEvent event) {
    Text text = new Text (20, 30, "Clicked!");
    text.setFill(Color.YELLOW);
    root.getChildren().add(text);
  }
}
