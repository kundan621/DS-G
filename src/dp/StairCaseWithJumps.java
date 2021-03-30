package dp;

import java.util.Scanner;

public class StairCaseWithJumps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int paths = findPaths(n, arr);
        System.out.println(paths);

    }

    private static int findPaths(int n, int[] arr) {
        int[] dp = new int[n + 1];
        dp[n] = 1;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = arr[i]; j >= 0 && i + j < dp.length; j--) {
                dp[i] = dp[i] + dp[i + j];
            }
        }
        return dp[0];
    }
}
