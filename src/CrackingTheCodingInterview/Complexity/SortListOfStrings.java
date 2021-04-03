package CrackingTheCodingInterview.Complexity;

import java.util.Arrays;

public class SortListOfStrings {
    public static void main(String[] args) {
        String[] list = {"kundan", "piyush", "harish", "mritunjay", "prashant", "Abhi"};

        for (int i = 0; i < list.length; i++) {
            char tempArray[] = list[i].toCharArray();
            Arrays.sort(tempArray);
            list[i] = new String(tempArray);
        }
        Arrays.sort(list);
        for (String name : list) {
            System.out.println(name);
        }
    }
}
