import java.util.*;

/**
 * CostOfBalloons
 */
public class CostOfBalloons {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int _testCases=Integer.parseInt(sc.nextLine());

        for(int i=0;i<_testCases;i++)
        {
            String[] _balloonCosts=sc.nextLine().split(" ");
            int _greenBalloonCost=Integer.parseInt(_balloonCosts[0]);
            int _purpleBalloonCost=Integer.parseInt(_balloonCosts[1]);
    
            int _noOfParticipants=Integer.parseInt(sc.nextLine());

            int _prblm1SolvedParticipant=0;
            int _prblm2SolvedParticipant=0;

            for(int j=0;j<_noOfParticipants;j++)
            {
                String[] _participantSolvedDetail=sc.nextLine().split(" ");
                _prblm1SolvedParticipant+=Integer.parseInt(_participantSolvedDetail[0]);
                _prblm2SolvedParticipant+=Integer.parseInt(_participantSolvedDetail[1]);
            }
            int Result1=(_prblm1SolvedParticipant*_greenBalloonCost)+(_prblm2SolvedParticipant*_purpleBalloonCost);
            int Result2=(_prblm1SolvedParticipant*_purpleBalloonCost)+(_prblm2SolvedParticipant*_greenBalloonCost);

            System.out.println(Math.min(Result1, Result2));
        }



    }
}