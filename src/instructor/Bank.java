import java.util.Scanner;

public class Bank {
  public static void main (String [] args) {
    Account account1 = new Account(10023);
    Account account2 = new Account(20345, 100.0);
    Person johnson = new Person("Ayana Johnson");
    johnson.setAddress("520 N. Main St., Meadville");
    Account account3 = new Account(30045, 1000, johnson);

    System.out.println("Account Holder Information: \n"
            + account3.getPerson().getName() + "\n "
            + account3.getPerson().getAddress());
    System.out.println("Account Balance: $"
            + account3.getBalance());

    double amount = 0;
    Scanner userInput = new Scanner(System.in);

    while(amount <= 0) {
      System.out.print(johnson.getName() + ", please  enter a positive amount to deposit: ");
      amount = userInput.nextDouble();
    }
    account3.setBalance(amount);
    System.out.println("Account Balance: $"
            + account3.getBalance());
  }
}
