package algorithms.data_structures.learn.arrays.searching;

public class ReversedString {
  public static void main(String args[]) {
    System.out.println(reverse("MADAM"));
    System.out.println(reverse("NOIL"));
  }

  public static String reverse(String s) {
    if (s == null || s.trim().length() == 0) {
      throw new IllegalArgumentException("Invalid input string!");
    }

    int length = s.length();
    StringBuilder reversed = new StringBuilder(); //String reversed = "";
    for (int i = length - 1; i >=0 ; i--) {
      reversed.append(s.charAt(i)); // reversed = reversed + s.charAt(i);
    }
    return reversed.toString(); //return reversed;
  }
}

