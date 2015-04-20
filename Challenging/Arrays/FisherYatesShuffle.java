import java.io.*;
import java.util.*;

public class FisherYatesShuffle {

// This is also known as Knuth Shuffle

  public static int[] shuffleArray(int[] arr) {
    Random rand = new Random();
    for (int i=arr.length-1; i>0; i--) {
      int index = rand.nextInt(arr.length);
      // Simple Swap
      int temp = arr[index];
      arr[index] = arr[i];
      arr[i] = temp;
    }
    return arr;
  }

  public static void main(String[] args) {
    int[] solutionArray = { 1, 2, 3, 4, 5, 6, 16, 15, 14, 13, 12, 11 };

    int[] shuffledArray = shuffleArray(solutionArray);

    for (int i = 0; i < shuffledArray.length; i++)
    {
      System.out.print(shuffledArray[i] + " ");
    }
    System.out.println();
  }

}
