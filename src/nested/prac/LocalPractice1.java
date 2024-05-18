package nested.prac;

public class LocalPractice1 {

    public static void main(String[] args) {
        // 1. Local class
        class LocalClass {
            public void print() {
                System.out.println("Local class");
            }
        }
        LocalClass localClass = new LocalClass();
        localClass.print();

        // 2. Anonymous class
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous class");
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();


    }

}
