import java.io.*;
import java.util.*;

public class ReverseAnArray {

  public static void main(String args[]) {

    int[] arr = {2, 5, 3, 6, 3, 6, 8, 9, 3 , 7};
    int arrLength = arr.length;
    int[] revArray = reverseArray(arr, 0, arrLength-1);
    for(int i=0; i<revArray.length; i++)
      System.out.print(revArray[i] + "  ");
  }

  public static int[] reverseArray(int[] arr, int start, int end) {
    int temp = 0;

    while(start < end) {
      temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
    return arr;
  }

}
