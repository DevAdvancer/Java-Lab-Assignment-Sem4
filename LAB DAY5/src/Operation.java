import java.util.*;

public class Operation {
  public static void main(String[] args) {
    Solution.getInput();
    Solution.addition();
    Solution.subtraction();
    Solution.multiplication();
    Solution.division();
    Solution.modulus();
  }
}

class Solution {
  static int a;
  static int b;
  Solution(int y, int x) {
    a = y;
    b = x;
  }

  static void getInput() {
    Scanner sc = new Scanner(System.in);
    a = sc.nextInt();
    b = sc.nextInt();
  }

  static void addition() {
    int add = a + b ;
    System.out.println(add);
  }

  static void subtraction() {
    int sub = a - b ;
    System.out.println(sub);
  }

  static void multiplication() {
    int mul = a * b ;
    System.out.println(mul);
  }

  static void division() {
    int divi = a / b ;
    System.out.println(divi);
  }

  static void modulus() {
    int mod = a % b ;
    System.out.println(mod);
  }

}