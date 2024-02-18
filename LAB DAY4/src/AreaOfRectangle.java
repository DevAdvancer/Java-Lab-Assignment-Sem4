import java.util.Scanner;

public class AreaOfRectangle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the length: ");
    double l = sc.nextDouble();
    System.out.print("Enter the Breath: ");
    double b = sc.nextDouble();
    AreaCalculation ac = new AreaCalculation(l, b);
    ac.PrintArea();
  }
}

class AreaCalculation {
  double l, b;
  AreaCalculation(double l, double b) {
    this.l = l;
    this.b = b;
  }

  void PrintArea() {
    System.out.println("The Area of the Rectangle is: "+ l * b);
  }
}
