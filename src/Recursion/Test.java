package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        ArrayList<String> output = gss(input);
        System.out.print(output);
    }

    //BC = B_, _C, _ _, BC
    //ABC= AB_, A_C,  A_ _,  ABC  , _B_, _ _ C,  _ _ _,  _BC
    public static ArrayList<String> gss(String str) {
        if (str.length() == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }

        Character element = str.charAt(0);
        ArrayList<String> ss = gss(str.substring(1));
        ArrayList<String> finalList = new ArrayList<>();
        for (String seq : ss) {
            finalList.add("" + seq);
            finalList.add(element + seq);
        }
        return finalList;
    }

}