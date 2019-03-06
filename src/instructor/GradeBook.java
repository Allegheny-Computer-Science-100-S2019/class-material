/** Define class GradeBook with a member method displayMessage.
*/

public class GradeBook {

  // instance variable
  private String courseName;
  private String courseTag;

  /** Constructor.
  */
  public GradeBook (String name) {
    courseName = name;
    System.out.println("Course name " + courseName);
  }

  /** method to display a welcome message.
  */
  public void displayMessage(String name) {
    System.out.println("Welcome to " + name);
  }

  /** method to return the courseName.
  */
  public String getCourseName() {
    return courseName;
  }

  /** method to update the course name.
  */
  public void setCourseName(String name) {
    courseName = name;
  }

}
