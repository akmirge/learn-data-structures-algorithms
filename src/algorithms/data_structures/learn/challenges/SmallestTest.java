package algorithms.data_structures.learn.challenges;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SmallestTest {

  public static void main(String args[]) {
    Set<Integer> set = new HashSet<>();
    set.add(-12);
    set.add(14);
    set.add(-5);
    set.add(15);
    set.add(20);
    set.add(12); //-12, -5, 12, 14, 15, 20
    System.out.println(thirdSmallest(set));
  }

  public static int thirdSmallest(Set<Integer> set) {
    if (set == null || set.size() < 3) {
      return -1;
    }

    Integer[] array = new Integer[set.size()];
    set.toArray(array);
    Arrays.sort(array);
    return array[array.length - 3];
  }

}

