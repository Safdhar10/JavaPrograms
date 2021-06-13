import java.util.*;

public class kthExcluded {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int Q=sc.nextInt();

        long max=0;

        long[] tempArr1=new long[N];

        for(int i=0;i<N;i++)
        {
            tempArr1[i]=sc.nextInt();

            max=Math.max(max, tempArr1[i]);
        }

        

    }    
}
