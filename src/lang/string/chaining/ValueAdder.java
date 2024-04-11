package lang.string.chaining;

public class ValueAdder {

    private int value;

    public ValueAdder add(int addValue) {
        value += addValue;
        return this;
//         return new ValueAdder(value);
    }

//    public ValueAdder(int value) {
//        this.value = value;
//    }

    public int getValue() {
        return value;
    }
}
