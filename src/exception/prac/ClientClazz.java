package exception.prac;

public class ClientClazz {
    public static void main(String[] args) {
        // 1. ClassNotFoundException
        try {
            Class.forName("java.lang.String");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // 2. NoSuchMethodException
        try {
            Class clazz = String.class;
            clazz.getMethod("length");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}