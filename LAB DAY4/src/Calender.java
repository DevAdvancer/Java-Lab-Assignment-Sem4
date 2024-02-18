import java.util.*;

public class Calender {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Date: ");
    int date = sc.nextInt();
    System.out.print("Enter the Month: ");
    int month = sc.nextInt();
    System.out.print("Enter the Year: ");
    int year = sc.nextInt();
    getCalenderDay getCalenderDayObj = new getCalenderDay(date, month, year);
    String day = getCalenderDayObj.getDay();
    System.out.println("Day for "+year+"-"+month+"-"+date+": "+day);
  }
}

class getCalenderDay {
  int date, month, year;

  getCalenderDay(int date, int month, int year) {
    this.date = date;
    this.month = month - 1;
    this.year = year;
  }
  String getDay() {
    Calendar CLD = Calendar.getInstance();
    CLD.set(this.year, this.month, this.date);

    int dayOfWeek = CLD.get(Calendar.DAY_OF_WEEK);

    String[] dayNames = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

    return dayNames[dayOfWeek - 1];
  }
}