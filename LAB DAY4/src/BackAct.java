import java.util.*;

public class BackAct {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Principle: ");
    double p = sc.nextDouble();
    System.out.print("Enter Rate of Interest: ");
    double r = sc.nextDouble();
    System.out.print("Enter Time: ");
    double t = sc.nextDouble();
    Interest si = new Interest(p, r, t);
    System.out.println("The Simple Interest is: "+si.CalculateSimpleInterest());
  }
}

class Interest {
  double p, r, t; // p = Principle, r = Rate of interest, t = Time
  Interest(double p, double r, double t) {
    this.p = p;
    this.r = r;
    this.t = t;
  }
  double CalculateSimpleInterest() {
    return (p * r * t) / 100;
  }
}
