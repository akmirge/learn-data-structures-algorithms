package algorithms.data_structures.learn.challenges;

import java.util.Arrays;

public class NthSmallestTest {

  public static void main(String args[]) {
    int[] array = {12, 14, 23, 16, 5, 4, 0}; // 16, 14, 12, 5, 4, 0, -3
    int n = 5;
    printSmallest(array, n);
  }

  public static void printSmallest(int[] array, int n) {
    if (array == null || array.length == 0) {
      throw new IllegalArgumentException("Invalid Input!");
    }

/**
 * Make a copy of original array and then sort copy array. After sorting the copy array,
 * save all n smallest numbers. Further for each element in original array, check
 * whether it is in n-smallest number or not if it present in n-smallest array
 * then print it otherwise move forward.
 */

    int[] copyArray = Arrays.copyOf(array, array.length);
    Arrays.sort(copyArray);
    for (int i = 0; i < array.length; ++i) {
      //	Find the n smallest elements in the copyArray and then
      //	loop through the original array to find the match
      //	for the n smallest elements in the copy array.
      if (Arrays.binarySearch(copyArray, 0, n, array[i]) > -1) {
        System.out.println(array[i]);
      }
    }
  }

}
