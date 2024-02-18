public class ThroughMethods {
  public static void main(String[] args) {
    StudentDetails SD = new StudentDetails();
    SD.GetDetails(140, "Abhirup Kumar");
    SD.PrintDetails();
  }
}

class StudentDetails {
  int StudentId;
  String StudentName;

  void GetDetails(int StudentId, String StudentName) {
    this.StudentId = StudentId;
    this.StudentName = StudentName;
  }
  void PrintDetails() {
    System.out.println("Student ID: "+StudentId);
    System.out.println("Student Name: "+StudentName);
  }
}