package algorithms.data_structures.learn.challenges;

import java.util.LinkedHashMap;
import java.util.Map;

public class MostFrequent {
  public static void main(String args[]) {
    String[] array = {"hello", "good bye", "hello", "bye", "hello"};
    MostFrequent frequent = new MostFrequent();
    System.out.println(frequent.findMostFrequentElementEfficiently(array));
  }

  //Map does not gurantee the order of elements added
  public String findMostFrequentElementEfficiently(String[] array) {
    if (array == null || array.length == 0) {
      throw new IllegalArgumentException("Input is null or empty");
    }
    int size = array.length;
    Map<String, Integer> freqMap = new LinkedHashMap<>();
    // HashMap does not maintain the insertion order -- > O(1)
    // LinkedHashMap() -- maintains the insertion order  - O(1)
    // TreeMap --> Sort the elements/keys in the map --> O(logn)
    for (int i = 0; i < size; i++) {
      if (freqMap.containsKey(array[i])) {
        freqMap.replace(array[i], freqMap.get(array[i]) + 1);
      } else {
        freqMap.put(array[i], 1);
      }
    }
    int count = 0;
    String element = "";
    for (String key: freqMap.keySet()) {
      if (freqMap.get(key) > count) {
        count = freqMap.get(key);
        element = key;
      }
    }
    return element;
  }

  public String findMostFrequentElement(String[] array) {
    if (array == null || array.length == 0) {
      throw new IllegalArgumentException("Input is null or empty");
    }

    int count = 0;
    String element = "";
    int size = array.length;

    for (int i = 0; i < size; i++) {
      int tempCount = 0;
      String tempElement = array[i];
      for (int j = 0; j < size; j++) {
        if (array[j].equals(tempElement)) {
          tempCount++;
        }
      }
      if (tempCount > count) {
        count = tempCount;
        element = tempElement;
      }
    }
    return element;
  }
}
