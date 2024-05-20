package nested.prac;

import java.util.ArrayList;

public class AnonymousPractice3 {
    public static void main(String[] args) {
        // 1. Anonymous class
        ArrayList<String> arrayList = new ArrayList<String>() {
            @Override
            public boolean add(String e) {
                System.out.println("Anonymous class");
                return super.add(e);
            }
        };
        arrayList.add("Anonymous class");

        // 2. Lambda expression
        ArrayList<String> arrayList2 = new ArrayList<String>() {
            @Override
            public boolean add(String e) {
                System.out.println("Lambda expression");
                return super.add(e);
            }
        };
        arrayList2.add("Lambda expression");
    }







}
