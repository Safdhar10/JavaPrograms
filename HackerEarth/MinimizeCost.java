import java.util.*;
public class MinimizeCost {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        String[] _line1=sc.nextLine().split(" ");

        int n=Integer.parseInt(_line1[0]);
        int k=Integer.parseInt(_line1[1]);

        long[] _inputArray=new long[n];
        long overallSum=0;

        for(int i=0;i<n;i++)
        {
            _inputArray[i]=sc.nextLong();
            overallSum+=_inputArray[i];
        }

        int count=0;
        long sum=0;
        int min=k;

        for(int i=0;i<n;i++)
        {
            if(_inputArray[i]>=0)
            {
                count+=1;
                sum+=_inputArray[i];
                min=k;
            }
            else
            {
                if(count==0)
                {
                    System.out.println( Math.abs(overallSum));
                    return;
                }
                else
                {
                    min-=1;
                    if(min<0)
                    {
                        sum+=Math.abs(_inputArray[i]);
                    }
                    else
                    {
                        sum+=_inputArray[i];
                    }
                }
            }
        }
        System.out.println(Math.abs(sum));
    }
}
