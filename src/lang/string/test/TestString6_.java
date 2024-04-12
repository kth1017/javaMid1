package lang.string.test;

public class TestString6_ {
    // indexof(1)만 사용한 코드
    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";


        int count = 0;
        String temp = str;
        while (temp.contains(key)) {
            temp = temp.substring(str.indexOf(key) + key.length());
            count++;
        }



        System.out.println(count);


    }
}
