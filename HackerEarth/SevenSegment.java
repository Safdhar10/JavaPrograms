import java.util.*;

public class SevenSegment {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int _testCases=Integer.parseInt(sc.nextLine());

        for(int i=0;i<_testCases;i++)
        {
            String _number=sc.nextLine();

            int _sum=0;
            
            for(int j=0;j<_number.length();j++)
            {
                int n=Character.getNumericValue(_number.charAt(j));
                _sum+=GetSticksofDigit(n);
            }

            if(_sum%2==0)
            {
                while(_sum!=0)
                {
                    System.out.print("1");
                    _sum-=2;
                }
            }
            else
            {
                System.out.print("7");
                _sum-=3;
                while(_sum!=0)
                {
                    System.out.print("1");
                    _sum=_sum-2;
                }
            }
            System.out.println();
        }

    }

    public static int GetSticksofDigit(int N)
    {
        if(N==1)
        {
            return 2;
        }
        else if(N==2 || N==3 || N==5)
        {
            return 5;
        }
        else if(N==4)
        {
            return 4;
        }
        else if(N==7)
        {
            return 3;
        }
        else if(N==0 || N==6 || N==9)
        {
            return 6;
        }
        else
        {
            return 7;
        }
    }

   
}
