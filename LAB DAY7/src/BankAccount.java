import java.util.Scanner;

public class BankAccount {
  static Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {
    System.out.print("Enter the Account Number: ");
    int accountNumber = sc.nextInt();
    System.out.print("Enter the Account Balance: ");
    double balance = sc.nextDouble();

    Account obj = new Account();
    obj.setAccountNumber(accountNumber);
    obj.setBalance(balance);
    obj.display();
  }
}

class Account {
  Scanner sc = new Scanner(System.in);
  private int accountNumber;
  private double balance;


  public void setAccountNumber(int accountNumber) {
    this.accountNumber = accountNumber;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public void display() {
    System.out.println("The account number is: " + accountNumber);
    System.out.println("The account balance is: " + balance);
  }
}


