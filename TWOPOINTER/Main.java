package TWOPOINTER;

public class Main {
    public static void main(String[] args) {
        int[] array={10,30,2,40,50,39,44};
        //#region 1. Reverse the array
       // ReverseTheArray(array);
        //#endregion
        //#region 2. Find if the give value present in the array
        System.out.println(CheckValuePresentinTheArray(array, 40));
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
}
