import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (true){
      System.out.println("\nEnter the choice to Access the Lab Assignment");
      System.out.println("1. Arithmetic Operations");
      System.out.println("2. Commission Charges");
      System.out.println("3. Vowel or not");
      System.out.println("4. Count the number");
      System.out.println("5. Random number");
      System.out.println("6. ASCII value");
      System.out.println("7. Exit");
      System.out.print("Enter the Choice: ");
      int Choice = sc.nextInt();
      switch (Choice) {
        case 1:
          ArithmaticOperator();
          break;
        case 2:
          MainEmployeeCommission();
          break;
        case 3:
          EnglishAlphabet();
          break;
        case 4:
          CountNumber();
          break;
        case 5:
          RandomNumber();
          break;
        case 6:
          ASCII();
          break;
        case 7:
          System.exit(0);
        default:
          System.out.println("Invalid Option !");
      }
    }
  }
  public static void ArithmaticOperator() {
    Scanner sc = new Scanner(System.in);
    while (true) {
      System.out.println("Enter two numbers: ");
      System.out.print("A = ");
      int A = sc.nextInt();
      System.out.print("B = ");
      int B = sc.nextInt();
      System.out.println("\nEnter the arithmetic operators to do the operation: \n");
      System.out.println("1. Add (+)");
      System.out.println("2. Sub (-)");
      System.out.println("3. Multiply (*)");
      System.out.println("4. Divide (/)");
      System.out.println("5. Modulo (%)\n");
      System.out.println("6. Exit");
      System.out.print("\nEnter Choice: ");
      int Choice = sc.nextInt();
      switch (Choice) {
        case 1:
          System.out.println(A+B);
          break;
        case 2:
          System.out.println(A - B);
          break;
        case 3:
          System.out.println(A * B);
          break;
        case 4:
          System.out.println(A / B);
          break;
        case 5:
          System.out.println(A % B);
          break;
        case 6:
          System.exit(0);
        default:
          System.out.println("Invalid Choice! Enter a valid choice! ");
      }
    }
  }
  public static void MainEmployeeCommission() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the sale: ");
    double sale = sc.nextDouble();
    double salary = 6500;
    double commission;
    // Conditions
    if (sale <= 500) {
      commission = sale * 0.05;
    } else if (sale <= 2000 ) {
      commission = 35 + (sale - 500) * 0.1;
    } else if (sale <= 5000) {
      commission = 185 + (sale - 2000) * 0.12;
    } else {
      commission = sale * 0.12;
    }
    double totalSalary = salary + commission;
    System.out.println("Commission earned: "+commission);
    System.out.println("Total Salary: "+ totalSalary);
  }
  public static void EnglishAlphabet() {
    Scanner sc = new Scanner(System.in);
    char ch = sc.next().charAt(0);
    switch (ch) {
      case 'a':
      case 'e':
      case 'i':
      case 'o':
      case 'u':
      case 'A':
      case 'E':
      case 'I':
      case 'O':
      case 'U':
        System.out.println(ch + " is vowel");
        break;
      default:
        System.out.println(ch + " is consonant");
    }
  }
  // Count the number
  public static void CountNumber() {
    Scanner sc = new Scanner(System.in);
    while (true) {
      System.out.println("1. While Loop");
      System.out.println("2. Do while loop");
      System.out.println("3. Exit");
      System.out.print("Enter the choice: ");
      int Choice = sc.nextInt();
      switch (Choice) {
        case 1:
          UsingWhileLoop();
          break;
        case 2:
          UsingDoWhileLoop();
          break;
        case 3:
          System.exit(0);
        default:
          System.out.println("! Invalid option");
      }
    }
  }
  public static void UsingWhileLoop() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Number to Count: ");
    int number = sc.nextInt();
    int count = 0;
    while (number != 0) {
      number /= 10;
      count ++;
    }
    System.out.println("The Count of the numbers is: "+count);
  }
  public static void UsingDoWhileLoop() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Number to Count: ");
    int number = sc.nextInt();
    int count = 0;
    do {
      number /= 10;
      count ++;
    }while (number != 0);
    System.out.println("The Count of the numbers is: "+count);
  }
  // Generate 4 Random numbers
  public static void RandomNumber() {
    System.out.println("Random Numbers: ");
    for (int i = 0; i < 4; i++) {
      double randomNumber = Math.random();
      System.out.println("Random Number " + (i+1) + ": " + randomNumber);
    }
  }
  public static void ASCII() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a Digit to get the ASCII: ");
    char digit = sc.next().charAt(0);
    System.out.println("ASCII value is "+ (int) digit);
  }
}