package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class KeyPair {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        ArrayList<String> output = getKPC(input);
        System.out.println(output);

    }

    static String[] keyMap = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static ArrayList<String> getKPC(String str) {
        if (str.length() == 0) {
            ArrayList<String> list = new ArrayList();
            list.add("");
            return list;
        }
        int first = Character.getNumericValue(str.charAt(0));
        ArrayList<String> list = getKPC(str.substring(1));
        ArrayList<String> finalList = new ArrayList<>();
        String key = keyMap[first];
        for (int i = 0; i < key.length(); i++) {
            for (String item : list) {
                finalList.add(key.charAt(i) + item);
            }
        }
        return finalList;
    }

}