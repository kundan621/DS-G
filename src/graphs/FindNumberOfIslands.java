package graphs;

import java.util.Scanner;

//0 is land and 1 is water then we have to find the islands(land surrounded by water)
public class FindNumberOfIslands {
    public static void main(String[] args) {
        // 0 0 1 1 0
        // 1 0 1 1 0
        // 0 1 0 1 0
        // 0 1 0 1 0

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = scanner.nextInt();
        System.out.println("Enter number of columns");
        int cols = scanner.nextInt();
        int[][] arr = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        // System.out.println(arr.length); //arr.length always says the rows length
        //System.out.println(arr[0].length); //gives the column size
        boolean[][] visited = new boolean[arr.length][arr[0].length];
        int count = 0;
        //idea here is that traverse all nodes which are land(island is land surrounded by water) and then for each find all the lands connected in all directions and maintain a visited array.
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0 && !visited[i][j]) {
                    drawTreeForComponent(arr, i, j, visited);
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    private static void drawTreeForComponent(int[][] arr, int i, int j, boolean[][] visited) {
        //if out of board || if water || if visited then return
        if (i < 0 || j < 0 || i >= arr.length || j >= arr[0].length || arr[i][j] == 1 || visited[i][j]) {
            return;
        }
        visited[i][j] = true;
        drawTreeForComponent(arr, i - 1, j, visited);
        drawTreeForComponent(arr, i + 1, j, visited);
        drawTreeForComponent(arr, i, j - 1, visited);
        drawTreeForComponent(arr, i, j + 1, visited);
    }
}
