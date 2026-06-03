
// package DAY5;
import java.util.*;

public class coinChange {

    public static int Coin(int[] coins, int amt) {
        int size = amt + 1;

        int[] dp = new int[size];

        Arrays.fill(dp, size);

        dp[0] = 0;

        for (int coin : coins)
            for (int i = coin; i <= amt; i++)
                dp[i] = Math.min(dp[i], dp[i - coin] + 1);

        if (dp[amt] < size)
            return dp[amt];
        else
            return -1;
    }

    public static void main(String[] args) {
        int[] coins = { 1, 2, 5 };
        int req = 11;

        System.out.println(Coin(coins, req));

    }
}
