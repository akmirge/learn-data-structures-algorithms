package algorithms.data_structures.learn.stacksAndQueues;

public class ReverseStack {
  public static void main(String args[]) {
    String text = "tattarrattat";
    System.out.println("Reverse of " + text +" is : "+ reverse(text));
  }
  public static String reverse(String text) {
    if (text == null || text.length() == 0) {
      throw new IllegalArgumentException("Input is null or empty!");
    }
    int size = text.length();
    Stack stack = new Stack(size);
    for (int i = 0; i < size; i++) {
      stack.push(text.charAt(i));
    }

    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < size; i++) {
      builder.append(stack.pop());
    }
    return builder.toString();
  }
}

class Stack {

  int top;
  int size;
  char[] charArray;

  public Stack(int size) {
    this.size = size;
    this.top = -1;
    this.charArray = new char[size];
  }

  public boolean push(char c) {
    if (top >= size) {
      System.out.println("Stack overflow.."); //Stack is full
      return false;
    }

    charArray[++top] = c;
    return true;
  }

  public char pop() {
    if (top < 0) {
      System.out.println("Stack underflow..."); //Stack is empty
      return 65535;
    }
    char c  = charArray[top--];
    return c;
  }

}


