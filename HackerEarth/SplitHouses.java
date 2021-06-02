import java.util.*;

/**
 * SplitHouses link: https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/split-house-547be0e9/
 */
public class SplitHouses {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int _grid=Integer.parseInt(sc.nextLine());
        String _village=sc.nextLine();

        _village=_village.replace('.', 'B');

        if(_village.contains("HH"))
        {
            System.out.println("NO");
        }
        else
        {
            System.out.println("YES");
            System.out.println(_village);
        }

    }
}