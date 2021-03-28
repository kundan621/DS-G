package Recursion;

import java.util.ArrayList;
import java.util.List;

public class StairCase {
    public static void main(String[] args) {
        //can walk only 1 or 2 or 3 steps
        List<String> paths = findPaths(10);
        paths.forEach(System.out::println);
    }

    private static List<String> findPaths(int height) {
        if (height == 0) {
            List<String> finalPaths = new ArrayList<>();
            finalPaths.add("");
            return finalPaths;
        } else if (height < 0) {
            List<String> finalPaths = new ArrayList<>();
            return finalPaths;
        }

        List<String> paths1 = findPaths(height - 1);
        List<String> paths2 = findPaths(height - 2);
        List<String> paths3 = findPaths(height - 3);
        List<String> finalPaths = new ArrayList<>();

        paths1.forEach(str -> finalPaths.add("1" + str));
        paths2.forEach(str -> finalPaths.add("2" + str));
        paths3.forEach(str -> finalPaths.add("3" + str));

        return finalPaths;
    }
}
