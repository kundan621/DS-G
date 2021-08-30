package leetcode;

import java.util.List;

public class Triangle120 implements Triangle {
    @Override
    public int minimumTotal(List<List<Integer>> triangle) {
        return helper(triangle, 0, 0);
    }

    private int helper(List<List<Integer>> triangle, int row, int column) {
        if (row >= triangle.size())
            return 0;
        return Math.min(helper(triangle, row + 1, column), helper(triangle, row + 1, column + 1)) + triangle.get(row).get(column);
    }
}


