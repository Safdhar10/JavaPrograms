package DailyPractice;

import java.io.*;
import java.util.*;

public class DayEighteen {
    Stack<Character> stack = new Stack<Character>();
    Queue<Character> q = new LinkedList<>();
    // Write your code here.
    void pushCharacter(char c)
    {
        stack.push(c);
    }
    char popCharacter()
    {
        return stack.pop();
    }
    void enqueueCharacter(char c)
    {
        q.add(c);
    }
    char dequeueCharacter()
    {
        return q.remove();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        DayEighteen p = new DayEighteen();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}
