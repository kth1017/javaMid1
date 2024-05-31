package nested.nested.ex1;

public class NetworkMain {

    // 현재 패키지의 Network와 NetworkMessage 클래스의 관계를 타 개발자가 파악해야함
    public static void main(String[] args) {
        Network network = new Network();
        network.sendMessage("hello java");
    }
}
