import java.util.*;
public class equlizeArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    List<Integer> arr = new ArrayList<Integer>();
    for(int i=0;i<n;i++)
    {
        arr.add(sc.nextInt());
    }
    int result=equlizeArray(arr);
    System.out.println(result);
    }
    public static Integer equlizeArray(List<Integer> arr)
    {
        int sameDigit=0;
        for(int i=0;i<arr.size()-1;i++)
        {
            int currentDigit=1;
            for(int j=i+1;j<arr.size();j++)
            {
                if(arr.get(i)==arr.get(j))
                {
                    currentDigit++;
                }
            }
            if(currentDigit>sameDigit)
            {
                sameDigit=currentDigit;
            }
        }
        return arr.size()-sameDigit;
    }
}
