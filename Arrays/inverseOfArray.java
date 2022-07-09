package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class inverseOfArray {
    public static void main (String []args)
    {
        int [] arr = {4, 0, 2, 3, 1};
        inverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void inverse(int []arr)
    {
        int [] inv = new int[arr.length];
        for(int i=0;i< arr.length;i++)
        {
            int val = arr[i];
            inv[val] = i;
        }
    }
}
