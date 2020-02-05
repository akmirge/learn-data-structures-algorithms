package algorithms.data_structures.learn.challenges;

public class PalindromePermutation {
  public static void main(String[] args) {
    System.out.println(isPermutatinOfPalindrome("tic toe ote cit"));
  }

  public static boolean isPermutatinOfPalindrome(String s) {
    int oddCount = 0;

    int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
    for (char c: s.toCharArray()) {
      int charNum = getCharacterNumber(c);
      if (charNum != -1) {
        table[charNum]++;
        if (table[charNum] % 2 == 1) {
          oddCount++;
        } else {
          oddCount--;
        }
      }
    }
    return oddCount <= 1;
  }

  private static int getCharacterNumber(Character c) {
    int a = Character.getNumericValue('a');
    int z = Character.getNumericValue('z');
    int val = Character.getNumericValue(c);
    if (a <= val && val <= z) {
      return val - a;
    }
    return -1;
  }
}
