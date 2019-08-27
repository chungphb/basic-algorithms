import java.util.Vector;

class MinimumCoins {
  static int deno[] = {1, 2, 5, 10, 20, 50, 100, 500, 1000};
  static int n = deno.length;
  
  static void findMin(int V) {
    Vector<Integer> res = new Vector<>();                  
    for(int i = n - 1; i >= 0; i--) {
      while(V >= deno[i]) {
        V -= deno[i];
        res.add(deno[i]);
      }
    }
    
    for(int i = 0; i < res.size(); i++) {
      System.out.print(" " + res.elementAt(i));
    }
  }
  
  public static void main(String args[]) {
    int V = 93;
    System.out.print("Result: ");
    findMin(V);
  }
}