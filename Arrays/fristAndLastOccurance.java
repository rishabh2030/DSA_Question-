package Arrays;

import java.util.Scanner;

public class fristAndLastOccurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
       int first = start(arr,key);
       int last = end(arr,key);
        System.out.println(first);
        System.out.println(last);
    }
    public static int start(int []arr,int key)
    {
        int start = 0;
        int end = arr.length-1;
        int first = 0;
        while (start <= end)
        {
            int mid = (start+end)/2;
            if(key > arr[mid])
            {
                start = mid + 1;
            }
            else if (key < arr[mid])
            {
                end = mid - 1;
            }
            else{
                first = mid;
                end = mid - 1;
            }
        }
        return first;
    }
    public static int end (int []arr,int key)
    {
        int start = 0;
        int end = arr.length-1;
        int last = 0;
        while (start <= end)
        {
            int mid = (start+end)/2;
            if(arr[mid]<key)
            {
                start = mid + 1;
            }
            if(arr[mid]>key)
            {
                end = mid - 1;
            }
            else{
                last = mid;
                start = mid + 1;
            }

        }
        return last;
    }


}

