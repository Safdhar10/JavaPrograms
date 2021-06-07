
import java.util.*;
public class BestIndex {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int n=Integer.parseInt(sc.nextLine());

        long[] _inputArray=new long[n];

        for(int i=0;i<n;i++)
        {
            _inputArray[i]=sc.nextLong();
        }
        
        long max=Integer.MIN_VALUE;

        for(int i=0;i<n;i++)
        {
            long Sum=0;
            int _toRun=1;

            int  _tempIndex=i;
            int left=n-i;

            while(left>0)
            {
                for(int k=0;k<_toRun;k++)
                {
                    Sum=Sum+_inputArray[_tempIndex++];
                }
                _toRun=_toRun+1;
                left-=_toRun;
            }
            if(max<Sum)
            {
                max=Sum;
            }
        }
        
        System.out.println(max);
    }
}
