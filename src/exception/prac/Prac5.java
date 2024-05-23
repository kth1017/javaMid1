package exception.prac;

public class Prac5 {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception");
        }
    }



}
