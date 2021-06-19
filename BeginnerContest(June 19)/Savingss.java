import java.util.*;

/**
 * Link : https://atcoder.jp/contests/abc206/tasks/abc206_b
 */

public class Savingss {
  public static void main(String[] args) {
      
    Scanner sc=new Scanner(System.in);

    int N=sc.nextInt();
    long sum=0;

    for(int i=1;i<=Integer.MAX_VALUE;i++)
    {
        sum+=i;
        if(sum>=N)
        {
            System.out.println(i);
            return;
        }
    }
  }  
}
