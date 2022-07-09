package Arrays;

import java.util.Arrays;

public class RotateArray {
    public static void main (String [] args)
    {
        int [] arr = {1,2,3,4,5,6,7,8};
        int k = -3;
        roate(arr,k);
        System.out.println(Arrays.toString(arr));
    }
    public static void roate(int []arr,int k)
    {
        if(k>arr.length)
        {
            k = k % arr.length;
        }
        if(k<0){
            k += arr.length;
        }
        // now reverse three time;
        reverse(arr,0, arr.length-k-1);
        reverse(arr, arr.length-k, arr.length-1 );
        reverse(arr,0, arr.length-1);

    }
    public static void reverse(int arr[],int start,int end)
    {
        while (start<=end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }



}
