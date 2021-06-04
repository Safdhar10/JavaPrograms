
import java.util.*;
public class BestIndex {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int n=Integer.parseInt(sc.nextLine());

        long[] _inputArray=new long[n];
        long[] _sumArray=new long[n+1];

        for(int i=0;i<n;i++)
        {
            _inputArray[i]=sc.nextLong();
        }

        for(int i=1;i<n+1;i++)
        {
            _sumArray[i]=_inputArray[i-1]+_sumArray[i-1];
        }

        long max=Integer.MIN_VALUE;

        for(int i=1;i<n+1;i++)
        {
            long Sum=0;
            int _toRun=1;
            int  _tempIndex=i;

            while(_tempIndex+_toRun<n)
            {
                _toRun=_toRun+1;
                _tempIndex+=_toRun;
            }
            Sum=_sumArray[_tempIndex]-_sumArray[i-1];
            
            max=Math.max(max, Sum);
        }
        
        System.out.println(max);
    }
}
