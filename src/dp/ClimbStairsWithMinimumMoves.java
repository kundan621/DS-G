package dp;

import java.util.Scanner;

public class ClimbStairsWithMinimumMoves {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxStairs = scanner.nextInt();
        int[] arr = new int[maxStairs];
        for (int i = 0; i < maxStairs; i++) {
            arr[i] = scanner.nextInt();
        }
        int minJumps = findMinJumps(maxStairs, arr);
        System.out.println(minJumps);
    }

    private static int findMinJumps(int n, int[] arr) {
        Integer[] dp = new Integer[n + 1];
        dp[n] = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] > 0) {
                int min = Integer.MAX_VALUE;
                for (int j = 1; j <= arr[i] && i + j < dp.length; i++) {
                    if (dp[i + j] != null && dp[i + j] < min)
                        min = dp[i + j];
                }
                if (min != Integer.MAX_VALUE)
                    dp[i] = min + 1;

            }
        }
        return dp[0];
    }
}
