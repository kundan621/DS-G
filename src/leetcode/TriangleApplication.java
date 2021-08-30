package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TriangleApplication {
    public static void main(String[] args) {
        Triangle triangle = new Triangle120();
        List<List<Integer>> list = new ArrayList<>();
        list.add(Arrays.asList(2));
        list.add(Arrays.asList(3, 4));
        list.add(Arrays.asList(6, 5, 7));
        list.add(Arrays.asList(4, 1, 8, 3));
        System.out.println(triangle.minimumTotal(list));
    }
}
