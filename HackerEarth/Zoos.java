import java.util.*;

/**
 * Zoos link: https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/is-zoo-f6f309e7/
 */
public class Zoos {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        String input=sc.nextLine();

        int z_count=0;
        int o_count=0;

        for(int i=0;i<input.length();i++)
        {
            char temp=input.charAt(i);
            if(temp=='z')
            {
                z_count++;
            }
            else
            {
                o_count++;
            }
        }

        if(o_count==(2*z_count) && input.length()<=20)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}