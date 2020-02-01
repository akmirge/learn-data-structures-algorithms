package algorithms.data_structures.learn.searching;

public class ReverseArray {
  public static void main(String args[]) {
    char[] charArray = "tattarrattat".toCharArray();
    System.out.println("Reverse of " + charArray +" is: " + reverse(charArray));
  }

  public static String reverse(char[] chars) {
    if (chars == null || chars.length == 0) {
      throw new IllegalArgumentException("Input is null or empty!!");
    }

    int size = chars.length;
    for (int i = 0; i < size/2; ++i) {
      char temp = chars[i];
      chars[i] = chars[size - 1 - i];
      chars[size - 1 - i] = temp;
    }
    return new String(chars);
  }
}
