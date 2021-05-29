import java.util.*;

/**
 * TwoHundredABC
 * link https://atcoder.jp/contests/abc200/tasks/abc200_b
 */
public class TwoHundredABC {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        Long N=sc.nextLong();
        Long K=sc.nextLong();

        for(int i=0;i<K;i++)
        {
            if(N%200!=0)
            {
                String S=String.valueOf(N);
                S=S+"200";
                N=Long.parseLong( ((String.valueOf(N))+"200"));
            }
            else
            {
                N=N/200;
            }
        }
        System.out.println(N);
    }

}
