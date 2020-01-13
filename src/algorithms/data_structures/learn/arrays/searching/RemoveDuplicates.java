package algorithms.data_structures.learn.arrays.searching;

import java.util.*;

public class RemoveDuplicates {
  public static void main(String args[]) {
    Integer[] intArray = {22, 12, -6, -10, 11, 5, 4, 22, 6};
    List<Integer> numbers = Arrays.asList(intArray);
    // If we do care on the oder of resultant list elements, then we simply use List
    List<Integer> nonDuplicatesWithOrder = removeDuplicatesWithOrder(numbers);
    System.out.println("With Order...");
    for (int number: nonDuplicatesWithOrder) {
      System.out.println(number);
    }
    // If we do not care on the order of the result list elements
    // Use Set and convert that into List before returning the result
    System.out.println("Without Order...");
    List<Integer> nonDuplicatesWithoutOrder = removeDuplicatesWithoutOrder(numbers);
    for (int number: nonDuplicatesWithoutOrder) {
      System.out.println(number);
    }
  }

  //If we care about the order of list elements
  public static List<Integer> removeDuplicatesWithOrder(List<Integer> numbers) {
    if (numbers == null || numbers.size() == 0) {
      throw new IllegalArgumentException("Input is invalid!");
    }

    List<Integer> nonDuplicates = new ArrayList<>();
    for (int number: numbers) {
      if (nonDuplicates.contains(number)) {
        continue;
      } else {
        nonDuplicates.add(number);
      }
    }
    return nonDuplicates;
  }

  //If we do not care about the order of resultant list elements
  public static List<Integer> removeDuplicatesWithoutOrder(List<Integer> numbers) {
    if (numbers == null || numbers.size() == 0) {
      return null;
    }
    Set<Integer> nonDuplicates = new HashSet<>();
    for (int number: numbers) {
      nonDuplicates.add(number);
    }
    List<Integer> nonDuplicatesWithoutOrder = new ArrayList<>();
    nonDuplicatesWithoutOrder.addAll(nonDuplicates);
    return nonDuplicatesWithoutOrder;
  }

}
