package lang.immutable.test;

public class ImmutableMyDateMain {
    public static void main(String[] args) {
        ImmutableMyDate date1 = new ImmutableMyDate(2024, 1, 1);
        ImmutableMyDate date2 = date1;
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);

        System.out.println("2025 -> date1");
        date1 = date1.withYear(2025); // 반환 값 할당을 받아야 새로운 객체가 생성되고 해당 인스턴스의 참조값을 가져온다.
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);
    }
}
