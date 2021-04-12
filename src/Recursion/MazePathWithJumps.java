package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class MazePathWithJumps {

        public static void main(String[] args) throws Exception {
            Scanner scanner = new Scanner(System.in);
            int rows = scanner.nextInt();
            int columns = scanner.nextInt();
            ArrayList<String> paths = getMazePaths(1, 1, rows, columns, "");
            System.out.println(paths);

        }

        // sr - source row
        // sc - source column
        // dr - destination row
        // dc - destination column
        public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc, String ans) {

            if (sr == dr && sc == dc) {
                ArrayList<String> list = new ArrayList<>();
                list.add(ans);
                return list;
            } else if (sr > dr || sc > dc) {
                return new ArrayList<String>();
            }

            ArrayList<String> finalList = new ArrayList<>();
            for (int i = 1; i <= dc; i++) {
                ArrayList<String> colMoves = getMazePaths(sr, sc + i, dr, dc, ans + "h" + i);
                for (String colRow : colMoves) {
                    finalList.add(colRow);
                }
            }
            for (int j = 1; j <= dr; j++) {
                ArrayList<String> rowMoves = getMazePaths(sr + j, sc, dr, dc, ans + "v" + j);
                for (String Pathrow : rowMoves) {
                    finalList.add(Pathrow);
                }
            }

            for (int d = 1; d <= dc - sc && d <= dr - sr; d++) {
                ArrayList<String> diagMoves = getMazePaths(sr + d, sc + d, dr, dc, ans + "d" + d);
                for (String diagRow : diagMoves) {
                    finalList.add(diagRow);
                }

            }
            return finalList;

        }
}