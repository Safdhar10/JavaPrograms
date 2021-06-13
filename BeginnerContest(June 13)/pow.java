import java.util.*;
public class pow {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        double A=sc.nextDouble();
        double B=sc.nextDouble();
        double C=sc.nextDouble();


        if(Math.pow(A, C)<Math.pow(B, C))
        {
            System.out.println("<");
        }
        else if(Math.pow(A, C)>Math.pow(B, C))
        {
            System.out.println(">");
        }
        else
        {
            System.out.println("=");
        }
    }
}
