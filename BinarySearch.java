class BinarySearch {
  int binarySearch(int arr[], int l, int r, int x) {
    if(r >= l) {
      int m = (r+l)/2;
      if(arr[m] == x) return m;
      if(arr[m] > x) return binarySearch(arr, l, m - 1, x);
      return binarySearch(arr, m + 1, r, x);
    }
    return -1;
  }
  
  public static void main(String[] args) {
    BinarySearch bs = new BinarySearch();
    int arr[] = {1, 2, 3, 4, 10, 20};
    int x = 10;
    int n = arr.length;
    int r = bs.binarySearch(arr, 0, n - 1, x);
    if(r == -1)
      System.out.println("Not exist.");
    else
      System.out.println(x + " is at index " + r);
  }
}