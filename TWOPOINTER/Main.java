package TWOPOINTER;

import org.graalvm.compiler.nodes.java.NewArrayNode;

public class Main {
    public static void main(String[] args) 
    {
        int[] array={-2,-1,0,1,3,5,5,6,7};
        int[] array2={7,8,9};
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
       //System.out.println(SecondLargest(array));
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
        //#region 10. Find if there exists a pair of elements
        // System.out.println(PairofElements(array, 2));
        //#endregion
        //#region 11. a[i]+a[j]=0
        //System.out.println(SumTwoNumberisEqualToZero(array));
        //#endregion
        //#region 12. Intersection of Two Sorted Arrays
        //IntersectionOfTwoSortedArrays(array,array2);
        //#endregion
        //#region 15. Pair of Number with Sum Equal to X
        //PairOfNumberEqualToX(array, 10);
        //#endregion
        //#region 16. Pair of number with Sum Closest to X
        //PairOfNumberClosestToX(array, 5);
        //#endregion
        //#region 17. Triplet with sum Equal to X
        //TripletSumEqualToX(array, 10);
        //#endregion
        //#region 18. MergeTwoSortedArray
        //MergeTwoSortedArray(array, array2);
        //#endregion
        //#region 19. Merge A and B array into B
        //MergeAandB(array,array2);
        //#endregion
        //#region 20. Unique Triplets in the array which gives the sum of zero
        TripletsisEqualToZero(array);
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

    //#region 10. Find if there exists a pair of elements
    public static Integer PairofElements(int[] array,int B)
    {
        for(int i=0;i<array.length;i++ )
        {
            int _find=array[i]-B;
            for(int j=0;j<array.length;j++)
            {
                if(array[j]==_find)
                {
                    return 1;
                }
            }
        }
        return 0;
    }
    //#endregion

    //#region 11. Find a[i]+a[j]=0
    public static boolean SumTwoNumberisEqualToZero(int[] array)
    {
        /*for(int i=0;i<array.length;i++)
        {
            if(array[i]<=0)
            {
                int _target=array[i]*-1;
                if(BinarySearch(array, _target))
                {
                    return true;
                }
            }
            else
            {
                return false;
            }
        }
        return false;*/
        int _left=0;
        int _right=array.length-1;
        while(_left<_right)
        {
            if(array[_left]<=0)
            {
                if((array[_left]+array[_right])<0)
                {
                    _left++;
                }
                else if((array[_left]+array[_right])>0)
                {
                    _right--;
                }
                else
                {
                    return true;
                }
            }
            else
            {
                return false;
            }
        }
        return false;
    }
    public static boolean BinarySearch(int[] array,int target)
    {
        int _left=0;
        int _right=array.length-1;
        while(_left<=_right)
        {
            int _midValue=(int)Math.floor((_left+_right)/2);
            if(array[_midValue]>target)
            {
                _right=_midValue-1;
            }
            else if(array[_midValue]<target)
            {
                _left=_midValue+1;
            }
            else
            {
                return true;
            }
        }
        return false;
    }
    //#endregion

    //#region 12. IntersectionOfTwoSortedArrays
    public static void IntersectionOfTwoSortedArrays(int[] array1,int[] array2)
    {
        int _array1Length=array1.length;
        int _array2Length=array2.length;
        int _array1Point=0;
        int _array2Point=0;
        while(_array1Point<_array1Length && _array2Point<_array2Length)
        {
            if(array1[_array1Point] < array2[_array2Point])
                _array1Point++;
            else if(array1[_array1Point] > array2[_array2Point])
                _array2Point++;
            else
            {
                System.out.print(array2[_array2Point]+" ");
                _array1Point++;
            }

        }
        System.out.println();
    }
    //#endregion

    //#region 15. Pair of Number with Sum Equal to X
    public static boolean PairOfNumberEqualToX(int[] array,int X)
    {
        if(array[0]>=X)
        {
            return false;
        }
        int _left=0;
        int _right=array.length-1;
        while(_left<_right)
        { 
            if((array[_left]+array[_right])<X)
            {
                _left++;
            }
            else if((array[_left]+array[_right])>X)
            {
                _right--;
            }
            else
            {
                System.out.println("("+array[_left]+","+array[_right]+") is Equal to "+X);
                return true;
            }
        }
        System.out.println("No Pair is exist to Equal "+X);
        return false;
    }
    //#endregion

    //#region 16. Pair of numbers with sum Closest to X
    public static void PairOfNumberClosestToX(int[] array,int X) 
    {
            int _rightElement=0;
            int _leftElement=0;
            int _sum=0;
            int _left=0;
            int _right=array.length-1;
            while(_left<_right)
            {
                int temp=(array[_left]+array[_right]);
                if(temp<X)
                {
                    if(temp>_sum)
                    {
                        _leftElement=_left;
                        _rightElement=_right;
                        _sum=temp;
                    }
                    _left++;
                }
                else
                {
                    _right--;
                }
            }
        System.out.println("("+array[_leftElement]+","+array[_rightElement]+") : "+_sum+" which is Closest To "+X);
    }
    //#endregion
    //#region 17. Triplet with sum Equal to X
    public static void TripletSumEqualToX(int[] array,int x) 
    {
        for(int i=0;i<array.length-2;i++)
        {
            int _left=i+1;
            int _right=array.length-1;
            while(_left<_right)
            {
                if((array[i]+array[_left]+array[_right])<x)
                {
                    _left++;
                }
                else if((array[i]+array[_left]+array[_right])>x)
                {
                    _right--;
                }
                else 
                {
                    System.out.println("("+array[i]+","+array[_left]+","+array[_right]+") is Equal to "+x);
                    return ;
                }
            }
        }
        System.out.println("No Triplet is Equal to "+x);
    }
    //#endregion

    //#region 18. Merge Two Sorted Array as One Sorted Array
    public static void MergeTwoSortedArray(int[] array1,int[] array2) 
    {
        int _array1Length=array1.length;
        int _array2Length=array2.length;
        int[] newArray=new int[_array1Length+_array2Length];
        int _a1=0;
        int _a2=0;
        int _newIndex=0;
        while(_a1<array1.length && _a2<array2.length)
            {
                if(array1[_a1]<=array2[_a2])
                {
                    newArray[_newIndex++]=array1[_a1++];
                }
                else
                {
                    newArray[_newIndex++]=array2[_a2++];
                }
            }
        while(_a2<array2.length)
            {
                newArray[_newIndex++]=array2[_a2++];
            }
        while(_a1<array1.length)
            {
                newArray[_newIndex++]=array1[_a1++];
            }
            for (int i : newArray) {
                System.out.print(i+" ");
            }
    
        
    }
    //#endregion

    //#region 19. Merage A and B array into B array
    public static void MergeAandB(int[] array1,int[] array2) 
    {
        int _a1=array1.length-1;
        int _a2=array2.length-1;
        int[] newArray=new int[_a1+_a2+2];
        /*for(int index=_a1+_a2+1;index>=0;index--)
        {
            if(_a1<0)
            {
                newArray[index]=array2[_a2--];
            }
            else if(_a2<0)
            {
                newArray[index]=array1[_a1--];
            }
            else if(_a1>=0 && array1[_a1]>array2[_a2])
            {
                newArray[index]=array1[_a1--];
            }
            else
            {
                newArray[index]=array2[_a2--];
            }
        }
        array2=newArray;*/
        for(int i=0;i<array2.length;i++)
        {
            newArray[i]=array2[i];
        }
        array2=newArray;
        int index=array2.length-1;
        while(_a1>=0 && _a2>=0)
        {
            if(array1[_a1]>array2[_a2])
            {
                array2[index--]=array1[_a1--];
            }
            else
            {
                array2[index--]=array2[_a2--];
            }
        }
        while(_a1>=0)
        {
            array2[index--]=array1[_a1--];
        }
        while(_a2>=0)
        {
            array2[index--]=array2[_a2--];
        }
        for (int k : array2) {
            System.out.print(k+" ");
        }
    }
    //#endregion

    //#region 20. Unique Triplets in the array which gives the sum of zero
    public static void TripletsisEqualToZero(int[] array)
    {
        boolean check=false;
        for(int i=0;i<array.length-2;i++)
        {
            if(array[i]<=0)
            {
                int _left=i+1;
                int _right=array.length-1;
                while(_left<_right)
                {
                    if((array[i]+array[_left]+array[_right])<0)
                    {
                        _left++;
                    }
                    else if((array[i]+array[_left]+array[_right])>0)
                    {
                        _right--;
                    }
                    else 
                    {
                        check=true;
                        System.out.println("("+array[i]+","+array[_left++]+","+array[_right++]+") is Equal to 0");
                    }
                }
            }
            
        }
        System.out.print(!check?"No Triplet is Sum 0":"");
    }
    //#endregion
}
