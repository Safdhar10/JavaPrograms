import java.util.*;

public class Cooking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int N=Integer.parseInt(sc.nextLine());

        String[] _getInput=sc.nextLine().split(" ");

        if(N==2)
        {
            System.out.println(Math.max(Integer.parseInt(_getInput[0]),Integer.parseInt(_getInput[1])));
            return;
        }
        int _sum=0;
        for(int i=0;i<N;i++)
        {
            _sum+=Integer.parseInt(_getInput[i]);
        }

        if(_sum%2==0)
        {
            System.out.println(_sum/2);
        }
        else
        {
            System.out.println((_sum/2)+1);
        }
    }
}
