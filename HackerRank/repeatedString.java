
import java.util.*;

public class repeatedString {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        String s=sc.nextLine();
        long n=sc.nextLong();

        long result=repeated(s, n);
        System.out.println(result);
    }
    
    public static long repeated(String s,long n)
    {
        int length=s.length();
        int A=0;
        for(int i=0;i<length;i++)
        {
            if(s.charAt(i)=='a')
            {
                A=A+1;
            }
        }
        long totalA=(n/length)*A;
        long remaining=n%length;

        for(int i=0;i<remaining;i++)
        {
            if(s.charAt(i)=='a')
            {
                totalA++;
            }
        }
        return totalA;
    }
}
