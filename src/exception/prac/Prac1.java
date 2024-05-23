package exception.prac;

public class Prac1 {

    public static void main(String[] args) {
        try {
            int[] arr = new int[3];
            arr[3] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds exception");
        }
    }


}
