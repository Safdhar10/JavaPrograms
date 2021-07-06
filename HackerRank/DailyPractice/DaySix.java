package DailyPractice;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DaySix {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        List<String>inputList=new ArrayList<String>();
        for(int i=0;i<n;i++)
        {
            inputList.add(sc.nextLine());
        }
        for(String S:inputList)
        {
            Print(S);
        }
    }
    static void Print(String S)
    {
        int length=S.length();
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        for(int i=0;i<length;i++)
        {
            if(i%2==0)
            {
                sb1.append(S.charAt(i));
            }
            else
            {
                sb2.append(S.charAt(i));
            }
        }
        System.out.println(sb1.toString()+" "+sb2.toString());
    }
}
