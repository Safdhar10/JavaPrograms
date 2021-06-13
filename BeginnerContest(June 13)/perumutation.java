import java.util.*;
public class perumutation {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        Set<Integer> valueList=new HashSet<>();

        for(int i=0;i<N;i++)
        {
            int temp=sc.nextInt();
            if(!valueList.contains(temp))
            {
                valueList.add(temp);
            }
        }

        if(valueList.size()==N)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }

    }
}
