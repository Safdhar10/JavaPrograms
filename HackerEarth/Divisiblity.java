import java.util.*;
public class Divisiblity {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int N=Integer.parseInt(sc.nextLine());

        String[] inputArray=sc.nextLine().split(" ");

        if(Integer.parseInt( inputArray[N-1])%10==0)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
