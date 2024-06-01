package nested.inner;

public class InnerOuterMain {

    public static void main(String[] args) {
        InnerOuter outer = new InnerOuter();
        // 문법 주의 (참조클래스명 변수명 = 참조변수명[참조값].new 생성자();)
        InnerOuter.Inner inner = outer.new Inner();
        // 컴파일시 new InnerOuter.Inner(outer)로 변환됨
        inner.print();

        System.out.println("outerClass = " + outer.getClass());
        System.out.println("innerClass = " + inner.getClass());

    }
}
