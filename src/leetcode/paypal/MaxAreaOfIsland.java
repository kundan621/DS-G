package leetcode.paypal;

public class MaxAreaOfIsland {
    static int count = 0;

    public static void main(String[] args) {
        int grid[][] = {{0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0}, {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0}, {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}};
        int maxCount = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    count = 0;
                    getCount(i, j, grid);
                    maxCount = Math.max(maxCount, count);
                }

            }
        }
        System.out.println(maxCount);

    }

    private static void getCount(int row, int column, int grid[][]) {
        if (row < 0 || column < 0 || row > grid.length - 1 || column > grid[0].length - 1 || grid[row][column] == 0)
            return;

        count++;
        grid[row][column] = 0;
        getCount(row - 1, column, grid);
        getCount(row, column + 1, grid);
        getCount(row + 1, column, grid);
        getCount(row, column - 1, grid);

    }
}