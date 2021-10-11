package NumberProblem3;


public class Sample {
    public static void main(String[] args) {
        //#region 1. Maximum Number that divides all the digits of the given number
       // System.out.println(MaxNumDivides(6));
        //#endregion
       //#region 2. Minimum Number that divides all the digits of the given number
       // System.out.println(MinNumDivides(6));
        //#endregion
        //#region 5. N is Power Of 4
        //System.out.print(NisPowerOf4(20));
        //#endregion
        //#region 6. N is Power Of K
         //System.out.println(NisPowerOfK(16, 2));
        //#endregion
        //#region 7. Armstrong Number
        //System.out.println(IsArmstrong(371));
        //#endregion
        //#region 8. Armstrong Number Between N
        //ArmstrongNumberBetweenN(200);
        //#endregion
        //#region 9. Perfect Square Or Not
        //System.out.println(IsPerfectSquare(5));
        //#endregion
        //#region 10. Perfect Square Number between N
        //PerfectSquareBetweenN(30);
        //#endregion

    }
//#region 1. Maximum Number that divides all the digits of the given number
   public static int MaxNumDivides(int n) {
    int MaxNumber=1;
    int PreviousCount=0;
    
        for(int i=2;i<=9;i++)
        {
            int count=0;
            int Number=n;
            while(Number>0)
            {
                int Digit=Number%10;
                if(Digit%i==0)
                {
                    count++;
                }
                Number/=10;
            }
            if(PreviousCount<=count && i>MaxNumber)
            {
                PreviousCount=count;
                MaxNumber=i;
            }
        }
        return MaxNumber;
}
//#endregion
//#region 2. Maximum Number that divides all the digits of the given number
   public static int MinNumDivides(int n) {
    int MinNumber=Integer.MAX_VALUE;
    int PreviousCount=0;
    
        for(int i=2;i<=9;i++)
        {
            int count=0;
            int Number=n;
            while(Number>0)
            {
                int Digit=Number%10;
                if(Digit%i==0)
                {
                    count++;
                }
                Number/=10;
            }
            if(PreviousCount<=count && i<MinNumber)
            {
                PreviousCount=count;
                MinNumber=i;
            }
        }
        return MinNumber;
}
//#endregion
//#region 5. N is power of 4
public static Boolean NisPowerOf4(int n)
{
    while(n!=1)
    {
        if(n%4!=0)
        {
            return false;
        }
        n=n/4;
    }
    return true;
   /* int Floor=(int)Math.floor(Math.log(n)/Math.log(4));
    int Ceiling=(int)Math.floor(Math.log(n)/Math.log(4));
    if(Floor==Ceiling)
    {
        return true;
    }
    else
    {
        return false;
    }*/
    
}
//#endregion

//#region 6. N is power of K
public static Boolean NisPowerOfK(int n,int k)
{
    int floor=(int)Math.floor(Math.log(n)/Math.log(k));
    int Ceiling=(int)Math.floor(Math.log(n)/Math.log(k));
    if(floor==Ceiling)
    {
        return true;
    }
    else
    {
        return false;
    }

}
//#endregion

//#region 7.Armstrong Number
public static Boolean IsArmstrong(int n)
{
    int Digit=(int)Math.floor(Math.log10(n))+1;
    int GetResult=0;
    int Number=n;
    for(int i=1;i<=Digit;i++)
    {
        int GetDigit=Number%10;
        GetResult+=(int)Math.pow(GetDigit, Digit);
        Number/=10;
    }
    if(GetResult==n)
    {
        return true;
    }
    else
    {
        return false;
    }
}
public static Integer ArmstrongNumber(int n)
{
    int Digit=(int)Math.floor(Math.log10(n))+1;
    int GetResult=0;
    int Number=n;
    for(int i=1;i<=Digit;i++)
    {
        int GetDigit=Number%10;
        GetResult+=(int)Math.pow(GetDigit, Digit);
        Number/=10;
    }
    if(GetResult==n)
    {
        return GetResult;
    }
    else
    {
        return null;
    }
}
//#endregion

//#region 8. Find The Armstrong Number Between Interval
public static void ArmstrongNumberBetweenN(int N)
{
    for(int i=1;i<=N;i++)
    {
        if(ArmstrongNumber(i)!=null)
        {
            System.out.println(i);
        }
    }
}
//#endregion


//#region 9. Perfect Square Or Not
public static Boolean IsPerfectSquare(double n)
{
    int i=1;
    while(i*i<=n)
    {
        i++;
    }
    i=i-1;
    return ((i*i)==n);
      /*double Squarevalue=Math.sqrt(n);
      return (Squarevalue-Math.floor(Squarevalue)==0);
      */
      /*if((Squarevalue*Squarevalue)==n)
      {
        return true;
      }
      else
      {
          return false;
      }*/
      
}
//#endregion

//#region 10. All Perfect Square Between N
public static void PerfectSquareBetweenN(int N)
{
    for(int i=1;i<=N;i++)
    {
        if(IsPerfectSquare(i))
        {
            System.out.println(i);
        }
    }
}
//#endregion

//#region 11. Next Perfect Square
public static int NextPerfectSquare(int n)
{
    
}
//#endregion
}
