import java.lang.Math;

public class Circle {
  public static void main(String[] args) {
    Area areaobj = new Area(5.6);
    Perimeter perimeterobj = new Perimeter(7.8);
    System.out.println("Area: " + areaobj.getArea());
    System.out.println("Perimeter: " + perimeterobj.getPerimeter());
  }
}

class Area {
  double area;
  final double pi = 3.14;
  Area(double radius) {
    area = Math.pow(radius, 2) * pi;
  }
  double getArea() {
    return area;
  }
}
class Perimeter {
  final double pi = 3.14;
  double perimeter;
  Perimeter(double radius) {
    perimeter = 2 * pi * radius;
  }

  double getPerimeter() {
    return perimeter;
  }
}