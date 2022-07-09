package Arrays;

public class binarySearch {
    public static void main (String [] args)
    {
        int [] arr = {1,2,3,4,5,6};
        int key = 4;
        System.out.println(Search(arr,key));
    }
    public static int Search(int []arr,int key)
    {
        int start = 0;
        int end = arr.length-1;
        while (start<=end)
        {
            int mid = (start+end)/2;
            if(arr[mid]==key)
            {
                return mid;
            }
            if(arr[mid]>key)
            {
                end = mid -1;
            }
            else {

                start = mid +1;
            }
        }
        return -1;
    }

}
