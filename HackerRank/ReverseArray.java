import java.util.*;

public class ReverseArray {
   public static void main(String[] args) {
       
    Scanner sc=new Scanner(System.in);

    int n=sc.nextInt();
    List<Integer> arr=new ArrayList<>(n);
     
    for(int i=0;i<n;i++)
    {
        arr.add(i, sc.nextInt());
    }
    for(int i=n-1;i>=0;i--)
    {
        System.out.print(arr.get(i)+" ");
    }
   } 
}
