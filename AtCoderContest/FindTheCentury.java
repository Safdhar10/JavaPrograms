import java.util.*;

public class FindTheCentury {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int N=sc.nextInt();

        int Remaining=N%100;
        int Century=N/100;

        if(Remaining!=0)
        {
            System.out.println(++Century);
        }
        else
        {
            System.out.println(Century);
        }
    }
}
