import java.nio.file.attribute.AclEntry;
import java.util.*;

public class CompareTheTriplets {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int[] Alice=new int[3];
        int[] Bob=new int[3];
        
        for(int i=0;i<3;i++)
        {
            Alice[i]=sc.nextInt();
        }
        for(int i=0;i<3;i++)
        {
            Bob[i]=sc.nextInt();
        }

        int AliceScore=0;
        int BobScore=0;

        for(int i=0;i<3;i++)
        {
            if(Alice[i]<Bob[i])
            {
                BobScore++;
            }
            else if(Alice[i]>Bob[i])
            {
                AliceScore++;
            }
        }
        System.out.println(AliceScore+" "+BobScore);
    }
}
