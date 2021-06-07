<<<<<<< HEAD
import java.util.*;

public class Tour {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        String[] _line1=sc.nextLine().split(" ");

        int N=Integer.parseInt(_line1[0]);
        int M=Integer.parseInt(_line1[1]);

        int _sum=N;

        String[] A_Array=new String[M];
        String[] B_Array=new String[M];

        HashMap<Integer,Integer> Pair=new HashMap<>();

        List<String> Check=new ArrayList<String>();

        for(int i=0;i<M;i++)
        {
            String[] _line2=sc.nextLine().split(" ");
            A_Array[i]=_line2[0];
            B_Array[i]=_line2[1];
        }

        for(int i=0;i<M;i++)
        {
            for(int j=0;j<M;j++)
            {
                if(!(A_Array[i].equals(B_Array[j])))
                {
                    String temp=A_Array[i]+" "+B_Array[j];
                    if(!Check.contains(temp))
                    {
                        Check.add(temp);
                        _sum++;
                    }
                }
            }
        }
        System.out.println(_sum);
    }
    
}
=======
import java.util.*;

public class Tour {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        String[] _line1=sc.nextLine().split(" ");

        int N=Integer.parseInt(_line1[0]);
        int M=Integer.parseInt(_line1[1]);

        int _sum=N;

        String[] A_Array=new String[M];
        String[] B_Array=new String[M];

        HashMap<Integer,Integer> Pair=new HashMap<>();

        List<String> Check=new ArrayList<String>();

        for(int i=0;i<M;i++)
        {
            String[] _line2=sc.nextLine().split(" ");
            A_Array[i]=_line2[0];
            B_Array[i]=_line2[1];
        }

        for(int i=0;i<M;i++)
        {
            for(int j=0;j<M;j++)
            {
                if(!(A_Array[i].equals(B_Array[j])))
                {
                    String temp=A_Array[i]+" "+B_Array[j];
                    if(!Check.contains(temp))
                    {
                        Check.add(temp);
                        _sum++;
                    }
                }
            }
        }
        System.out.println(_sum);
    }
    
}
>>>>>>> b72fc2bce3a0030f58263d4249012cd25ea3feb4
