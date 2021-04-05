package CrackingTheCodingInterview.Arrays;

public class checkPermutation {
    public static void main(String[] args) {
        String str = "AAA";
        String test = "AA";
        int[] arr = new int[256];
        if (str.length() == test.length()) {
            for (int i = 0; i < str.length(); i++) {
                arr[(int) str.charAt(i)]++;
            }
            for (int i = 0; i < test.length(); i++) {
                arr[(int) str.charAt(i)]--;
                if (arr[str.charAt(i)] < 0) {
                    System.out.println(false);
                    break;
                }
            }
        } else {
            System.out.println(false);
        }
    }
}
