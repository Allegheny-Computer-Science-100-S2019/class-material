import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/** Program to perform basic graphing functions
@author Janyl Jumadinova
*/
public class GraphingExample extends Application {
    /** main method to create and display
    * various shapes.
    */
    public void start(Stage primaryStage) {
      Line line = new Line (10, 50, 150, 200);

      Rectangle rect = new Rectangle (50, 50, 50, 50);
      rect.setStroke(Color.RED);
      rect.setStrokeWidth(2);
      rect.setFill(null);

      Circle circle = new Circle (200, 230, 20);
      circle.setFill(Color.BLUE);

      Ellipse ellipse = new Ellipse (260, 280, 130, 40);
      ellipse.setFill(Color.GREEN);

      Group rounds = new Group(circle, ellipse);

      Group root = new Group(rounds, line, rect);
      Scene scene = new Scene(root, 600, 400);

      primaryStage.setTitle("Example");
      primaryStage.setScene(scene);
      primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
