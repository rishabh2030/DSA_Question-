package Arrays;

import java.util.Arrays;
import java.util.SortedMap;

public class sortedArray {
    public static void main (String []args)
    {
        int []arr = {-7,-3,2,3,11};
//        System.out.println(Arrays.toString(squareAndSortedBruteForce(arr)));
        System.out.println(Arrays.toString(squareAndSortedOptimal(arr)));
    }

    public static int [] squareAndSortedBruteForce(int []arr)
    {
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = arr[i] * arr[i];
        }
        Arrays.sort(arr);
        return arr;
    }
    public static int [] squareAndSortedOptimal(int arr[])
    {
        int small = 0;
        int large = arr.length-1;
        int [] ans = new int[arr.length];
        int count = arr.length-1;
        while (small != large)
        {
            if(square(arr[small]) > square(arr[large]))
            {
                ans[count] = square(arr[small]);
                small++;
                count--;
            }
            else{
                ans[count] = square(arr[large]);
                large--;
                count--;
            }
        }
        ans[count] = square(small);
        return ans;
    }
    public static int square (int N)
    {
        return N*N;
    }

}
