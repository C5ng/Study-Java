package enumeration.ex1;

public class StringGradeEx1_2 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();

        // 개발자가 실수로 존재하지 않는 등급을 입력
        int vip = discountService.discount("VIP", price);
        System.out.println("vip = " + vip);
    }
}
