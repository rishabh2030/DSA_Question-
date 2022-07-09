package Leetcode;

public class Subsequence {
    public static void main(String[] args) {
        String str = "ahbgdc";
        String sequence = "abc";
        System.out.println(isSubsequence(str,sequence));
    }
    public static boolean isSubsequence(String str,String sequence)
    {
        int strIdx = 0;
        int seqIdx = 0;
        while (strIdx < str.length() && seqIdx < sequence.length())
        {
            if(str.charAt(strIdx) == sequence.charAt(seqIdx))
            {
                seqIdx++;
            }
            strIdx++;
        }
        return seqIdx == sequence.length();
    }
}
