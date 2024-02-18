public class Reference {
  public static void main(String[] args) {
    Details dt = new Details(144, "Abhirup Kumar");
    dt.PrintDetails();
  }
}

class Details {
  int StudentId;
  String StudentName;

  Details(int StudentID, String StudentName){
    this.StudentId = StudentID;
    this.StudentName = StudentName;
  }

  void PrintDetails() {
    System.out.println("Student ID: "+StudentId);
    System.out.println("Student Name: "+StudentName);
  }

}