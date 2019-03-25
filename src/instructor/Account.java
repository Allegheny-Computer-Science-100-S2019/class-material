/** Account class to create an account.
*/
public class Account {
  private int accNo;
  private double balance;
  private Person person;

  /** Constructor with account number.
  */
  public Account (int acc) {
    accNo = acc;
    balance = 0;
    Person = null;
  }
  /** Constructor with account number
  * and a balance.
  */
  public Account (int acc, double bal) {
    accNo = acc;
    balance = bal;
    Person = null;
  }
  /** Constructor with account number
  * and a balance and a Person.
  */
  public Account (int acc, double bal, Person per) {
    accNo = acc;
    balance = bal;
    Person = per;
  }
  public double getBalance() {
    return balance;
  }
  public void setBalance(double change) {
    if((balance + change) > 0) {
      balance += change;
    } else {
      System.out.println("Insufficient funds");
    }
  }
  public Person getPerson() {
    return person;
  }
  public void setPerson(Person per) {
    person = per;
  }
}
