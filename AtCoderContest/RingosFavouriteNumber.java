//link https://atcoder.jp/contests/abc200/tasks/abc200_c

import java.util.*;

public class RingosFavouriteNumber {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int n=Integer.parseInt(sc.nextLine());

        int A[]=new int[200];
        int count=0;

        for(int i=0;i<n;i++)
        {
            int b=sc.nextInt()%200;
            count+=A[b];
            A[b]++;
        }
        System.out.print(count);
    }
}
