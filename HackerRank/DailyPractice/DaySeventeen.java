package DailyPractice;

import java.util.*;
import java.io.*;

//Write your code here

class Calculator
{
    public Integer power(int n,int p) throws Exception
    {
        int temp=1;
        if(n>=0 && p>=0)
        {
            for(int i=1;i<=p;i++)
            {
                temp=temp*n;
            }
        }
        else
        {
            throw new Exception("n and p should be non-negative");
        }
        return temp;
    }
}

class DaySeventeen{

    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
        
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}

