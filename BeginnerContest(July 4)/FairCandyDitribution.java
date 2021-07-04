import java.util.*;

public class FairCandyDitribution {
public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);

    int N=sc.nextInt();
    long K=sc.nextLong();

    long[] arr=new long[N];
    for(int i=0;i<N;i++)
    {
        long temp=sc.nextLong();
        arr[i]=temp;
    }

    long _div=K/N;
    long _rem=K%N;

    long[] ar=KthSmallestElement(arr, _rem, N);

    for (long l : ar) {
        if(l==1)
        {
            System.out.println(_div+1);
        }
        else
        {
            System.out.println(_div);
        }
    }
}    
public static long[] KthSmallestElement(long[] array,long k,int n)
{
    long Small = Integer.MIN_VALUE;
    long[] result_arr=new long[n];
    int index = 0;
    HashMap<Integer, Long> IndexDetails = new HashMap<Integer, Long>();
    for(int i=0;i<k;i++)
    {
        long smallest = Integer.MAX_VALUE;
        for(int j=0;j<n;j++)
        {
            if(smallest>array[j] && Small<=array[j])
            {
                if(!IndexDetails.containsKey(j))
                {
                    smallest = array[j];
                    index = j;
                }
            }
        }
        result_arr[index]=1;
        IndexDetails.put(index, array[index]);
        Small = smallest;
    }
    return result_arr;
}
}
