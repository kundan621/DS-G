package CrackingTheCodingInterview.TechnicalQuestions;

public class RabinKarp {
    public static void main(String[] args) {
        String text = "My Name is Kundan. kundan is a good guy";
        String pattern = "kundan";
        match(text, pattern);
    }

    private static void match(String text, String pattern) {
        for (int i = 0; i < text.length() - pattern.length(); i++) {
            if (text.substring(i, i + pattern.length()).hashCode() == pattern.hashCode()) {
                System.out.println("Pattern is found at index" + i);
            }
        }
    }
}
