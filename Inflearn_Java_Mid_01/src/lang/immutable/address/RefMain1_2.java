package lang.immutable.address;

public class RefMain1_2 {
    public static void main(String[] args) {
        // 참조형 변수는 하나의 인스턴스를 공유 O
        Address address1 = new Address("서울");
        Address address2 = new Address("서울");
        System.out.println("address1 = " + address1);
        System.out.println("address2 = " + address2);

        address2.setValue("부산");
        System.out.println("부산 -> b");
        System.out.println("address1 = " + address1);
        System.out.println("address2 = " + address2);
    }
}
