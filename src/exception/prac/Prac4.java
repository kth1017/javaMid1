package exception.prac;

public class Prac4 {

    public static void main(String[] args) {
        try {
            Class.forName("exception.prac.Prac4");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found exception");
        }
    }


}
