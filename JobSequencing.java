import java.util.*;

class JobSequencing {
  
  public static void printJobSequence(Job[] jobs) {
    int n = jobs.length;
    boolean slot[] = new boolean[n];
    int result[] = new int[n];
    
    for(int i = 0; i < n; i++)
      slot[i] = false;
    
    for(int i = 0; i < n; i++) {
      for(int j = Math.min(n, jobs[i].deadline) - 1; j >= 0; j--) {
        if(slot[j] == false) {
          result[j] = i;
          slot[j] = true;
          break;
        }
      }
    }
      
    System.out.println("The Job Sequence are: ");
    for(int i = 0; i < n; i++)
      if(slot[i])
        System.out.println(jobs[result[i]].id + " ");
  }
  
  public static void main(String[] args) {
    Job jobs[] = new Job[4];
    jobs[0] = new Job('a', 4, 20);
    jobs[1] = new Job('b', 1, 10);
    jobs[2] = new Job('c', 1, 40);
    jobs[3] = new Job('d', 1, 30);    
    Arrays.sort(jobs, new SortByProfit());
    printJobSequence(jobs);
  }
}

class Job {
  char id;
  int deadline; 
  int profit;
  
  public Job(char id, int deadline, int profit) {
    this.id = id;
    this.deadline = deadline;
    this.profit = profit;
  } 
}

class SortByProfit implements Comparator<Job> {
  public int compare(Job j1, Job j2) {
    return - j1.profit + j2.profit;
  }
}