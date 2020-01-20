package algorithms.data_structures.learn.arrays.sorting;

public class SimpleSelectionSort {
  public static void main(String[] args) {
    int[] numbers = {0, 10, 24, -6, 111, -144, 12, 8, 54, -45};
    SimpleSelectionSort simpleSelectionSort = new SimpleSelectionSort();
    simpleSelectionSort.sort(numbers);
    System.out.println("After Simple Selection Sort");
    for (int i = 0; i < numbers.length; i++) {
      System.out.println(numbers[i]);
    }
  }

  public void sort(int[] numbers) {
    int arraySize = numbers.length;
    if (arraySize == 0) {
      throw new IllegalArgumentException("Empty Array!");
    }

    for (int i = 0; i < arraySize; i++) {
      int minimum = i;
      for (int j = i + 1; j < arraySize; j++) {
        if (numbers[minimum] > numbers[j]) {
          minimum = j;
        }
      }
      swap(numbers, i, minimum);
    }
  }

  private void swap(int[] array, int i, int minimum) {
    if (i == minimum) {
      return; // no-op
    }
    int temp = array[i];
    array[i] = array[minimum];
    array[minimum] = temp;
  }

}
