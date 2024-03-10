import java.util.Scanner;

public class Transpose {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Row: ");
    int r = sc.nextInt();
    System.out.print("Enter the Column: ");
    int c = sc.nextInt();
    transposeMatrix obj = new transposeMatrix(r, c);
    obj.takeInput();
    System.out.println("Matrix Before Transpose:- ");
    obj.printArrayWithOutTranspose();
    obj.setTransposeArr();
    System.out.println("Matrix After Transpose:- ");
    obj.printArray();
  }
}

class transposeMatrix {
  Scanner sc = new Scanner(System.in);
  int r, c;
  int[][] arr;
  int[][] transposeArr;
  transposeMatrix(int r, int c) {
    this.r = r;
    this.c = c;
    arr = new int[r][c];
    transposeArr = new int [r][c];
  }
  void takeInput() {
    System.out.println("Enter the Matrix :- ");
    for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
        System.out.print("Arr["+i+"]["+j+"] : ");
        arr[i][j] = sc.nextInt();
      }
    }
  }

  void printArrayWithOutTranspose() {
    for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
        System.out.print(arr[i][j]+"\t");
      }
      System.out.println();
    }
  }
  void setTransposeArr() {
    for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
        transposeArr[i][j] = arr[j][i];
      }
    }
  }

  void printArray() {
    for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
        System.out.print(transposeArr[i][j]+"\t");
      }
      System.out.println();
    }
  }
}
