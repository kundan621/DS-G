package Recursion;

import java.util.Scanner;

public class FloodFill {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        floodFill(arr);
    }

    public static void floodFill(int[][] maze) {
        System.out.println(maze.length);
        System.out.println(maze[1].length);
        int[][] visited = new int[maze.length][maze[0].length];
        printPath(maze, 0, 0, "", visited);

    }

    //tldr
    private static void printPath(int[][] maze, int row, int column, String path, int[][] visited) {
        if (row < 0 || column < 0 || row > maze.length - 1 || column > maze[0].length - 1 || maze[row][column] == 1 || visited[row][column] == 1) {
            return;
        }

        if (row == maze.length - 1 && column == maze[0].length - 1) {
            System.out.println(path);
            return;
        }
        visited[row][column] = 1;
        printPath(maze, row - 1, column, path + "t", visited);//top
        printPath(maze, row, column - 1, path + "l", visited);//left
        printPath(maze, row + 1, column, path + "d", visited);//down
        printPath(maze, row, column + 1, path + "r", visited);//right
        visited[row][column] = 0;

    }

}
