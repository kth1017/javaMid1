package nested;

public class ShadowingPractice {
    // 실무에선 그냥 애초에 변수명을 다르게 명확히 하는 것이 나음
    public int value = 1;
    public String method(){
        return "a";
    }

    class Inner {
        public int value = 2;

        public String method(){
            return "b";
        }

        public void print() {
            int value = 3;
            System.out.println(value);
            System.out.println(this.value);
            System.out.println(ShadowingPractice.this.value);

            System.out.println(method());
            System.out.println(ShadowingPractice.this.method());
        }
    }

    public static void main(String[] args) {
        ShadowingPractice outer = new ShadowingPractice();
        ShadowingPractice.Inner inner = outer.new Inner();
        inner.print();
    }
}
