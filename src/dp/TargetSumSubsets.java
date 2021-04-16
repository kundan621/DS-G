package dp;

import java.util.Scanner;

public class TargetSumSubsets {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int arr[] = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int tar = scanner.nextInt();
        System.out.println(doesSumExists(arr, tar));
    }

    private static boolean doesSumExists(int[] arr, int tar) {
        boolean dp[][] = new boolean[arr.length + 1][tar + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (i == 0 && j == 0) {
                    dp[i][j] = true;
                } else if (i == 0 && j > 0) {
                    dp[i][j] = false;
                } else if (j == 0) {
                    dp[i][j] = true;
                } else {
                    if (dp[i - 1][j]) {
                        dp[i][j] = true;
                    } else {
                        int val = arr[i - 1];
                        if (j >= val) {
                            if (dp[i - 1][j - val]) {
                                dp[i][j] = true;
                            }
                        }
                    }
                }
            }

        }
        return dp[arr.length][tar];
    }
}
