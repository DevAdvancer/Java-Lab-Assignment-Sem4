import java.util.*;

public class DrivingCars {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Speed: ");
    int speed = sc.nextInt();
    System.out.print("Enter the isHoliday: ");
    boolean isHoliday = sc.nextBoolean();
    Fine fineobj = new Fine(speed, isHoliday);
    System.out.println(fineobj.speedingFine());
  }
}

class Fine {
  int speed;
  boolean isHoliday;
  Fine(int speed, boolean isHoliday ) {
    this.speed = speed;
    this.isHoliday = isHoliday;
  }

  int speedingFine() {
    if (isHoliday) {
      if (speed <= 65) {
        return 0;
      } else if (speed <= 85){
        return 100;
      } else {
        return 200;
      }
    } else {
      if (speed <= 60) {
        return 0;
      } else if (speed <= 80){
        return 100;
      } else {
        return 200;
      }
    }
  }
}
