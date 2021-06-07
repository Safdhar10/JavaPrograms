import java.util.*;
public class LifeUniverseEverything {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        while(sc.hasNext())
        {
            int _input=Integer.parseInt(sc.nextLine());
            if(_input==42)
            {
                return;
            }
            System.out.println(_input);
        }
    }
}
