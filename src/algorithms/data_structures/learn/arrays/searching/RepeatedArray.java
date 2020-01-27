package algorithms.data_structures.learn.arrays.searching;

import java.util.HashMap;
import java.util.Map;

public class RepeatedArray {
  public static void main(String[] args) {
    RepeatedArray repeatedArray = new RepeatedArray();
    int[] array = {5, 12, -15, 14, 12, 14, -14, 6};
    int result = repeatedArray.findMaxRepeatedElement(array);
    System.out.println("Max Repeated Element in the Array is " + result);
  }

  public static int findMaxRepeatedElement(int[] array) {
    if (array == null || array.length == 0) {
      throw new IllegalArgumentException("Array is Empty!");
    }
    Map<Integer, Integer> freqMap = new HashMap<>();
    for (int i = 0; i < array.length; i++) {
      int key = Math.abs(array[i]);
      if (freqMap.containsKey(key)) {
        freqMap.replace(key, freqMap.get(key) + 1);
      } else {
        freqMap.put(key, 1);
      }
    }

    int max = 0;
    Integer maxRepeatedElement = null;
    for (int key: freqMap.keySet()) {
      if (max < freqMap.get(key)) {
        max = freqMap.get(key);
        maxRepeatedElement = key;
      }
    }
    return maxRepeatedElement;
  }
}
