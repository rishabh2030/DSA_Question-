package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Positive_Cumulative_Sum {
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t!=0)
        {
            int n = sc.nextInt();
            int [] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            //CumlativeSum(arr);
            agian(arr);
            t--;
        }

    }
    public static void agian (int []arr)
    {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(arr[0]);
        for (int i = 1; i < arr.length ; i++) {
            arr[i] = arr[i] + arr[i-1];
            list.add(arr[i]);
        }
        for (int i = 0; i < list.size() ; i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }

    public static void CumlativeSum(int [] arr)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int i = 0;
        int j = 1;
        int sum = 0;
        while (i!= arr.length)
        {
            for (int k = i; k < j; k++) {
                sum+=arr[k];
                list.add(sum);
            }
            if(j== arr.length)
            {
                j=1;
            }
            i++;
            j++;
        }
        for (int k = 0; k < list.size(); k++) {
            System.out.println(list.get(k));
        }

    }


}
