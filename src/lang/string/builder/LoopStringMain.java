package lang.string.builder;

public class LoopStringMain {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        String result = "";
        // 루프에선 string으로 최적화 안됨
        for (int i = 0; i < 100000; i++) {
            result += "Hello Java ";
        }
        long endTime = System.currentTimeMillis();

        System.out.println("result = " + result);
        System.out.println("time = " + (endTime - startTime) + "ms");
    }
}
