package algorithms.data_structures.learn.sorting;

public class InsertionSort {
  public static void main(String args[]) {
    int[] array = {25, 32, -15, 67, -55, 19, 1};

    for (int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; firstUnsortedIndex++) {
      int newElement = array[firstUnsortedIndex];
      int i;
      for (i = firstUnsortedIndex; i > 0 && array[i - 1] > newElement; i--) {
        array[i] = array[i - 1];
      }
      array[i] = newElement;
    }
    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }

  }
}
