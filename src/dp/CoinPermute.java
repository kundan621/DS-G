package dp;

import java.util.Scanner;

public class CoinPermute {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int numberOfCoins = scanner.nextInt();
        int[] arr = new int[numberOfCoins];
        for (int i = 0; i < numberOfCoins; i++) {
            arr[i] = scanner.nextInt();
        }
        int target = scanner.nextInt();
        System.out.println(findNumberOfCombinationsToReachTargetSum(arr, target));
    }

    private static int findNumberOfCombinationsToReachTargetSum(int[] arr, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for (int i = 1; i <= target; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] <= i) {
                    dp[i] = dp[i] + dp[i - arr[j]];
                }
            }
        }
        return dp[target];
    }
}

