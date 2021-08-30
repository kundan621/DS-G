package leetcode.google;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

public class InsertInterval {
    public static void main(String[] args) {
        int intervals[][] = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int merged[][] = merge(intervals);
        System.out.println(merged[0][0] + " " + merged[0][1]);
        System.out.println(merged[1][0] + " " + merged[1][1]);
        System.out.println(merged[2][0] + " " + merged[2][1]);
    }

    private static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        Stack<int[]> merged = new Stack<>();
        for (int[] interval : intervals) {
            System.out.println(interval[0] + " " + interval[2]);
            // if the list of merged intervals is empty or if the current
            // interval does not overlap with the previous, simply append it.
            if (merged.isEmpty() || merged.peek()[1] < interval[0]) {
                merged.push(interval);
            }
            // otherwise, there is overlap, so we merge the current and previous
            // intervals.
            else {
                merged.peek()[1] = Math.max(merged.peek()[1], interval[1]);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
}
