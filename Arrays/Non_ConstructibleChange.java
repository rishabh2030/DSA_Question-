package Arrays;

import java.util.Arrays;

public class Non_ConstructibleChange {
    public static void main(String[] args) {
        int [] coins = {5,7,1,1,2,3,2,3,22};
        System.out.println(function(coins));
    }
    public static int function(int [] coins)
    {
        Arrays.sort(coins);
        int currentChangeCreated = 0;
        for (int i = 0; i < coins.length ; i++) {
            if(coins[i] > currentChangeCreated + 1)
            {
                return currentChangeCreated += coins[i];
            }
            currentChangeCreated += coins[i];
        }
        return currentChangeCreated +1;
    }
}
