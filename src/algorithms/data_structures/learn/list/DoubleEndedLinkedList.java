package algorithms.data_structures.learn.list;

public class DoubleEndedLinkedList {
  Neighbor firstLink;
  Neighbor lastLink;

  public static void main(String args[]) {
    DoubleEndedLinkedList linkedList = new DoubleEndedLinkedList();
    linkedList.insertIntoFirstPosition("Anil Mirge", 13693);
    linkedList.insertIntoLastPosition("Rahul Mirge", 204);
    linkedList.insertIntoFirstPosition("Latha Mirge", 310);
    linkedList.insertIntoFirstPosition("Prabhaker Mirge", 13693);
    linkedList.display();
  }

  public void display() {
    Neighbor theLink = firstLink;
    while(theLink != null) {
      theLink.display();
      System.out.println("The Next Node in the linked list is: " + theLink.next);
      theLink = theLink.next;
    }
  }

  public boolean isEmpty() {
    return firstLink == null;
  }

  public void insertIntoFirstPosition(String homeOwnerName, int houseNumber) {
    Neighbor theNewLink = new Neighbor(homeOwnerName, houseNumber);

    if (isEmpty()) {
      lastLink = theNewLink;
    }
    theNewLink.next = firstLink;
    firstLink = theNewLink;
  }

  public void insertIntoLastPosition(String homeOwnerName, int houseNumber) {
    Neighbor theNewLink = new Neighbor(homeOwnerName, houseNumber);

    if (isEmpty()) {
      firstLink = theNewLink;
    } else {
      lastLink.next = theNewLink;
    }
    lastLink = theNewLink;
  }
}


class Neighbor {
  public String homeOwnerName;
  public int houseNumber;

  Neighbor next;

  public Neighbor(String homeOwnerName, int houseNumber) {
    this.homeOwnerName = homeOwnerName;
    this.houseNumber = houseNumber;
  }

  public void display() {
    System.out.println(homeOwnerName + " : " + "lives at " + houseNumber + " Neil Armstrong Ave");
  }

  public String toString() {
    return homeOwnerName;
  }
}
