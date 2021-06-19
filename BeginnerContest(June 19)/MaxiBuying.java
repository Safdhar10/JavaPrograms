import java.util.*;

/**
 * MaxiBuying
 * Link : https://atcoder.jp/contests/abc206/tasks/abc206_a
 */
public class MaxiBuying {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int N=sc.nextInt();

        long result=Math.round(N*1.08);

        if(result<206)
        {
            System.out.println("Yay!");
        }
        else if(result>206)
        {
            System.out.println(":(");
        }
        else
        {
            System.out.println("so-so");
        }
    }
}