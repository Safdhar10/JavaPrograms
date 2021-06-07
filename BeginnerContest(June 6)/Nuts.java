import java.util.*;

public class Nuts {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int _totalTrees=Integer.parseInt(sc.nextLine());
        int _totalNuts=0;

        for(int i=0;i<_totalTrees;i++)
        {
            int _temp=sc.nextInt();

            if(_temp>10)
            {
                _totalNuts+=(_temp-10);
            }
        }
        System.out.println(_totalNuts);
    }
}
