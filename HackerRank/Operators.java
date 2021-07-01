/**
 * Operators
 */

 import java.util.*;

public class Operators {
public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);

    double _mealCost=sc.nextInt();
    double _tipPercent=sc.nextInt();
    double _taxPercent=sc.nextInt();

    double total_Cost=_mealCost+((_tipPercent/100)*_mealCost)+((_taxPercent/100)*_mealCost);

    System.out.println(Math.round(total_Cost));
}
    
}