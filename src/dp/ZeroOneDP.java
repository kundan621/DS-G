package dp;

import java.util.Scanner;

public class ZeroOneDP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfItems = scanner.nextInt();
        int[] value = new int[numberOfItems];
        int[] weight = new int[numberOfItems];
        for (int i = 0; i < numberOfItems; i++) {
            value[i] = scanner.nextInt();
        }

        for (int i = 0; i < numberOfItems; i++) {
            weight[i] = scanner.nextInt();
        }
        int bagSize = scanner.nextInt();
        System.out.println(printMaxValue(value, weight, bagSize));
    }

    private static int printMaxValue(int[] value, int[] weight, int bagSize) {
        int[][] dp = new int[value.length + 1][bagSize + 1];
        for (int i = 1; i <= value.length; i++) {
            for (int j = 0; j <= bagSize; j++) {
                dp[i][j] = dp[i - 1][j];
                if (j >= weight[i - 1]) {
                    int remaining = j - weight[i - 1];
                    if (dp[i - 1][remaining] + value[i - 1] > dp[i - 1][j]) {
                        dp[i][j] = dp[i - 1][remaining] + value[i - 1];
                    } else {
                        dp[i][j] = dp[i - 1][j];
                    }
                } else {
                    dp[i][j] = dp[i - 1][j];  //when i doesn't bat
                }
            }

        }
        return dp[dp.length - 1][dp[0].length - 1];
    }
}