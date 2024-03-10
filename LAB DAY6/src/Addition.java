import java.util.Scanner;

public class Addition {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Row: ");
    int r = sc.nextInt();
    System.out.print("Enter the Column: ");
    int c = sc.nextInt();

    AdditionOfMatrix obj = new AdditionOfMatrix(r, c);
    System.out.println("Enter the Matrix 1: ");
    obj.takeInputOneMatrix1();
    System.out.println("Enter the Matrix 2: ");
    obj.takeInputOneMatrix2();
    System.out.println("Display of Matrix: ");
    obj.displayMatrix();
    obj.additionOfMatrix();
    System.out.println("Addition of Matrix: ");
    obj.displayAdditionOfMatrix();
  }
}

class AdditionOfMatrix {
  Scanner sc = new Scanner(System.in);
  int[][] matrix1;
  int[][] matrix2;
  int[][] addition;
  int r, c;

  AdditionOfMatrix(int r, int c) {
    this.c = c;
    this.r = r;
    matrix1 = new int[r][c];
    matrix2 = new int[r][c];
    addition = new int[r][c];
  }

  void takeInputOneMatrix1() {
    for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
        System.out.print("--> ["+i+"]["+j+"]: ");
        matrix1[i][j] = sc.nextInt();
      }
    }
  }

  void takeInputOneMatrix2() {
    for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
        System.out.print("--> ["+i+"]["+j+"]: ");
        matrix2[i][j] = sc.nextInt();
      }
    }
  }

  void displayMatrix() {

    System.out.println("Matrix 1: ");
    for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
        System.out.print(matrix1[i][j] + "\t");
      }
      System.out.println();
    }

    System.out.println("Matrix 2: ");
    for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
        System.out.print(matrix2[i][j] + "\t");
      }
      System.out.println();
    }
  }

  void additionOfMatrix() {
    for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
        addition[i][j] = matrix1[i][j] + matrix2[i][j];
      }
    }
  }

  void displayAdditionOfMatrix() {
    for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
        System.out.print(addition[i][j] + "\t");
      }
      System.out.println();
    }
  }
}
