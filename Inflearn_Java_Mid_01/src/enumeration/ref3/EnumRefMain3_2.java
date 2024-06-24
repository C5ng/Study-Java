package enumeration.ref3;

public class EnumRefMain3_2 {
    public static void main(String[] args) {
        int price = 10000;

        // DiscountService를 사용 할 필요가 없어졌다.
        System.out.println("basic = " + Grade.BASIC.discount(price));
        System.out.println("gold = " + Grade.GOLD.discount(price));
        System.out.println("diamond = " + Grade.DIAMOND.discount(price));
    }
}
