package twoDimesion;

import java.util.Scanner;

public class twoDeDemo {
    public static void main (String []args)
    {
        Scanner sc = new Scanner(System.in);
        // Decleartion of Array
//        int [][] arr = {
//                {1,2,4},
//                {3,4,5},
//                {6,7,8}
//        };
        // input an 2d Array
        int [][]arr = new int[3][3];
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[0].length ; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // output an array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

}
