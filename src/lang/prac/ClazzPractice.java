package lang.prac;

public class ClazzPractice {
    public static void main(String[] args) {
        Class clazz = String.class;
        System.out.println("clazz = " + clazz);

        String str = "Hello";
        Class clazz2 = str.getClass();
        System.out.println("clazz2 = " + clazz2);

        Class clazz3 = null;
        try {
            clazz3 = Class.forName("java.lang.String");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("clazz3 = " + clazz3);

        System.out.println(clazz == clazz2);
        System.out.println(clazz == clazz3);
    }
}
