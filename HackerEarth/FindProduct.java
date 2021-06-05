import java.util.*;
public class FindProduct {
   public static void main(String[] args) {
       
    Scanner sc=new Scanner(System.in);

    int _modulo=(int)Math.pow(10, 9)+7;

    long sum=1;

    int n=Integer.parseInt(sc.nextLine());

    for(int i=0;i<n;i++){
        int _temp=sc.nextInt();
        sum=(sum*_temp)%_modulo;
    }

    System.out.println(sum);
   } 
}
