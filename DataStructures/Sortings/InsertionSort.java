import java.util.Arrays;
 
public class InsertionSort {
 
    public static void main(String[] args) {
        int A[] = new int[10];
        populateArray(A);
        System.out.println("Before Sorting: ");
        printArray(A);
        // sort the array
        insertionSort(A);
        System.out.println("\nAfter Sorting: ");
        printArray(A);

        //NOTE : The insertion sort is the most versatile of the three and is the best bet in most situations,
        //    assuming the amount of data is small or the data is almost sorted. For larger
        //    amounts of data, quicksort is generally considered the fastest approach    


        //Another way to Insertion sort
        // for(int i = 1; i < a.length; i++){
        //     int temp = A[i];
        //     int j;
        //     for(j = i-1; j >= 0 && temp < a[j]; j--)
        //         a[j+1] = a[j];
        //     a[j+1] = temp;
        // }


        //Note : For inverse sorted order, the insertion sort performs no faster than the bubble sort.
    }
 
    /**
     * This method will sort the integer array using insertion sort algorithm
     * 
     * @param arr
     */
    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int valueToSort = arr[i];
            int j = i;
            while (j > 0 && arr[j - 1] > valueToSort) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = valueToSort;
        }
    }
 
    public static void printArray(int[] B) {
        System.out.println(Arrays.toString(B));
    }
 
    public static void populateArray(int[] B) {
        for (int i = 0; i < B.length; i++) {
            B[i] = (int) (Math.random() * 100);
        }
    }
}