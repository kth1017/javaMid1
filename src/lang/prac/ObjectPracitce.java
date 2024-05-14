package lang.prac;

public class ObjectPracitce {
    public static void main(String[] args) {
        // 1. equals
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        System.out.println("str1.equals(str2) = " + str1.equals(str2));

        // 2. hashCode
        System.out.println("str1.hashCode() = " + str1.hashCode());
        System.out.println("str2.hashCode() = " + str2.hashCode());

        // 3. toString
        System.out.println("str1.toString() = " + str1.toString());
        System.out.println("str2.toString() = " + str2.toString());

        // 4. getClass
        System.out.println("str1.getClass() = " + str1.getClass());
    }
}
