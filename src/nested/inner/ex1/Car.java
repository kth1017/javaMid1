package nested.inner.ex1;

public class Car {
    private String model;
    private int chargeLevel;
    private Engine engine;

    public Car(String model, int chargeLevel) {
        this.model = model;
        this.chargeLevel = chargeLevel;
        // 1. 쓸데없이 this를 받음
        this.engine = new Engine(this);
    }

    // 2. Engine에서만 사용하는 메서드
    public String getModel() {
        return model;
    }
    public int getChargeLevel() {
        return chargeLevel;
    }

    public void start() {
        engine.start();
        System.out.println(model + " 시작 완료");
    }
}
