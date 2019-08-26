class ActivitySelection {
  public static void sort(int start[], int finish[], int n) {
    for(int i = 0; i < n - 1; i++){
      for(int j = i + 1; j < n; j++) {
        if(finish[j] < finish[i]) {
          int temp = finish[i];
          finish[i] = finish[j];
          finish[j] = temp;
          temp = start[i];
          start[i] = start[j];
          start[j] = temp;
        }
      }
    }
  }
  
  public static void printMaxActivities(int start[], int finish[], int n) {
    System.out.println("The chosen activities are: ");
    int i, j;
    i = 0;
    System.out.println(start[i] + " - " + finish[i]);
    for(j = 1; j < n; j++) {
      if(start[j] >= finish[i]) {
        i = j;
        System.out.println(start[j] + " - " + finish[j]);
      }
    }
  }
  
  public static void main(String[] args) {
    int start[] = {1, 0, 3, 5, 8, 5};
    int finish[] = {2, 6, 4, 9, 9, 7};
    int n = start.length;
    sort(start, finish, n);
    printMaxActivities(start, finish, n);
  }
}