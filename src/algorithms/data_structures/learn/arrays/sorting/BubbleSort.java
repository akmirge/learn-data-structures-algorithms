package algorithms.data_structures.learn.arrays.sorting;

public class BubbleSort {
  public static void main(String args[]) {
    int[] intArray = {25, 32, -15, 67, -55, 19, 1};
    // 25, -15, 32, 67, -55, 19, 1
    //  25, -15, 32, -55,  67, 19, 1
    //   25, -15, 32, -55, 19, 67, 1
    // 25, -15, 32, -55, 19, 1, 67
    sort(intArray);
    System.out.println("After bubble sort::");
    for (int i = 0; i < intArray.length; i++) {
      System.out.println(intArray[i]);
    }
  }

  public static void sort(int[] intArray) {
    if (intArray == null || intArray.length == 0) {
      throw new IllegalArgumentException("Invalid or Empty Array");
    }
    System.out.println("Before bubble sort::");
    for (int i = 0; i < intArray.length; i++) {
      System.out.println(intArray[i]);
    }
    for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0;
         lastUnsortedIndex--) {
      for (int i = 0; i < lastUnsortedIndex; i++) {
        if (intArray[i] > intArray[i+1]) {
          //Swap the numbers
          swapData(intArray, i, i+1);
        }
      }
    }
    System.out.println("After bubble sort::");
    for (int i = 0; i < intArray.length; i++) {
      System.out.println(intArray[i]);
    }
  }

  public static void swapData(int[] array, int i, int j) {
    if ( i == j) {
      return;
    }
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }

}

