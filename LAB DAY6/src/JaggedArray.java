import java.util.Scanner;

public class JaggedArray {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the number of arrays: ");
    int numOfArrays = scanner.nextInt();

    int[][] jaggedArray = JaggedArrayCreator.createJaggedArray(numOfArrays);

    System.out.println("\nPrinting the jagged array elements:");
    for (int i = 0; i < jaggedArray.length; i++) {
      System.out.print("Array " + (i + 1) + ": ");
      JaggedArrayPrinter.printArray(jaggedArray[i]);
    }
  }
}

class JaggedArrayCreator {
  public static int[][] createJaggedArray(int numOfArrays) {
    Scanner scanner = new Scanner(System.in);
    int[][] jaggedArray = new int[numOfArrays][];

    for (int i = 0; i < numOfArrays; i++) {
      System.out.print("Enter the size of array " + (i + 1) + ": ");
      int size = scanner.nextInt();
      jaggedArray[i] = new int[size];

      System.out.println("Enter the elements for array " + (i + 1) + ":");
      for (int j = 0; j < size; j++) {
        jaggedArray[i][j] = scanner.nextInt();
      }
    }

    return jaggedArray;
  }

}
class JaggedArrayPrinter {
  public static void printArray(int[] array) {
    for (int element : array) {
      System.out.print(element + " ");
    }
    System.out.println();
  }

}

