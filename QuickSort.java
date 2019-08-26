class QuickSort {
  int partition(int arr[], int low, int high) {
    int pivot = arr[high];
    int i = low - 1;
    for(int j = low; j < high; j++) {
      if(arr[j] < pivot) {
        i++;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }
    int temp = arr[high];
    arr[high] = arr[i + 1];
    arr[i + 1] = temp;
    return i + 1;
  }
  
  void sort(int arr[], int low, int high) {
    if(low < high) {
      int pi = partition(arr, low, high);
      sort(arr, low, pi - 1);
      sort(arr, pi + 1, high);
    }
  }
  
  void print(int arr[]) {
    int n = arr.length;
    for(int i = 0; i < n; i++)
      System.out.print(arr[i] + " ");
    System.out.println();
  }
  
  public static void main(String[] args) {
    QuickSort qs = new QuickSort();
    int arr[] = {4, 1, 3, 2, 5};
    int n = arr.length;
    System.out.print("Before sorting: ");
    qs.print(arr);
    System.out.print("After sorting: ");
    qs.sort(arr, 0, n - 1);
    qs.print(arr);
  }
}