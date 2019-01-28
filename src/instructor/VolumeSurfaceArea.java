/** Program to calculate the volume
* and the surface area of the sphere.
* @author Janyl Jumadinova
*/
public class VolumeSurfaceArea {

  /** Main method that creates the needed
  * variables and has expressions to perform
  * the neccessary calculations.
  */
  public static void main (String [] args) {
    // variable declarations
    int radius;
    double area;
    double pi;

    // initialize variables
    pi = 3.14;
    radius = 10;

    // expressions
    area = 3 * pi * radius * radius;
    System.out.println("Surface Area of the Sphere: " + area);
  }
}
