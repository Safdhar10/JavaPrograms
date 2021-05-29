import java.util.*;


import java.io.*;

/**
 * Intersection
 */
public class Intersection {

    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);

        int N=Integer.parseInt(Sc.nextLine());
        String aa=Sc.nextLine();
        
        String[] A=aa.split(" ");

        String bb=Sc.nextLine();
        String[] B=bb.split(" ");

        int low=0;
        int high=Integer.MAX_VALUE;


        for(int i=0;i<N;i++)
        {
            low=Math.max(Integer.parseInt(A[i]), low);
            high=Math.min(Integer.parseInt(B[i]), high);
        }

        System.out.print(high<low?0:(high-low+1));
        
    }
}