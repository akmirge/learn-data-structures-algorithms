package algorithms.data_structures.learn.arrays.searching;

import algorithms.data_structures.learn.arrays.sorting.BubbleSort;

public class BinarySearch {
  public static void main(String[] args) {
    int[] numbers = {25, 32, -15, 67, -55, 19, 1};
    BubbleSort.sort(numbers);
    BinarySearch binarySearch = new BinarySearch();
    binarySearch.binarySearchForValue(numbers, 19);
  }

  public void binarySearchForValue(int[] numbers, int value) {
    if (numbers.length > 0) {
      int lowIndex = 0;
      int highIndex = numbers.length - 1;

      while(lowIndex <= highIndex) {
        int middleIndex = (lowIndex + highIndex)/2;
        if (numbers[middleIndex] < value) {
          lowIndex = middleIndex + 1; //upper bound
        }
        else if (numbers[middleIndex] > value) {
          highIndex = middleIndex - 1; //lower bound
        } else {
          System.out.println("Found the value: "+value+" in the array at index: "+ middleIndex);
          lowIndex = highIndex + 1;
        }
      }
    }
  }
}
