package String;

import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        SubStringPalindrome(str);
    }
    public static void SubStringPalindrome(String str)
    {
        for (int i = 0; i < str.length() ; i++) {
            for (int j = i+1; j <= str.length() ; j++) {
                String temp = str.substring(i,j);
                if(isPalindrome(temp))
                {
                    System.out.println(temp);
                }
            }
        }
    }
    public static boolean isPalindrome(String str)
    {
        int start = 0;
        int end = str.length()-1;
        while (start != end)
        {
            if(str.charAt(start) != str.charAt(end))
            {
                return false;
            }
            else {
                start++;
                end--;
            }
        }
        return true;
    }



}
