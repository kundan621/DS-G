package CrackingTheCodingInterview.Arrays;

public class ReplaceString {
    public static void main(String[] args) {
        // notInPlacceApproach();
        String test = "My  name is kundan        ";

        inPlaceApproach(test.toCharArray(), 18);
    }

    private static void inPlaceApproach(char[] test, int trueValue) {
        int spaceCount = 0;
        for (int i = 0; i < trueValue; i++) {
            if (test[i] == ' ') {
                spaceCount++;
            }
        }

        int modiIndex = trueValue - 1 + spaceCount * 2;
        for (int i = trueValue - 1; i > 0; i--) {
            if (test[i] == ' ') {
                test[modiIndex--] = '0';
                test[modiIndex--] = '2';
                test[modiIndex--] = '%';

            } else {
                test[modiIndex--] = test[i];
            }
        }
        for (char c : test)
            System.out.print(c);

    }

    private static void notInPlacceApproach() {
        String input = "my name is Kundan";
        StringBuilder output = new StringBuilder("");
        for (char ch : input.toCharArray()) {
            if (ch == ' ') {
                output.append("%20");
            } else {
                output.append(ch);
            }
        }
        System.out.println(output);
    }
}
