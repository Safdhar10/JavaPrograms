import java.util.*;

public class AliAndHelpingMind {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        String _truckId=sc.nextLine();

        int FirstDigit=Character.getNumericValue(_truckId.charAt(0));
        int SecondDigit=Character.getNumericValue(_truckId.charAt(1));
        int ThirdeDigit=Character.getNumericValue(_truckId.charAt(3));
        int FouthDigit=Character.getNumericValue(_truckId.charAt(4));
        int Fifthdigit=Character.getNumericValue(_truckId.charAt(5));
        int Sixthdigit=Character.getNumericValue(_truckId.charAt(7));
        int SeventhDigit=Character.getNumericValue(_truckId.charAt(8));

        char vowel=_truckId.charAt(2);

        if(vowel=='A' || vowel=='E' || vowel=='O' || vowel=='U' || vowel=='I'|| vowel=='Y')
        {
            System.out.println("invalid");
        }
        else if((FirstDigit+SecondDigit)%2!=0)
        {
            System.out.println("invalid");
        }
        else if((ThirdeDigit+FouthDigit)%2!=0)
        {
            System.out.println("invalid");
        }
        else if((FouthDigit+Fifthdigit)%2!=0)
        {
            System.out.println("invalid");
        }
        else if((Sixthdigit+SeventhDigit)%2!=0)
        {
            System.out.println("invalid");
        }
        else
        {
            System.out.println("valid");
        }

    }
}
