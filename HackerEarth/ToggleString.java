import java.util.*;

public class ToggleString {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        String _input=sc.nextLine();

        for(int i=0;i<_input.length();i++)
        {
            char _temp=_input.charAt(i);
            if( _temp>=97 && _temp<=122 )
            {
                System.out.print(Character.toChars(_temp-32));
            }
            else
            {
                System.out.print(Character.toChars(_temp+32));
            }
        }
        System.out.println();
    }
}
