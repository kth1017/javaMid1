package lang.prac;

public class WrapperPractice2 {
    public static void main(String[] args) {
        // Wrapper class
        Integer integer = new Integer(10);
        System.out.println("Wrapper class: " + integer);

        // Autoboxing
        Integer integer2 = 10;
        System.out.println("Autoboxing: " + integer2);

        // Unboxing
        int i = integer2;
        System.out.println("Unboxing: " + i);

        // Hashmap
        // Hashmap with wrapper class
        java.util.HashMap<Integer, String> hashMap = new java.util.HashMap<>();
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");
        System.out.println("Hashmap with wrapper class: " + hashMap);

        // Hashmap with autoboxing
        java.util.HashMap<Integer, String> hashMap2 = new java.util.HashMap<>();
        hashMap2.put(1, "One");
        hashMap2.put(2, "Two");
        hashMap2.put(3, "Three");
        System.out.println("Hashmap with autoboxing: " + hashMap2);

        // Hashmap with unboxing
        java.util.HashMap<Integer, String> hashMap3 = new java.util.HashMap<>();
        hashMap3.put(1, "One");
        hashMap3.put(2, "Two");
        hashMap3.put(3, "Three");
        System.out.println("Hashmap with unboxing: " + hashMap3);
    }




}
