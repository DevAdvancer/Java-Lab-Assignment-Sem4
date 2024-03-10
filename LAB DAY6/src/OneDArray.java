import java.util.Scanner;

public class OneDArray {
  public static void main(String[] args) {
    OneArray arrayobj = new OneArray();
    System.out.println("The Non User Input String is: ");
    arrayobj.printArray();

    System.out.println("The userInput Array is ");
    arrayobj.takeSizeOfArray();
    arrayobj.takeInput();
    arrayobj.printArrayUserInput();
  }
}

class OneArray {
  int n;
  Scanner sc = new Scanner(System.in);
  int[] OneDArray = {1, 2, 3, 4};
  int[] UserInputArray;

  void printArray() {
    for (int j : OneDArray) {
      System.out.println("--> " + j);
    }
  }

  void takeSizeOfArray() {
    System.out.print("Enter the length of Array: ");
    n = sc.nextInt();
    UserInputArray = new int[n];
  }

  void takeInput() {
    for (int i = 0; i < n; i++) {
      System.out.print("-->");
      UserInputArray[i] = sc.nextInt();
    }
  }

  void printArrayUserInput() {
    System.out.println("Printing the Array Taken as User input");
    for (int j : UserInputArray) {
      System.out.println("--> " + j);
    }
  }
}
