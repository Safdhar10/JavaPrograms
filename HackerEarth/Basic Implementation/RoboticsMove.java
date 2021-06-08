import java.util.*;

public class RoboticsMove {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int _testCases=sc.nextInt();
        for(int i=0;i<_testCases;i++)
        {
            long _totalMoves=sc.nextLong();

            _totalMoves=(_totalMoves)*(_totalMoves+1);

            System.out.println(_totalMoves);
        }
    }
}
