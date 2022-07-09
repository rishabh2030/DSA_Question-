package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class demo {
    public static void main (String [] args)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
//            int n = ;
            list.add(sc.nextInt());
        }
        for (int i = 0; i < 5 ; i++) {
            System.out.println(list.get(i));
        }

    }

}
