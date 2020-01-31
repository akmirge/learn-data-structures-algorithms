package algorithms.data_structures.learn.challenges;

public class HanoiChallenge {

  public static void main(String args[]) {
    HanoiChallenge challenge = new HanoiChallenge();
    challenge.solveHanoi(3, 'A', 'B', 'C');
  }

  public void solveHanoi(int n, char rodFrom, char middleRod, char rodTo) {
    if (n < 0) {
      throw new IllegalArgumentException("Invalid number of items");
    }

    if (n == 1) {
      System.out.println("Plate 1 from " + rodFrom + " to " + rodTo);
      return;
    }

    solveHanoi(n - 1, rodFrom, rodTo, middleRod);
    System.out.println("Plate " + n + " from " + rodFrom + " to " + rodTo);
    solveHanoi(n - 1, middleRod, rodFrom, rodTo);
  }
}

