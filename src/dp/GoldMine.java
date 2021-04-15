package dp;

import java.util.Scanner;

public class GoldMine {
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
        System.out.println(findMaxGold(arr));
    }

    private static int findMaxGold(int arr[][]) {
        int dp[][] = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            dp[i][0] = arr[i][0];

        }
        for (int j = 1; j < arr[0].length; j++) {
            for (int i = 0; i < arr.length; i++) {
                if (i - 1 >= 0 && i + 1 < arr.length)
                    dp[i][j] = arr[i][j] + Math.max(dp[i][j - 1], Math.max(dp[i - 1][j - 1], dp[i + 1][j - 1]));
                else if (i - 1 < 0 && i + 1 >= arr.length)
                    dp[i][j] = arr[i][j] + dp[i][j - 1];
                else if (i - 1 < 0)
                    dp[i][j] = arr[i][j] + Math.max(dp[i][j - 1], dp[i + 1][j - 1]);
                else if (i + 1 >= arr.length)
                    dp[i][j] = arr[i][j] + Math.max(dp[i][j - 1], dp[i - 1][j - 1]);
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (dp[i][arr[0].length - 1] > max)
                max = dp[i][arr[0].length - 1];
        }
        return max;
    }


}