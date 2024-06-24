package enumeration.ref3;

public enum Grade {
    BASIC(10), GOLD(20), DIAMOND(30), VIP(40); // new 불가능, () 사용해서 생성자 호출하면 된다.
    // 로직이 들어가면 ; 넣어줘야 한다.

    private final int discountPercent;

    Grade(int discountPercent) {
        this.discountPercent = discountPercent;
    } // private이 생략되어 있다.

    public int getDiscountPercent() {
        return discountPercent;
    }

    // 추가
    public int discount(int price) {
        return price * discountPercent / 100;
    }
}
