package lang.string.equals;

public class StringEqualsMain1 {

    public static void main(String[] args) {
        //일반적인 객체처럼 취급
        String str1 = new String("hello"); //x001
        String str2 = new String("hello"); //x002
        System.out.println("new String() == 비교: " + (str1 == str2));
        System.out.println("new String() equals 비교:" + (str1.equals(str2)));

        //스트링 풀 사용
        String str3 = "hello"; //x003
        String str4 = "hello"; //x004
        System.out.println("리터럴 == 비교: " + (str3 == str4));
        System.out.println("리터럴 equals 비교: " + (str3.equals(str4)));
    }
}
