import java.util.*;

public class CountDivisors {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        String[] _inputArray=sc.nextLine().split(" ");

        int _start=Integer.parseInt(_inputArray[0]);
        int _end=Integer.parseInt(_inputArray[1]);
        int _divisor=Integer.parseInt(_inputArray[2]);

        int _count=0;
        /*if(_start/_divisor>=1 && _start!=_end)
        {
            _count+=1;
        }

        _count+=(_end/_divisor)-(_start/_divisor);*/

        for(int i=_start;i<=_end;i++)
        {
            if(i%_divisor==0)
            {
                _count++;
            }
        }

        System.out.println(_count);
    }
}
