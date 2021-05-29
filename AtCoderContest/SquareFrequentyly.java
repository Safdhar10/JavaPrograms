import java.io.*;
import java.util.*;


public class SquareFrequentyly {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        int C=sc.nextInt();
       Double SquareOfFirstTwo= Math.pow(A, 2) + Math.pow(B, 2);
        Double SquareofThird=Math.pow(C,2);

         if(SquareOfFirstTwo<SquareofThird)
        {
            System.out.print("Yes");
        }
        else
        {
            System.out.print("No");
        }
    }
}
