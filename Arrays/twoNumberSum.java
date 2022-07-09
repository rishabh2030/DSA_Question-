package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class twoNumberSum {
    public static void main(String[] args) {
        int [] arr = {2,7,11,15};
        int target = 18;
        // brute force wwith T.C of O(n^2)
//        sumOfTargetBrute(arr,target);
        // better soltion with T.C o(nlogn)
//        sumOfTarget(arr,target);
        // optimalSoultion
        sumOfTargetOptimal(arr,target);

    }
    public static void sumOfTargetBrute(int []arr,int target)
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j] == target)
                {
                    System.out.println(i+" "+j);
                }
            }
        }
    }

    public static void sumOfTarget(int [] arr,int target)
    {
        Arrays.sort(arr);
        int Left = 0;
        int Right = arr.length-1;
        while (Left != Right)
        {
            if(arr[Left]+arr[Right] == target)
            {
                System.out.print(Left+" "+Right);
            }
            if(arr[Left]+arr[Right] > target)
            {
                Right--;
            }
            else{
                Left++;
            }
        }
    }
    public static void sumOfTargetOptimal(int []arr,int target)
    {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i = 0; i < arr.length ; i++) {
            int potenial_ans = target - arr[i];
            if(!map.containsKey(potenial_ans)){
                map.put(arr[i],i);
            }
            if(map.containsKey(potenial_ans)){
                System.out.println(map.get(potenial_ans)+" "+i );

            }
        }
    }
}
