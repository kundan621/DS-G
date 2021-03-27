package Recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {
        tower(3, 'A', 'B', 'C');
    }

    private static void tower(int n, char a, char b, char c) {
        if (n == 0)
            return;

        tower(n - 1, a, c, b);
        System.out.println("1 moved from" + a + "->" + b);
        tower(n - 1, c, b, a);

    }
}
