import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (true) {
      System.out.println("\nPattern print Menu");
      System.out.println("1. Pattern 1");
      System.out.println("2. Pattern 2");
      System.out.println("3. Pattern 3");
      System.out.println("4. Pattern 4");
      System.out.println("5. Pattern 5");
      System.out.println("6. Pattern 6");
      System.out.println("7. Pattern 7");
      System.out.println("8. Pattern 8");
      System.out.println("9. Pattern 9");
      System.out.println("10. Pattern 10");
      System.out.println("11. Exit");
      System.out.print("Enter the Choice: ");
      int choice = sc.nextInt();
      switch (choice) {
        case 1:
          pattern1();
          break;
        case 2:
          pattern2();
          break;
        case 3:
          pattern3();
          break;
        case 4:
          pattern4();
          break;
        case 5:
          pattern5();
          break;
        case 6:
          pattern6();
          break;
        case 7:
          pattern7();
          break;
        case 8:
          pattern8();
          break;
        case 9:
          pattern9();
          break;
        case 10:
          pattern10();
          break;
        case 11:
          System.exit(0);
        default:
          System.out.println("! Error Invalid option");
      }
    }
  }

  private static void pattern1() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Range: ");
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= i; j++){
        System.out.print("*");
      }
      System.out.print("\n");
    }
  }

  private static void pattern2() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the range: ");
    int n = sc.nextInt();
    for (int i = 0; i < n ; i++) {
      for (int j = 0; j <= i*2; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  private static void pattern3() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the range: ");
    int n = sc.nextInt();
    int count=1;
    for(int i=n; i>=1; i--)
    {
      for(int j=(i-1); j>=1; j--)
      {
        System.out.print(" ");
      }
      for(int k=1; k<=count; k++)
        System.out.print("* ");
      count++;
      System.out.println();
    }
  }

  private static void pattern4() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the range: ");
    int n = sc.nextInt();
    for (int i = 1; i < n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j);
      }
      System.out.println();
    }
  }

  private static void pattern5() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the range: ");
    int n = sc.nextInt();
    char num = (char)65;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print(num);
      }
      num ++;
      System.out.println();
    }
  }

  private static void pattern6() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the range: ");
    int n = sc.nextInt();
    for (int i = n; i > 0; i--) {
      for (int j = 0; j < i; j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }

  private static void pattern7() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the range: ");
    int n = sc.nextInt();
    for (int i = n; i >= 1; i--) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j);
      }
      System.out.println();
    }
  }

  private static void pattern8() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the range: ");
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
      for (int j = n - i - 2; j > 0; j--) {
        System.out.print(" ");
      }
      for (int k = 0; k < 2 * i + 1; k++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  private static void pattern9() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the range: ");
    int n = sc.nextInt();
    for (int i = n - 1; i >= 0; i--) {
      for (int j = 0; j < n - i - 1; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k < 2 * i + 1; k++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  private static void pattern10() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the range: ");
    int n = sc.nextInt();
    int num = 1;
    for (int i = 1; i < n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(num++);
      }
      System.out.println();
    }
  }
}
