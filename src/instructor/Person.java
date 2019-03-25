public class Person {
  private String name;
  private String address;

  public Person (String name1) {
    name = name1;
    address = null;
  }
  public void setName(String name1) {
    name = name1;
  }
  public String getName() {
    return name;
  }
  public void setAddress(String addr) {
    address = addr;
  }
  public String getAddress() {
    return address;
  }
}
