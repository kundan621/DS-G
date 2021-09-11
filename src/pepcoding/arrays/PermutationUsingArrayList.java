package pepcoding.arrays;

import java.util.ArrayList;
import java.util.List;

public class PermutationUsingArrayList {
    public static void main(String[] args) {
        String input = "abc";
        List<String> output = findPermutations(input);
        output.forEach(System.out::println);
        Thread thread = new Thread(() -> System.out.println("ok"));
        thread.run();

    }


    private static List<String> findPermutations(String input) {
        if (input.length() == 0) {
            List<String> list = new ArrayList<String>();
            list.add("");
            return list;
        }
        char ch = input.charAt(0);
        List<String> list = findPermutations(input.substring(1));
        List<String> output = new ArrayList<>();
        list.forEach(x -> {
            for (int i = 0; i <= x.length(); i++) {
                StringBuilder builder = new StringBuilder(x);
                builder.insert(i, ch);
                output.add(builder.toString());

            }
        });
        return output;
    }


}
