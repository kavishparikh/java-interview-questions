public class PivotInRotatedArray {

  public static int FindSortedArrayRotation(int[] arr, int len) {
  int left = 0;
  int right = len - 1;
 
  while (arr[left] > arr[right]) {
    
    int num = left + (right - left) / 2;
    
    if (arr[num] > arr[right])
      left = num + 1;
    else
      right = num;
  
  }
  
  return left;


  public static void main(String[] args) {}

}