import java.util.*;

import javax.print.DocFlavor.STRING;
public class IsPalindrome {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        StringBuilder input=new StringBuilder();

        input.append(sc.nextLine());
        String _actual=input.reverse().toString();
        String _reverse=input.reverse().toString();
        if(_actual.equals(_reverse))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }


        

       
        /*
        
        int _start=0;
        int _end=_input.length()-1;

        while(_start<_end)
        {
            if(_input.charAt(_start)!=_input.charAt(_end))
            {
                System.out.println("NO");
                return;
            }
            _start++;
            _end--;
        } */
       
    }
}
