import java.util.*;
public class ArrayLeftRotation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        sc.nextLine();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        arr=LeftRotate(arr, k);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
    public static int[] LeftRotate(int[] arr,int k)
    {
        int[] temp=new int[arr.length];
        int length=arr.length;
        for(int i=0;i<length;i++)
        {
            int index=(i+length-k)%length;
            temp[index]=arr[i];
        }
        return temp;
    }
}

