package nested.prac;

public class AnonymousPractice2 {
    public static void main(String[] args) {
        // 1. Anonymous class
        Thread thread = new Thread() {
            @Override
            public void run() {
                synchronized (this) {
                    System.out.println("Anonymous class");
                }
            }
        };
        thread.start();

        // 2. Lambda expression
        Thread thread2 = new Thread(() -> {
            synchronized (thread) {
                System.out.println("Lambda expression");
            }
        });
        thread2.start();
    }


}
