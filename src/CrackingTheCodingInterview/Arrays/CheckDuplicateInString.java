package CrackingTheCodingInterview.Arrays;

public class CheckDuplicateInString {
    public static void main(String[] args) {
        boolean[] alphabets = new boolean[256];
        String test = "ABBCD";
        for (int i = 0; i < test.length(); i++) {
            if (alphabets[test.charAt(i)]) {
                System.out.println(false);
                break;
            } else {
                alphabets[test.charAt(i)] = true;
            }
        }

    }
}
