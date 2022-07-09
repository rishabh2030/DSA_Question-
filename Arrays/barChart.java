package Arrays;

public class barChart {
    public static void main (String []args)
    {
        int [] arr = {1,2,3,4,5};
        printstar(arr);
    }
    public static void printstar(int [] arr)
    {
        int max = maxElement(arr);
        for(int floor = max ; floor >= 1 ;floor--)
        {
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i] >= floor)
                {
                    System.out.print("*\t");
                }
                else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
    public static int maxElement(int []arr)
    {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(max < arr[i])
            {
                max = arr[i];
            }
        }
        return max;
    }



}
