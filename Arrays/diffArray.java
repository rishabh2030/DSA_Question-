package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class diffArray {
    public static void main (String []args)
    {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int []arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int []arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        diffPrint(arr1,arr2);
    }
    public static void diffPrint(int [] arr1,int [] arr2)
    {
        int [] diff = new int[arr2.length];
        int i = arr1.length-1;
        int j = arr2.length-1;
        int k = diff.length-1;

        int carry = 0;

        while (k >= 0)
        {
            int digit=0;
            int arr1value;

            if(i >= 0)
            {
                arr1value = arr1[i];
            }
            else{
                arr1value = 0;
            }

            if(arr2[j]+carry >= arr1value)
            {
                digit = arr2[j]+carry - arr1value;
                carry = 0;
            }
            else if (arr2[j]+carry < arr1value){
                digit =arr2[j]+carry+10-arr1value;
                carry=-1;
            }
            diff[k] = digit;
            i--;
            j--;
            k--;
        }
        int idx = 0;
        while (idx < diff.length)
        {
            if(diff[idx] != 0)
            {
                break;
            }
            else {
                idx++;
            }
        }
        while (idx < diff.length)
        {
            System.out.print(diff[idx]);
            idx++;
        }
    }


}
