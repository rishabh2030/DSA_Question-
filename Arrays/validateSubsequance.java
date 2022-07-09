package Arrays;

public class validateSubsequance {
    public static void main(String[] args) {
        int []arr = {5,1,22,24,6,-1,8,10};
        int []arr1 = {1,6,8,10};
        System.out.println(isSubseqance(arr,arr1));
    }
    public static boolean isSubseqance(int s1[],int s2[])
    {
        int arrIdx = 0;
        int seqIdx = 0;

        while (arrIdx < s1.length && seqIdx < s2.length)
        {
            if(s1[arrIdx] == s2[seqIdx])
            {
                seqIdx++;
            }
            arrIdx++;
        }
        return seqIdx == s2.length;
    }

}
