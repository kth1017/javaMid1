package lang.string;

import java.util.Arrays;

public class CharArrayMain {

    public static void main(String[] args) {
        int[] intArr = {1, 2, 3};
        System.out.println(intArr);
        System.out.println(Arrays.toString(intArr));
        System.out.println(intArr.toString());

        // char[] toString 다름
        char[] charArr = new char[]{'h', 'e', 'l', 'l', 'o'};
        System.out.println(charArr);
        System.out.println(charArr.toString());
        System.out.println(Arrays.toString(charArr));

        String str = "hello";
        System.out.println("str = " + str);
    }
}
