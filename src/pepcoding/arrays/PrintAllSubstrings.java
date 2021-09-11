package pepcoding.arrays;

public class PrintAllSubstrings {
    public static void main(String[] args) {
        String value = "abcd";
        for (int i = 0; i < value.length(); i++) {
            for (int j = i; j <= value.length(); j++) {
                System.out.println(value.substring(i, j));
            }
        }
    }
}
