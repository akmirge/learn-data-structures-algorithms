package algorithms.data_structures.learn.arrays.stacksAndQueues;

public class TheStack {
  private final String[] stackArray;
  private final int stackSize;
  private int topOfStack;

  public static void main(String[] args) {
    TheStack stack = new TheStack(10);
    stack.push("10");
    stack.push("15");
    stack.peek();
    stack.pop();
    stack.peek();
    stack.pop();
    stack.pushMany("20 25 30 15 10 1");
    stack.peek();
    stack.popAll();
  }

  public TheStack(int size) {
    this.stackSize = size;
    this.stackArray = new String[size];
    this.topOfStack = -1;
  }

  public void push(String value) {
    if (topOfStack < stackSize - 1) {
      stackArray[++topOfStack] = value;
      System.out.println("PUSH " + value + " has been added to the Stack");
    } else {
      System.out.println("Sorry, the Stack is already full");
    }
  }

  public void pop() {
    if (topOfStack >= 0) {
      String elementPopped = stackArray[topOfStack];
      stackArray[topOfStack--] = "-1";
      System.out.println("POP " + elementPopped + " has been removed from Stack");
    } else {
      System.out.println("Sorry, but the stack is already Empty");
    }
  }

  public void peek() {
    if (topOfStack >= 0) {
      System.out.println("PEEK " + stackArray[topOfStack] + " is at the top of the Stack");
    } else {
      System.out.println("Sorry, but the Stack is Empty");
    }
  }

  public void pushMany(String multipleValues) {
    if (multipleValues != null && multipleValues.trim().equals("")) {
      String[] values = multipleValues.split(" ");
      for (String value: values) {
        push(value);
      }
    }
  }

  public void popAll() {
    for (int i = topOfStack; i >= 0; i--) {
      pop();
    }
  }
}
