package algorithms.data_structures.learn.challenges;

import java.util.*;

class Pair {
  int i, j;

  public Pair(int i , int j) {
    this.i = i;
    this.j = j;
  }

  public String toString() {
    return i +", "+j;
  }
}

public class Pairs {

  public static void main(String args[]) {
    int[] array = {1, 8, 10, 8, 2, 2};
    Pairs pairs = new Pairs();
    List<Pair> myPairs = pairs.findPairsWithSetSum(array, 10);
    for (int i = 0; i < myPairs.size(); i++) {
      System.out.println(myPairs.get(i));
    }
  }

  public List<Pair> findPairsWithSum(int[] array, int sum) {
    if (array == null || array.length < 2) {
      return null;
    }
    int size = array.length;
    List<Pair> pairs = new ArrayList<>();
    Arrays.sort(array);
    int low = 0;
    int high = size - 1;
    while(low < high) {
      if (array[low] + array[high] == sum) {
        pairs.add(new Pair(array[low], array[high]));
        low++;
        high--;
      } else if (array[low] + array[high] < sum) {
        low++;
      } else {
        high--;
      }
    }
    return pairs;
  }

  public List<Pair> findPairsWithSetSum(int[] array, int sum) {
    if (array == null || array.length < 2) {
      return null;
    }
    int size = array.length;
    List<Pair> pairs = new ArrayList<>();
    Set<Integer> set = new HashSet<>();
    for (int i = 0; i < size; i++) {
      int temp = sum -  array[i];
      if (set.contains(temp)) {
        pairs.add(new Pair(array[i], temp));
      } else {
        set.add(array[i]);
      }
    }
    return pairs;
  }
}
