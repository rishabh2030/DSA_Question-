package twoDimesion;

import java.util.Scanner;

public class spiralPrint {
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int [][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        print(arr);
    }
    public static void print(int [][]arr)
    {
        int row_min = 0;
        int col_min = 0;
        int row_max = arr.length-1;
        int col_max = arr[0].length-1;

        int total_element = 0;
        int count = 0;
//        for (int i = row_min; i <= row_max ; i++) {
//            System.out.print(arr[i][col_min]+" ");
//        }
//        col_min++;
//        for (int i = col_min; i <= col_max ; i++) {
//            System.out.print(arr[row_max][i]+" ");
//        }
        while (count<total_element)
        {
            // left
            for (int i = row_min; i <= row_max ; i++) {
                System.out.println(arr[i][col_min]);
                count++;
            }
            col_min++;
            // bottom
            for (int i = col_min; i <= col_max ; i++) {
                System.out.println(arr[row_max][i]);
                count++;
            }
            row_max--;
            // right
            for (int i = row_max; i >= row_min ; i--) {
                System.out.println(arr[i][col_max]);
                count++;
            }
            col_max--;
            // top
            for (int i = col_max; i >= col_min ; i++) {
                System.out.println(arr[row_min][i]);
                count++;
            }
            row_min++;
        }
    }

}
