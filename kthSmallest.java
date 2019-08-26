import java.util.Arrays;
import java.util.Collections;

class kthSmallest {
  public static int kthSmallest(int[] arr, int k) {
    Arrays.sort(arr);
    return arr[k - 1];
  }
  
  public static void main(String args[]) {
    int arr[] = {7, 4, 9, 2, 3, 1, 5};
    int k = 4;
    System.out.println(k + "th smallest element is: " + kthSmallest(arr, k));
  }
}