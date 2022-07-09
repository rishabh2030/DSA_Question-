package Arrays;

public class SumOfTwoArray {
    public static void main (String [] args)
    {
        int [] arr1 = {1,2,3};
        int [] arr2 = {4,5,6,7};
        sum(arr1,arr2);
//        System.out.println(9%10);
    }
    public static void sum(int []arr1,int []arr2)
    {
        int max = Integer.max(arr1.length, arr2.length );
        int [] ans = new int[max];
        int i = arr1.length-1;
        int j = arr2.length-1;
        int k = ans.length - 1;
        int carry = 0;
        while (i >= 0 || j >= 0)
        {
            int digit = carry;
            if(i>=0)
            {
                digit += arr1[i];
            }
            if(j>=0)
            {
                digit += arr2[j];
            }

            carry = digit / 10;
            digit = digit % 10;

            ans[k] = digit;
            i--;
            j--;
            k--;
        }
        if(carry!=0)
        {
            ans[k] = carry;
        }
        for (int val:ans
             ) {
            System.out.print(val);
        }
    }

}
