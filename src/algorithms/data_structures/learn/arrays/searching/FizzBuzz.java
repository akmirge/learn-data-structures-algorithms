package algorithms.data_structures.learn.arrays.searching;

public class FizzBuzz {
  public static void main(String args[]) {
    printFizzBuzzNumber(3);
    printFizzBuzzNumber(10);
    printFizzBuzzNumber(30);
    printFizzBuzzNumber(19);
  }

  public static void printFizzBuzzNumber(int n) {
    if (n <= 0) {
      throw new IllegalArgumentException("The input must be a natural number");
    }
    boolean divByThree = n % 3 == 0;
    boolean divByFive = n % 5 == 0;

    if (divByThree && divByFive) {
      System.out.println("FizzBuzz");
    }
    else if (divByThree) {
      System.out.println("Fizz");
    }
    else if (divByFive) {
      System.out.println("Buzz");
    } else {
      System.out.println(n);
    }
  }

}
