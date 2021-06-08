import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class DigitCube {
  

    static int FofNumber(long n)
    {
            int sum=0;
                while(n>0)
                {
                    sum+=n%10;
                    n=n/10;
                }
                return sum;
    }
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("C:\\Users\\exams\\Downloads\\sam.txt");
        
        Scanner sc=new Scanner(file);

        int _testCases=sc.nextInt();
        long[] _sumStaticSum=new long[100000000];

        for(int i=0;i<_testCases;i++)
        {
            long result=0;
            long _number=sc.nextLong();
            long _noOfTime=sc.nextLong();
            long previous=0;

            for(int j=0;j<_noOfTime;j++)
            {
                int sum=FofNumber(_number);
                if(_sumStaticSum[sum]!=0)
                {
                    System.out.println(_sumStaticSum[sum]);
                    break;
                }
                if(previous==sum)
                {
                    _sumStaticSum[sum]=_number;
                 break;   
                }
                previous=sum;
                result=sum*sum*sum;
                _number=result;
            }
            System.out.println(_number);
        }
    }
}
