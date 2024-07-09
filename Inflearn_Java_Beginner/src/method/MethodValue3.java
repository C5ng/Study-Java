package method;

public class MethodValue3 {
    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("1. changeNumber 호출 전 num1: " + num1);
        num1 = changeNumber(num1);
        System.out.println("4. changeNumber 호출 후 num1: " + num1);
    }

    // main 메서드의 number와 changeNumber 메서드의 number는 서로 다른 변수이다.

    public static int changeNumber(int number) {
        number *= 2;
        return number;
    }
}
