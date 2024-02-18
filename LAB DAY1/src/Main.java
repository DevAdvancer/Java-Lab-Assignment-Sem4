import java.util.*;

public class Main {
  public static void main(String[] arg) {
    Scanner sc = new Scanner(System.in);
    while (true){
      System.out.println();
      System.out.println("1. Prime Number Check.");
      System.out.println("2. Swap Number.");
      System.out.println("3. Fibonacci Series print.");
      System.out.println("4. String Reverse.");
      System.out.println("5. Exit.");
      System.out.print("Chose From the options: ");
      int num = sc.nextInt();
      switch (num) {
        case 1:
          PrimeCheck();
          break;
        case 2:
          SwapNumber();
          break;
        case 3:
          FibonacciSeries();
          break;
        case 4:
          StringReverse();
          break;
        case 5:
          System.exit(0);
        default:
          System.out.println("Invalid Choice! ");
      }
    }
  }
  public static void PrimeCheck() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number to check the number is prime or not: ");
    int num = sc.nextInt();
    boolean flag = num == 0 || num == 1;
    for (int i = 2; i <= num / 2; i++) {
      if (num % i == 0) {
        flag = true;
        break;
      }
    }
    if (!flag) {
      System.out.println("The number is prime");
    } else {
      System.out.println("The number is not prime");
    }
  }
  public static void SwapNumber() {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int num1 = sc.nextInt();
    System.out.println("a ="+num);
    System.out.println("b ="+num1);
    num = num + num1;
    num1 = num - num1;
    num = num - num1;
    System.out.println("After Swap: ");
    System.out.println("a = "+ num);
    System.out.println("b = "+ num1);
  }
  public static void FibonacciSeries() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the range to get the series: ");
    int rg = sc.nextInt();
    int a = 0;
    int b = 1;
    System.out.print(a);
    System.out.print("\t"+b);
    int sum;
    for (int i=0; i < rg; i++) {
      sum = a + b;
      a = b;
      b = sum;
      System.out.print("\t"+sum);
    }
    System.out.println();
  }
  public static void StringReverse() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number to Reverse the string: ");
    String n = sc.next();
    String rs = new StringBuilder(n).reverse().toString();
    System.out.println("The String After Reverse: "+ rs);
  }
}