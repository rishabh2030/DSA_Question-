package twoDimesion;

public class exitPoint {
    public static void main(String[] args) {
        int [][] arr ={
                {0,0,1,0},
                {1,0,0,0},
                {0,0,0,0},
                {1,0,1,0}
        };
//        exit(arr);
        System.out.println(1%4);
    }

    public static void exit(int[][]arr)
    {
        int i = 0;
        int j = 0;
        /*
            east -> 0;
            south -> 1;
            west -> 2;
            North -> 3

         */
        int dir = 0;
        while (true){
            dir = (dir + arr[i][j])%4;

            if(dir == 0)
            {
                j++;
            }
            else if (dir == 1)
            {
                i++; //move to south direction
            }
            else if (dir == 2)
            {
                j--; //move to west direction
            }
            else if (dir == 3) {
                i--; //move to north direction
            }
            if(i > 0)
            {
                i++;
                break;
            } else if (j > 0) {
                j++;
                break;
            }
            else if (i == arr.length)
            {
                i--;
                break;
            } else if (j == arr[0].length) {
                j--;
                break;
            }

        }
        System.out.println(i+" "+j);
    }

}

