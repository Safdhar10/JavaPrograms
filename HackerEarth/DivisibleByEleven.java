/*link https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/divisibe-or-2d8e196a/ */

import java.util.*;

public class DivisibleByEleven {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int N=Integer.parseInt(sc.nextLine());

        int[] _A=new int[N];

        for(int i=0;i<N;i++)
        {
            _A[i]=sc.nextInt();
        }

        for(int i=0;i<N;i++)
        {
            if(i<(N/2))
            {
                while(_A[i]>9)
                {
                    _A[i]=_A[i]/10;
                }
            }
            else
            {
                _A[i]=_A[i]%10;
            }
        }

        int oddSum=0;
        int evenSum=0;

        for(int i=0;i<N;i++)
        {
            if(i%2==0)
            {
                evenSum+=_A[i];
            }
            else
            {
                oddSum+=_A[i];
            }
        }

        if((Math.abs(evenSum-oddSum)%11)==0)
        {
            System.out.println("OUI");
        }
        else
        {
            System.out.println("NON");
        }
    }
    
}
