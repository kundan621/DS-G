package CrackingTheCodingInterview.Arrays;

public class oneAway {
    public static void main(String[] args) {
        //valid is insert,delete,replace
        String str1 = "pales";
        String str2 = "pale";
        boolean result = stateValidity(str1, str2);
        System.out.println(result);
    }

    private static boolean stateValidity(String str1, String str2) {
        if (str1.length() == str2.length()) {
            return checkReplace(str1, str2);
        } else {
            return checkDeleteOrInsert(str1, str2);
        }
    }

    private static boolean checkReplace(String str1, String str2) {
        int diff = 0;
        for (int i = 0; i < str1.length() && i < str2.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                diff++;
            }
        }
        if (diff > 1)
            return false;
        else
            return true;

    }

    private static boolean checkDeleteOrInsert(String str1, String str2) {
        int s1 = 0;
        int s2 = 0; //bcd abcd,abcd bcd
        int diff = 0;
        while (s1 < str1.length() && s2 < str2.length()) {
            if (str1.charAt(s1) == str2.charAt(s2)) {
                s1++;
                s2++;
            } else if (str1.length() > str2.length() && str1.charAt(s1) != str2.charAt(s2)) {
                s1++;
                diff++;
            } else if (str1.length() < str2.length() && str1.charAt(s1) != str2.charAt(s2)) {
                s2++;
                diff++;
            }
        }
        if (diff > 1 || Math.abs(str2.length() - str1.length()) > 1)
            return false;
        else
            return true;

    }


}
