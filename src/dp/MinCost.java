package dp;

import java.util.Scanner;

public class MinCost {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        int arr[][] = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println(findMinimumCost(arr));
    }

    private static int findMinimumCost(int arr[][]) {
        int dp[][] = new int[arr.length][arr[0].length];
        dp[0][0] = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (i == 0 && j > 0) {

                    dp[i][j] = dp[i][j - 1] + arr[i][j];
                } else if (j == 0 && i > 0) {
                    dp[i][j] = dp[i - 1][j] + arr[i][j];
                } else {
                    if (i > 0 && j > 0) {
                        if (dp[i][j - 1] < dp[i - 1][j])
                            dp[i][j] = dp[i][j - 1] + arr[i][j];
                        else
                            dp[i][j] = dp[i - 1][j] + arr[i][j];
                    }
                }
            }
        }
        return dp[arr.length - 1][arr[0].length - 1];
    }
}