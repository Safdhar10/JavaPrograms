package DailyPractice;

import java.util.*;

public class DayTwentySix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int[] returnedDate=new int[3];
        int[] dueDate=new int[3];
        for(int i=0;i<3;i++)
        {
            returnedDate[i]=sc.nextInt();
        }
        sc.nextLine();
        for(int i=0;i<3;i++)
        {
            dueDate[i]=sc.nextInt();
        }
        int _totalDaysWeShouldFine=0;
        if(returnedDate[2]==dueDate[2])
        {
            if(returnedDate[1]==dueDate[1])
            {
                if(returnedDate[0]!=dueDate[0])
                {
                    _totalDaysWeShouldFine=15*(returnedDate[0]-dueDate[0]);
                }
            }
            else
            {
                _totalDaysWeShouldFine=500*(returnedDate[1]-dueDate[1]);
            }
        }
        else
        {
            _totalDaysWeShouldFine=10000;
        }
        System.out.println(_totalDaysWeShouldFine);
    }
}
