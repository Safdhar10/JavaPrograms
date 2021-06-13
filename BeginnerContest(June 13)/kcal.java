import java.util.*;

/**
 * kcal
 */
public class kcal {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        double A=sc.nextInt();
        double B=sc.nextInt();

        double _check=A/100;

        System.out.println(_check*B);
    }
}