package Arrays;

public class spanOfArray {
    public static void main (String [] args)
    {
        int arr[] = {15,30,40,4,11,9};
        System.out.println(diffBtwMaxAndMin(arr));
    }
    public static int diffBtwMaxAndMin(int [] arr)
    {
        int max_value = maxInArray(arr);
        int min_value = minInArray(arr);
        return max_value - min_value;
    }
    public static int maxInArray(int []arr)
    {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }

        return max;
    }
    public static int minInArray(int []arr)
    {
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {

            if(arr[i]<min)
            {
                min = arr[i];
            }
        }
        return min;
    }
}
