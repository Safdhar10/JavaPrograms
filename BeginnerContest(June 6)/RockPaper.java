<<<<<<< HEAD
import java.util.*;

/**
 * RockPaper
 */
public class RockPaper {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        String[] _inputArray=sc.nextLine().split(" ");

        int FennectThrown=Integer.parseInt(_inputArray[0]);
        int RaccoonThrown=Integer.parseInt(_inputArray[1]);

        if(FennectThrown!=RaccoonThrown)
        {
            System.out.println(3-(FennectThrown+RaccoonThrown));
        }
        else
        {
            System.out.println(FennectThrown);
        }
    }
=======
import java.util.*;

/**
 * RockPaper
 */
public class RockPaper {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        String[] _inputArray=sc.nextLine().split(" ");

        int FennectThrown=Integer.parseInt(_inputArray[0]);
        int RaccoonThrown=Integer.parseInt(_inputArray[1]);

        if(FennectThrown!=RaccoonThrown)
        {
            System.out.println(3-(FennectThrown+RaccoonThrown));
        }
        else
        {
            System.out.println(FennectThrown);
        }
    }
>>>>>>> b72fc2bce3a0030f58263d4249012cd25ea3feb4
}