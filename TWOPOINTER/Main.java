package TWOPOINTER;

public class Main {
    public static void main(String[] args) {
        int[] array={10,30,2,50,40,39,44};
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
        System.out.println(Smallest(array));
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

}
