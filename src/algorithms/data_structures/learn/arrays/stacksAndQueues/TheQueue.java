package algorithms.data_structures.learn.arrays.stacksAndQueues;
import java.util.Arrays;

public class TheQueue {
  private String[] queueArray;
  private int queueSize;
  private int front, rear, numberOfElements = 0;
  public TheQueue(int size) {
    queueArray = new String[size];
    queueSize = size;
    Arrays.fill(queueArray, "-1");
  }

  public static void main(String[] args) {
    TheQueue queue = new TheQueue(10);
    queue.priorityInsert("10");
    queue.priorityInsert("12");
    queue.priorityInsert("30");
    queue.priorityInsert("9");
    queue.priorityInsert("1");
    queue.peek();
    queue.remove();
    queue.peek();
    queue.remove();
    queue.peek();
  }

  public void insert(String value) {
    if (numberOfElements < queueSize) {
      queueArray[rear++] = value;
      System.out.println("INSERT " + value + " has been added to the Queue");
      numberOfElements++;
    } else {
      System.out.println("Sorry, the Queue is already Full");
    }
  }

  public String remove() {
    if (numberOfElements >= 1) {
      String elementPopped = queueArray[front];
      queueArray[front++] = "-1";
      numberOfElements--;
      System.out.println("REMOVE " + elementPopped + " was removed from the Queue");
      return elementPopped;
    } else {
      System.out.println("Sorry, the Queue is already empty");
      return null; // throw new Error("Queue is empty!")
    }
  }

  public String peek() {
    if (numberOfElements >= 1) {
      System.out.println("PEEK " + queueArray[front] + " is at the front of the Queue");
      return queueArray[front];
    } else {
      System.out.println("Sorry, the Queue is already empty");
      return null; // throw new Error("Queue is empty!")
    }
  }

  public void priorityInsert(String value) {
    if (numberOfElements == 0) {
      insert(value);
    } else {
      int i;
      for (i = numberOfElements - 1; i >=0; i--) {
        if (Integer.parseInt(value) > Integer.parseInt(queueArray[i])) {
          queueArray[i + 1] = queueArray[i];
        } else {
          break;
        }
      }
      queueArray[i+1] = value;
      rear++;
      numberOfElements++;
      System.out.println("PRIORITY INSERT " + value + " has been added in the front of the Queue");
    }
  }
}
