package lang.string.equals;

public class StringEqualsMain2 {
    //개발자 1이 코딩
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("메서드 호출 비교1: " + isSame(str1, str2));

        String str3 = "hello";
        String str4 = "hello";
        System.out.println("메서드 호출 비교2: " + isSame(str3, str4));
    }
    // isSame을 개발자 2가 코딩 > 개발자간 string 리터럴과 객체 생성간 방법이 다름
    private static boolean isSame(String x, String y) {
        //return x == y;
        return x.equals(y);
    }
}
