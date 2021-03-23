package TWOPOINTER;


public class Main {
    public static void main(String[] args) {
        int[] array={1,2,2,3,2,4,5,1};
        //#region 1. Reverse the array
       // ReverseTheArray(array);
        //#endregion
        //#region 2. Find if the give value present in the array
       // System.out.println(CheckValuePresentinTheArray(array, 40));
        //#endregion
        //#region 3.Check X is present more than one time
       // System.out.println(CheckXisPresentMoreThanOnce(array, 40));
        //#endregion
        //#region 4. Largest number in array
        //System.out.println(LargestNumber(array));
        //#endregion
        //#region 5. Smallest number in array
       // System.out.println(Smallest(array));
        //#endregion
        //#region 6. Second largest Number
       // System.out.println(NthLargestNumber(array, 2));
       System.out.println(SecondLargest(array));
        //#endregion
        //#region 7. Second Smallest Number
        //System.out.println(NthSmallestNumber(array,2));
        //#endregion
        //#region 8. Occurance of target value
        //System.out.println(OccuranceOfX(array,10));
        //#endregion
        //#region 9. Sum of Element of Odd location is equal to Even locations
        //System.out.println(SumOfOddAndEvenLocationisEqual(array));
        //#endregion

    }
    //#region 1. Reverse the array
    public static void ReverseTheArray(int[] array)
    {
        int _start=0;
        int _end=array.length-1;
        while(_start<=_end)
        {
            int temp=array[_end];
            array[_end]=array[_start];
            array[_start]=temp;
            _start++;
            _end--;
        }
        for (int i : array) {
            System.out.print(i+" ");
        }
    }
    //#endregion

    //#region 2.The given value present in the array
    public static boolean CheckValuePresentinTheArray(int[] array,int number)
    {
        int _start=0;
        int _end=array.length-1;
        while(_start<=_end)
        {
            if(array[_start]==number||array[_end]==number)
            {
                return true;
            }
            _start++;
            _end--;
        }
        return false;
    }
    //#endregion

    //#region 3.Check X is present more than one time
    public static boolean CheckXisPresentMoreThanOnce(int[] array,int x)
    {
        int _start=0;
        int _end=array.length-1;
        int count=0;
        while(_start<_end)
        {
            if(array[_start]==x)
            {
                count++;
            }
            if(array[_end]==x)
            {
                count++;
            }
            _start++;
            _end--;
        }
        if(_start==_end)
        {
            if(array[_start]==x)
            {
                count++;
            }
        }
        return count>1?true:false;
    }
    //#endregion

    //#region 4. Largest number in array
    public static int LargestNumber(int[] array)
    {
        int _start=0;
        int _end=array.length-1;
        int _max=Integer.MIN_VALUE;
        while(_start<=_end)
        {
            if(array[_start]>_max)
            {
                _max=array[_start];
            }
            if(array[_end]>_max)
            {
                _max=array[_end];
            }
            _start++;
            _end--;
        }
        return _max;
    }
    //#endregion

    //#region 5. Smallest number in array
    public static int Smallest(int[] array)
    {
        int _start=0;
        int _end=array.length-1;
        int min=Integer.MAX_VALUE;
        while(_start<=_end)
        {
            if(array[_start]<min)
            {
                min=array[_start];
            }
            if(array[_end]<min)
            {
                min=array[_end];
            }
            _start++;
            _end--;
        }
        return min;
    }
    //#endregion

    //#region 6. Second Largest number in array
    public static int NthLargestNumber(int[] array,int n)
    {
        int _max=Integer.MAX_VALUE;
        for(int index=1;index<=n;index++)
        {
            int _start=0;
            int _end=array.length-1;
            int _currentMax=Integer.MIN_VALUE;
            while(_start<=_end)
            {
                if(array[_start]>_currentMax&&array[_start]<_max)
                {
                    _currentMax=array[_start];
                }
                if(array[_end]>_currentMax&&array[_end]<_max)
                {
                    _currentMax=array[_end];
                }
                _start++;
                _end--;
            }
            _max=_currentMax;
        }
        return _max;
    }
    public static int SecondLargest(int[] array)
    {
        int _maxElement=0;
        int _currentMax=Integer.MIN_VALUE;
        int _first=0;
        int _last=array.length-1;
        while(_first<=_last)
        {
            if(array[_first]>_currentMax)
            {
                _maxElement=_currentMax;
                _currentMax=array[_first];
            }
            else if(array[_first]>_maxElement)
            {
                _maxElement=array[_first];
            }
            if(array[_last]>_currentMax)
            {
                _maxElement=_currentMax;
                _currentMax=array[_last];
            }
            else if(array[_last]>_maxElement)
            {
                _maxElement=array[_last];
            }

            _first++;
            _last--;
        }
        return _maxElement;
    }
    //#endregion

    //#region 7. Second Smallest number in array
    public static int NthSmallestNumber(int[] array, int n)
    {
        int _min=Integer.MIN_VALUE;
        for(int index=1;index<=n;index++)
        {
            int _start=0;
            int _end=array.length-1;
            int _currentMin=Integer.MAX_VALUE;
            while(_start<=_end)
            {
                if(array[_start]<_currentMin&&array[_start]>_min)
                {
                    _currentMin=array[_start];
                }
                if(array[_end]<_currentMin&&array[_end]>_min)
                {
                    _currentMin=array[_end];
                }
                _start++;
                _end--;
            }
            _min=_currentMin;
        }
        return _min;
    }
    //#endregion

    //#region 8. Count the occurance of the target value in a given array
    public static int OccuranceOfX(int[] array,int x)
    {
        int _start=0;
        int _end=array.length-1;
        int _count=0;
        while(_start<_end)
        {
            if(array[_start]==x)
            {
                _count++;
            }
            if(array[_end]==x)
            {
                _count++;
            }
            _start++;
            _end--;
        }
        if(_start==_end && array[_start]==x)
        {
            _count++;
        }
        return _count++;
    }
    //#endregion

    //#region 9. Sum of Element of Odd location is equal to Even locations
    public static boolean SumOfOddAndEvenLocationisEqual(int[] array)
    {
        int _firstPointer=0;
        int _secondPointer=1;
        int _oddLocationSum=0;
        int _evenLocationSum=0;
        int _loop=array.length/2;
        while(_loop-->0)
        {
            _oddLocationSum+=array[_firstPointer];
            _evenLocationSum+=array[_secondPointer];
            _firstPointer+=2;
            _secondPointer+=2;
        }
        if(_secondPointer==array.length)
        {
            _oddLocationSum+=array[_firstPointer];
        }
        return _oddLocationSum==_evenLocationSum?true:false;
    }
    //#endregion


}
