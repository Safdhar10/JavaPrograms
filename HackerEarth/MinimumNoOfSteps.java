import java.util.*;

/**
 * MinimumNoOfSteps
 */
public class MinimumNoOfSteps {

    public static void main(String[] args) {
        
        Scanner Sc=new Scanner(System.in);
        int N=Integer.parseInt(Sc.nextLine());

        String[] _a=Sc.nextLine().split(" ");
        int[] A=new int[N];

        String[] _b=Sc.nextLine().split(" ");
        int[] B=new int[N];

        int min=Integer.MAX_VALUE;

        for(int i=0;i<N;i++)
        {
            A[i]=Integer.parseInt(_a[i]);
            B[i]=Integer.parseInt(_b[i]);

            if(A[i]<min)
            {
                min=A[i];
            }
        }

        int count=0;
        boolean check=false;


        for(int i=0;i<N;i++)
        {
            while(A[i]>min && B[i]!=0)
            {
                A[i]=A[i]-B[i];
                count++;
                if(A[i]<0)
                {
                    break;
                }
            }

            if(A[i]<min)
            {
                min=A[i];
            }
        }

        if(A[0]!=A[N-1])
        {
            System.out.println(-1);
        }
        else
        {
            System.out.println(count);
        }

    }
}