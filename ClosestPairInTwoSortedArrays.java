class ClosestPairInTwoSortedArrays {
  public static void printClosestPair(int arr1[], int arr2[], int m, int n, int x) {
    int diff = Integer.MAX_VALUE;
    int res_l = 0, res_r = 0;
    int l = 0;
    int r = n - 1;
    while(l < m && r >= 0) {
      if(Math.abs(arr1[l] + arr2[r] - x) < diff) {
        diff = Math.abs(arr1[l] + arr2[r] - x);
        res_l = l;
        res_r = r;
      }
      
      if(arr1[l] + arr2[r] < x)
        l++;
      else
        r--;
    }
    
    System.out.println("The closet pair is (" + arr1[res_l] + ", " + arr2[res_r] + ").");
  }
  
  public static void main(String[] args) {
    int arr1[] = {1, 4, 5, 7};
    int arr2[] = {10, 20, 30, 40};
    int x = 38;
    int m = arr1.length;
    int n = arr2.length;
    printClosestPair(arr1, arr2, m, n, x);
  }
}