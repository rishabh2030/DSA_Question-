package String;

public class stringCompresion {
    public static void main (String [] args)
    {
        String str = "wwwwaaadexxxxxx";
        System.out.println(compression1(str));
        System.out.println(compresion2(str));
    }
    public static String compression1 (String str)
    {
        String ans = "";
        ans+=str.charAt(0);

        for (int i = 1; i < str.length() ; i++) {
                char current = str.charAt(i);
                char prev = str.charAt(i-1);
                if(current != prev)
                {
                    ans += current;
                }
        }

        return ans;
    }
    public static String compresion2(String str)
    {
        String ans = "";
        ans+=str.charAt(0);
        int count = 1;
        for (int i = 1; i < str.length() ; i++) {
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);
            if(curr == prev)
            {
                count++;
            }else{
                ans += count;
                ans+=curr;
                count=1;
            }
        }
        return ans;
    }
}

