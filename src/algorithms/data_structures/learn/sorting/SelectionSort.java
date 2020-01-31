package algorithms.data_structures.learn.sorting;

public class SelectionSort {
  public static void main(String args[]) {
    int[] array = {5, 12, 36, -15, 1, 75, 6};

    for (int lastUSIndex = array.length - 1; lastUSIndex > 0; lastUSIndex--) {
      int largest = 0;
      for (int i = 1; i <= lastUSIndex; i++) {
        if (array[i] > array[largest]) {
          largest = i;
        }
      } // Inner for loop
      swapData(array, largest, lastUSIndex);
    } // outer for loop
    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }
  } // end of main

  public static void swapData(int[] array, int i, int j) {
    if (i == j) {
      return;
    }
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }

}

