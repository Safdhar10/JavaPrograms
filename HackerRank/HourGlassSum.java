import java.util.*;

public class HourGlassSum {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        List<List<Integer>> arr=new ArrayList<List<Integer>>();

        for(int i=0;i<6;i++)
        {
            List<Integer>tempList=new ArrayList<>(6);
            for(int j=0;j<6;j++)
            {
                tempList.add(sc.nextInt());
            }
            arr.add(tempList);
        }
        int result=hourglassSum(arr);
        System.out.println(result);

    }
    public static int hourglassSum(List<List<Integer>> arr)
    {
        int max=Integer.MIN_VALUE;

        for(int i=0;i<4;i++)
        {
            int temp=0;
            for(int j=0;j<4;j++)
            {
                temp=arr.get(i).get(j)+arr.get(i).get(j+1)+arr.get(i).get(j+2)+arr.get(i+1).get(j+1)+arr.get(i+2).get(j)+arr.get(i+2).get(j+1)+arr.get(i+2).get(j+2);
                if(temp>max)
                {
                    max=temp;
                }
            }
        }
        return max;
    }
}
