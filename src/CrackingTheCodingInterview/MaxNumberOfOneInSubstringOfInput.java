package CrackingTheCodingInterview;

import java.util.ArrayList;
import java.util.Collections;

public class MaxNumberOfOneInSubstringOfInput {
    public static void main(String[] args) {
        String input = "00000000001";
        int size = 5;
        ArrayList<Integer> list = new ArrayList<>();
        String current = null;
        while (input.length() >= size) {
            current = input.substring(0, size);
            int count = 0;
            for (int i = 0; i < current.length(); i++) {
                if (current.charAt(i) == '1') {
                    count++;
                }
            }
            list.add(count);
            input = input.substring(size);
        }
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '1') {
                count++;
            }
        }
        list.add(count);
        System.out.println(Collections.max(list));
    }
}
