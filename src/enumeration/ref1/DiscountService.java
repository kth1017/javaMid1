package enumeration.ref1;
public class DiscountService {

    public int discount(ClassGrade classGrade, int price) {
        //ex02 리팩토링
        return price * classGrade.getDiscountPercent() / 100;
    }
}
