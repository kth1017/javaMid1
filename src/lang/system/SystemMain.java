package lang.system;

import java.util.Arrays;

public class SystemMain {
    public static void main(String[] args) {
        //배열 고속 복사
        int[] array1 = {1, 2};
        int[] array2 = new int[2];
        System.arraycopy(array1, 0, array2, 0, array1.length);

        System.out.println(Arrays.toString(array2));

        //프로그램 종료, 비권장
        System.exit(0);
        System.out.println(1);
    }
}
