package algorithms.data_structures.learn.arrays.sorting;

public class FactorialExample {
  public static void main(String args[]) {
    System.out.println("Iterative call " + iterativeFactorial(3));
    System.out.println("Recursive call " + recursiveFactorial(5));
    System.out.println("Recursive call with negative integer " + recursiveFactorial(-25));

  }

  public static int iterativeFactorial(int number) {

    if (number < 0) {
      throw new IllegalArgumentException("The input must be a positive integer");
    }

    if (number == 0 || number == 1) {
      return 1;
    }

    int factorial = 1;
    for (int i = 2; i <=  number; i++) {
      factorial *= i;
    }

    return factorial;
  }

  public static int recursiveFactorial(int number) {
    if (number < 0) {
      throw new IllegalArgumentException("The input must be a positive integer");
    }

    if (number == 0 || number == 1) { // Base case or Breaking condition
      return 1;
    }

    return number * recursiveFactorial(number - 1); // pushed into call stack
  }

}
