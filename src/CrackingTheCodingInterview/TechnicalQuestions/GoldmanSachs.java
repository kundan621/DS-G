package CrackingTheCodingInterview.TechnicalQuestions;

import java.util.ArrayList;

public class GoldmanSachs {
    static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        int arr[][] = {{1, 0, 0},
                {0, 0, 7},
                {0, 0, 3},
                {4, 5, 6}};
        int rowSize = arr.length;
        int columnSize = arr[0].length;
        findMaxStoneInPath(arr, rowSize - 1, 0, 0, columnSize - 1, 0);
        int max = Integer.MIN_VALUE;
        for (int num : list) {
            if (num > max)
                max = num;
        }
        System.out.println(max);
    }


    private static void findMaxStoneInPath(int[][] arr, int currentRow, int currentColumn, int destRow, int destCol, int sum) {
        if (currentColumn == destCol && currentRow == destRow) {
            list.add(sum);
        }
        if (currentRow < destRow || currentColumn > destCol) {
            return;
        }
        findMaxStoneInPath(arr, currentRow - 1, currentColumn, destRow, destCol, sum + arr[currentRow][currentColumn]);
        findMaxStoneInPath(arr, currentRow, currentColumn + 1, destRow, destCol, sum + arr[currentRow][currentColumn]);

    }
}
