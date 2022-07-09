package twoDimesion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class matrixMultiplation {
    public static void main (String [] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int row1 = sc.nextInt();
        int colum1 = sc.nextInt();

        int [][] arr = new int[row1][colum1];

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[0].length ; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int row2 = sc.nextInt();
        int colum2 = sc.nextInt();

        int [][] arr2 = new int[row1][colum1];

        for (int i = 0; i < arr2.length ; i++) {
            for (int j = 0; j < arr2[0].length ; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        multiplation(arr,arr2);

    }
    public static void multiplation(int [][]arr1,int [][]arr2)
    {
        int row1 = arr1.length;
        int colum1 = arr1[0].length;

        int row2 = arr2.length;
        int colum2 = arr2[0].length;

        System.out.println(row1+" "+colum2);
    }

}
