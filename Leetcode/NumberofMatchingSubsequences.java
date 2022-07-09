package Leetcode;

public class NumberofMatchingSubsequences {
    public static void main(String[] args) {
        String seqance = "abcde";
        String [] word = {"a","bb","acd","ace"};
        System.out.println(countOfSequences(seqance,word));
    }
    public static int countOfSequences(String sequnence,String [] word)
    {
        int count = 0;
        for (int i = 0; i < word.length ; i++) {
            String sq = sequnence;
            String ssq = word[i];
            if(isSubsequence(sq,ssq))
            {
                count++;
            }

        }
        return count;
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
