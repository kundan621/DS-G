package CrackingTheCodingInterview.Arrays;

public class Stringify {
    public static void main(String[] args) {
        String str = "aabcccccaa"; //2a1b4c2a
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count++;
            if (i + 1 == str.length() - 1) {
                if (str.charAt(i) != str.charAt(i + 1)) {
                    System.out.println(str.charAt(i + 1) + "" + 1);
                } else {
                    System.out.println(str.charAt(i) + "" + (count + 1));
                }
            }


            if (i + 1 < str.length() && str.charAt(i) != str.charAt(i + 1)) {
                System.out.println(str.charAt(i) + "" + count);
                count = 0;
            }
        }
    }
}
