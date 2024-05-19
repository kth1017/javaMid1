package nested.prac;

public class NestedPractice2 {
    static class OuterClass {
        static class StaticNestedClass {
            public void print() {
                System.out.println("Static nested class");
            }
        }

        class InnerClass {
            public void print() {
                System.out.println("Inner class");
            }
        }

        public void print() {
            System.out.println("Outer class");
        }
    }

}
