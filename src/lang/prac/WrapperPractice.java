package lang.prac;

public class WrapperPractice {
    public static void main(String[] args) {
        // 1. valueOf
        Integer i1 = Integer.valueOf(10);
        Integer i2 = Integer.valueOf("10");
        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);

        // 2. parseInt
        int i3 = Integer.parseInt("10");
        System.out.println("i3 = " + i3);

        // 3. toString
        String str = i1.toString();
        System.out.println("str = " + str);

        // 4. compareTo
        System.out.println("i1.compareTo(i2) = " + i1.compareTo(i2));

        // 5. equals
        System.out.println("i1.equals(i2) = " + i1.equals(i2));
    }



}
