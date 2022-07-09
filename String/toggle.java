package String;

import java.util.Scanner;

public class toggle {
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        oppsite(str);
    }
    public static String oppsite(String str)
    {
        String ans = "";
        for (int i = 0; i <= str.length(); i++) {

            if(str.charAt(i) == Character.toUpperCase(str.charAt(i)))
            {
                ans+= Character.toLowerCase(str.charAt(i));
            }
            else {
                ans += Character.toUpperCase(str.charAt(i));
            }
        }
        return ans;
    }


}
