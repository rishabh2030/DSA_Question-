package Arrays;

import java.util.Scanner;

public class ceilAndFloor {
    public static void main (String []args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        ceilAndFloor_value_of_Array(arr,key);
    }
    public static void ceilAndFloor_value_of_Array(int []arr,int key)
    {
        int left = 0;
        int right = arr.length-1;
        int ceil=0;
        int floor=0;
        while (left<=right)
        {
            int mid = (left+right)/2;
            if(key > arr[mid])
            {
                left = mid + 1;
                ceil = arr[mid];
            }
            else if(key < arr[mid])
            {
                right = mid - 1;
                floor = arr[mid];
            }
            else {
                floor = arr[mid];
                ceil = arr[mid];
                break;
            }
        }
        System.out.println(floor);
        System.out.println(ceil);
    }
}
