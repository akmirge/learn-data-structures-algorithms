package algorithms.data_structures.learn.arrays.searching;

import java.util.HashMap;
import java.util.Map;

public class ArrayElements {

  class Pair {
    int first, second;

    Pair(int f, int s) {
      this.first = f;
      this.second = s;
    }
  }


  public static void main(String args[]) {
    ArrayElements elements = new ArrayElements();
    int[] array = {6, 7, 4, 5, 12, 16, 1}; //two set pairs (6, 5) , (7, 4) and (5, 12), (16, 1)
//  int[] array = {12, 10, 1, 3, 15}; // one set pairs (12, 1) , (10, 3)
//  int[] array = {6, 16, 8, 4, 15}; // no match


    boolean pairsFound = elements.findPairs(array);
    if (!pairsFound) {
      System.out.println("No pairs were found for the given array!");
    }
  }

  public boolean findPairs(int[] array) {
    if (array == null || array.length == 0) {
      return false;
    }
    int sum;
    Map<Integer, Pair> pairMap = new HashMap<Integer, Pair>();
    boolean pairFound = false;
    for (int i = 0; i < array.length; i++) {
      for (int j = i + 1; j < array.length; j++) {
        sum = array[i] + array[j];
        if (!pairMap.containsKey(sum)) {
          pairMap.put(sum, new Pair(i, j));
        } else {
          Pair p = pairMap.get(sum);
          System.out.println("(" + array[p.first] + "," + array[p.second] + "), ("+ array[i] + "," + array[j] + ")");
          pairFound  = true;
        }
      } // inner for loop

    } //outer for loop

    return pairFound;
  }
}
