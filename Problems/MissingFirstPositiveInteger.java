public class MissingFirstPositiveInteger {
    public static void main(String[] args) {
        
        int[] array={-4,-8,0,-2};
        int[] A = { 2, 3, -7, 6, 8, 1, -10, 15 }; 
       // System.out.println(FirstMissingElement(A));
       System.out.println(FirstMissingElementAlter(A));

    }
    public static int FirstMissingElement(int[] array)

    {
        boolean check=false;
        int n=array.length;
        for(int i=0;i<n;i++)
        {
            if(array[i]==1)
            {
                check=true;
                break;
            }
        }
        if(check==false)
        {
            return 1;
        }
        for(int i=0;i<n;i++)
        {
            if(array[i]<=0 || array[i]>n)
            {
                array[i]=1;
            }
        }
        for(int i=0;i<n;i++)
        {
            array[(array[i]-1)%n]+=n;
        }
        for(int i=0;i<n;i++)
        {
            if(array[i]<=n)
            {
                return i+1;
            }
        }
        return n+1;
    }
    public static int FirstMissingElementAlter(int[] array)
    {
        int[] temp=new int[Integer.MAX_VALUE];
        int length=array.length;
        boolean check=false;
        for(int i=0;i<length;i++)
        {
            if(array[i]==1)
            {
                check=true;
                break;
            }
        }
        if(check==false)
        {
            return 1;
        }
        for(int i=0;i<length;i++)
        {
            if(array[i]>0)
            {
                temp[array[i]]=1;
            }
        }
        for(int i=1;i<temp.length;i++)
        {
            if(temp[i]==0)
            {
                return i+1;
            }
        }
        return temp.length;
    }
}
