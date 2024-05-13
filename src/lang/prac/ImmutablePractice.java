package lang.prac;

public class ImmutablePractice {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println("str = " + str);

        String str2 = str.concat(" World");
        System.out.println("str2 = " + str2);

        System.out.println("str == str2 = " + (str == str2));

        String str3 = str2.replace("World", "Java");
        System.out.println("str3 = " + str3);

        System.out.println("str2 == str3 = " + (str2 == str3));
    }


}
