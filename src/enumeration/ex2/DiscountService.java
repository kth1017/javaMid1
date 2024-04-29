package enumeration.ex2;

public class DiscountService {

    public int discount(ClassGrade classGrade, int price) {
        int discountPercent = 0;

        // 어차피 인스턴스가 정해져 ==을 써도 무방
        if (classGrade == ClassGrade.BASIC) {
            discountPercent = 10;
        } else if (classGrade == ClassGrade.GOLD) {
            discountPercent = 20;
        } else if (classGrade == ClassGrade.DIAMOND) {
            discountPercent = 30;
        } else {
            System.out.println("할인X");
        }

        return price * discountPercent / 100;
    }
}
