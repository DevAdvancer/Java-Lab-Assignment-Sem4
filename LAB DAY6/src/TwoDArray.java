import java.util.Scanner;

public class TwoDArray {
  public static void main(String[] args) {
    TwoArray obj = new TwoArray();
    System.out.println("The Non User Input String is: ");
    obj.printArray();
    System.out.println("The userInput Array is ");
    obj.taleSize();
    obj.TakeInputInArray();
    obj.PrintUserInputArray();
  }
}

class TwoArray {
  int r, c;
  Scanner sc = new Scanner(System.in);
  int [][] arr = new int[4][4];
  int [][] arr1;
  void printArray() {
    arr[0][0] = 2;
    arr[0][1] = 4;
    arr[0][2] = 5;
    arr[0][3] = 1;
    arr[1][0] = 3;
    arr[1][1] = 6;
    arr[1][2] = 8;
    arr[1][3] = 7;
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        System.out.println("-->" + arr[i][j]);
      }
      System.out.println();
    }
  }

  void taleSize() {
    System.out.print("Enter the Size of 2D Array Rows: ");
    r = sc.nextInt();
    System.out.print("Enter the Size of 2D Array Columns: ");
    c = sc.nextInt();
    arr1 = new int[r][c];
  }

  void TakeInputInArray() {
    for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
        System.out.print("arr1["+i+"]["+j+"] = ");
        arr1[i][j] = sc.nextInt();
      }
    }
  }

  void PrintUserInputArray() {
    System.out.println("Printing");
    for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
        System.out.print(arr1[i][j] + " ");
      }
      System.out.println();
    }
  }

}
