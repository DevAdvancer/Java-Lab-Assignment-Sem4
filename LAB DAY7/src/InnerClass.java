import java.util.Scanner;

public class InnerClass {
  public static void main(String[] args) {
    CPU obj = new CPU();
    CPU.processor obj1= obj.new processor();
    CPU.ram obj2= obj.new ram();
    obj1.getCache();
    obj1.display();
    obj2.getClockSpeed();
    obj2.display();
  }
}

class CPU {
  Scanner sc = new Scanner(System.in);
  double price;
  protected class processor {
    double cores;
    double cache;
    String manufactures;
    void getCache() {
      System.out.print("Enter the Core: ");
      cores = sc.nextDouble();
    }

    void display() {
      cache = 48 * cores;
      System.out.println("Processor Cache: " + cache);
    }
  }
  class ram {
    double memory;
    double baseClockSpeed = 100;
    String manufactures;
    void getClockSpeed() {
      System.out.print("Enter the Memory: ");
      memory = sc.nextDouble();
    }

    void display() {
      System.out.println("Ram Clock Speed: " + (baseClockSpeed * memory));
    }
  }
}
