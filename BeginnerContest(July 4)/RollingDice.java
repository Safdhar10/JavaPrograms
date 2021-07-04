import java.util.*;

/**
 * RollingDice
 */
public class RollingDice {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int A=sc.nextInt();
        int B=sc.nextInt();

        int low=A*1;
        int max=A*6;

        if(B>=low && B<=max)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}