package lang.immutable.address;

public class RefMain2 {
    public static void main(String[] args) {
        ImmutableAddress immutableAddress1 = new ImmutableAddress("서울");
        ImmutableAddress immutableAddress2 = immutableAddress1; // 참조값 대입을 막을 수 있는 방법은 없다.
        System.out.println("immutableAddress1 = " + immutableAddress1);
        System.out.println("immutableAddress2 = " + immutableAddress2);

//        immutableAddress2.setValue("부산"); // setValue 존재 X
        immutableAddress2 = new ImmutableAddress("부산"); // 새로운 인스턴스를 생성해 값을 변경
        System.out.println("immutableAddress2 = " + immutableAddress2);
    }
}
