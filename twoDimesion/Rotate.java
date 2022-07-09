package twoDimesion;

public class Rotate {
    public static void main (String [] args)
    {
        int [][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        transpose(arr);

        ReverCol(arr);
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[0].length ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void ReverCol(int[][] arr) {
        for (int i = 0; i < arr.length ; i++) {
            int li = 0;
            int ri = arr[0].length-1;
            while (li <= ri){
                int temp = arr[i][li];
                arr[i][li] = arr[i][ri];
                arr[i][ri] = temp;
                li++;
                ri--;
            }
        }
    }

    public static void transpose(int[][] arr) {
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < i ; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i]=temp;
            }
        }
    }
}
