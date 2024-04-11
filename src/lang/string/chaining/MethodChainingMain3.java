package lang.string.chaining;

public class MethodChainingMain3 {

    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        // adder가 this로 자신의 참조값을 반환하지 않는다면 체이닝을 위한 추가 코딩 필요 / VA 참고
        int result = adder.add(1).add(2).add(3).getValue();
        System.out.println("result = " + result);
    }
}
