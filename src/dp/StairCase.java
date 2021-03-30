package dp;

import java.util.Scanner;

public class StairCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalFloor = scanner.nextInt();
        int[] qb = new int[totalFloor + 1];
        int pathsUsingTabulation = countPathsTabulation(totalFloor);
        System.out.println(pathsUsingTabulation);
        int paths = countPaths(totalFloor, qb);
        System.out.println(paths);


    }

    //uses dp iteration(preferred)  //  bottom-up
    private static int countPathsTabulation(int totalFloor) {
        int arr[] = new int[totalFloor + 1];
        arr[0] = 1;
        for (int i = 1; i <= totalFloor; i++) {
            if (i == 1) {
                arr[i] = arr[i - 1];
            } else if (i == 2) {
                arr[i] = arr[i - 1] + arr[i - 2];
            } else {
                arr[i] = arr[i - 1] + arr[i - 2] + arr[i - 3];
            }
        }
        return arr[totalFloor];
    }

    //DP Memoization (usually recursion happens in memoization)
    private static int countPaths(int totalFloor, int[] qb) {
        if (totalFloor == 0) {
            return 1;
        } else if (totalFloor < 0) {
            return 0;
        }
        if (qb[totalFloor] > 0)
            return qb[totalFloor];
        int n1 = countPaths(totalFloor - 1, qb);
        int n2 = countPaths(totalFloor - 2, qb);
        int n3 = countPaths(totalFloor - 3, qb);
        qb[totalFloor] = n3 + n2 + n1;
        return n1 + n2 + n3;
    }
}
