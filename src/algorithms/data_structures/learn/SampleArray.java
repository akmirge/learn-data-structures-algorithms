package algorithms.data_structures.learn;

public class SampleArray {
  public static void main(String args[]) {
    int[] intArray = {12, 32, -15, 46, -35, 88, 9};
    // If you need to find an index of an element say 23 which doesn't exist leading to Big O(n) (Linear) time
    // complexity
    int index = -1;
    for (int i = 0; i < intArray.length; i++) {
      if (intArray[i] == 23) {
        index = i;
        break;
      }
    }
    System.out.println(index < 0 ? "Index not found" : "Index is: " + index);

    //If you need to search an element in the Array with a given index say 2, it will lead to a Constant time
    // O(1) complexity
    index = 2;
    if (index < 0 || index >= intArray.length) {
      throw new RuntimeException("Index out of bound");
    }
    System.out.println("Element value is "+ intArray[index]);

  }
}
