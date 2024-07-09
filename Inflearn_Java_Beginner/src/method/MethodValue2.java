package method;

public class MethodValue2 {
    public static void main(String[] args) {
        int number = 5;
        System.out.println("1. changeNumber 호출 전 number: " + number);
        changeNumber(number);
        System.out.println("4. changeNumber 호출 후 number: " + number);
    }

    // main 메서드의 number와 changeNumber 메서드의 number는 서로 다른 변수이다.

    public static void changeNumber(int number) {
        System.out.println("2. changeNumber 변경 전 num2: " + number);
        number *= 2;
        System.out.println("3. changeNumber 변경 후 num2: " + number);

    }
}
