

/*
 * CountTheOccuranceOfDigit
 * Link : https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/tutorial/
 */
import java.util.*;
public class CountTheOccuranceOfDigit {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String _input=sc.nextLine();

        int[] AllDigitsCounts=new int[10];

        for(int i=0;i<_input.length();i++)
        {
            int _temp=Character.getNumericValue(_input.charAt(i));

            AllDigitsCounts[_temp]++;
        }

        System.out.println("0 "+AllDigitsCounts[0]);
        System.out.println("1 "+AllDigitsCounts[1]);
        System.out.println("2 "+AllDigitsCounts[2]);
        System.out.println("3 "+AllDigitsCounts[3]);
        System.out.println("4 "+AllDigitsCounts[4]);
        System.out.println("5 "+AllDigitsCounts[5]);
        System.out.println("6 "+AllDigitsCounts[6]);
        System.out.println("7 "+AllDigitsCounts[7]);
        System.out.println("8 "+AllDigitsCounts[8]);
        System.out.println("9 "+AllDigitsCounts[9]);
    }
}