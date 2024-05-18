package nested.prac;

public class NestedPractice1 {
    public static void main(String[] args) {
        // 1. static nested class
        OuterClass.StaticNestedClass staticNestedClass = new OuterClass.StaticNestedClass();
        staticNestedClass.print();

        // 2. inner class
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.print();

        // 3. anonymous class
        OuterClass outerClass2 = new OuterClass() {
            @Override
            public void print() {
                System.out.println("Anonymous class");
            }
        };
        outerClass2.print();
    }

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
