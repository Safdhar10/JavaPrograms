package AtCoderContest;

import java.util.Scanner;

public class slot {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        char[] c=s.toCharArray();
        if(c[0]==c[1] && c[1]==c[2])
        {
            System.out.println("Won");
        }
        else
        {
            System.out.println("Lost");
        }
        
    }
    
}
