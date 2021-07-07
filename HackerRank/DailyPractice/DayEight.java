package DailyPractice;

//Complete this code or write your own from scratch
//Name and Phone Number
import java.util.*;
import java.io.*;

class DayEight{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            map.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            int p=0;
            if(map.containsKey(s))
            {
                p=map.get(s);
                System.out.println(s+"="+p);
            }
            else
            {
                System.out.println( "Not found");
            }
            
        }
        in.close();
    }
}
