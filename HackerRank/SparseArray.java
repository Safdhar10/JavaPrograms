import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class sub {

    /*
     * Complete the 'matchingStrings' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY strings
     *  2. STRING_ARRAY queries
     */

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
    // Write your code here
        int n=strings.size();
    int m=queries.size();
    List<Integer>r=new ArrayList<Integer>();
    for(int i=0;i<m;i++)
    {
        String s=queries.get(i);
        int result=0;
        for(int j=0;j<n;j++)
        {
            if(s.equals(strings.get(j)))
            {
                result++;
            }
        }
        r.add(result);
    }
    return r;
    }

}

public class SparseArray {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);

        int stringsCount = Integer.parseInt(sc.nextLine());

        List<String> strings = new ArrayList<>();

        for (int i = 0; i < stringsCount; i++) {
            String stringsItem = sc.nextLine();
            strings.add(stringsItem);
        }

        int queriesCount = Integer.parseInt(sc.nextLine());

        List<String> queries = new ArrayList<>();

        for (int i = 0; i < queriesCount; i++) {
            String queriesItem = sc.nextLine();
            queries.add(queriesItem);
        }

        List<Integer> res = sub.matchingStrings(strings, queries);

        for(Integer s : res) {
            System.out.println(s);
        }
    }
}
