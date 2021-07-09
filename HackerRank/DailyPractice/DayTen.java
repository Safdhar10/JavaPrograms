package DailyPractice;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class DayTen {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        int count=0;
        int largeOne=0;
        while(n>0)
        {
            int rem=n%2;
            n=n/2;
            if(rem==0)
            {
                count=0;
            }
            else
            {
                count++;
                if(largeOne<count)
                {
                    largeOne=count;
                }
            }
        }
        System.out.println(largeOne);
    }
    
}