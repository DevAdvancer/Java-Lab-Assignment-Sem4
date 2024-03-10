import java.util.Scanner;

public class LargestNumber {
  public static void main(String[] args) {
    largestOfTwoNumbers obj = new largestOfTwoNumbers();
    largestOfTwoNumbers.largest obj1 = new largestOfTwoNumbers.largest();
    obj.getInput();
    obj1.printingLargestNumber(obj);
  }
}

class largestOfTwoNumbers {
  int num1, num2;
  Scanner sc = new Scanner(System.in);
  void getInput() {
    System.out.print("Enter the number 1: ");
    num1 = sc.nextInt();
    System.out.print("Enter the number 2: ");
    num2 = sc.nextInt();
  }

  static class largest {

    void printingLargestNumber(largestOfTwoNumbers obj) {
      if (obj.num1 > obj.num2) {
        System.out.println(obj.num1 + " is the largest among " + obj.num1 + ", " + obj.num2);
      } else {
        System.out.println(obj.num2 + " is the largest among " + obj.num1 + ", " + obj.num2);
      }
    }
  }
}