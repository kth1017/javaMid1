package exception.prac;

public class Prac3 {
    // ThreadDeath error practice
    public static void main(String[] args) {
        try {
            Thread.currentThread().stop();
        } catch (ThreadDeath e) {
            System.out.println("Thread death error");
        }
    }


}
