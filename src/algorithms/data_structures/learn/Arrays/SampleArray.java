package algorithms.data_structures.learn.Arrays;

public class SampleArray {
  public static void main(String args[]) {
    int[] intArray = {12, 32, -15, 46, -35, 88, 9};
    // If you need to find an index of an element say -15
    int index = -1;
    for (int i = 0; i < intArray.length; i++) {
      if (intArray[i] == 23) {
        index = i;
        break;
      }
    }
    System.out.println(index < 0 ? "Index not found" : "Index is: " + index);
  }
}
