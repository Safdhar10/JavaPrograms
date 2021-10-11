package DailyPractice;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class DaySixteen {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String S = bufferedReader.readLine();

        bufferedReader.close();

        try
        {
            int temp=Integer.parseInt(S);
            System.out.println(temp);
        }
        catch(NumberFormatException ex)
        {
            System.out.println("Bad String");
        }
    }
}
