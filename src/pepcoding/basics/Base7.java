package pepcoding.basics;

import java.util.Arrays;

public class Base7 {
    public static void main(String[] args) {
        int num = -7;
        StringBuilder output = new StringBuilder("");
        int original = num;
        num = Math.abs(num);

        while (num != 0) {
            output.append(num % 7);
            num = num / 7;
        }
        if (original < 0) {
            output.append("-");
            System.out.println(output.toString());
        }
        int array[] = {1, 2, 3, 4, 5, 6};
        Arrays.stream(array).min().getAsInt();
        System.out.println(output.reverse().toString());
        Integer numb = new Integer(5); //Autoboxing
        Integer number = numb;

        number = 9;
        System.out.println(numb);


    }
}
