package operator;

public class OperatorAdd2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        b = ++a; // a의 값을 먼저 증가시킨 후 b에 할당 -> 전위 증감 연산자
        System.out.println("a = " + a + ", b = " + b);

        a = 1;
        b = 0;

        b = a++; // b에 대입 후 a의 값을 증가 -> 후위 증감 연산자
        System.out.println("a = " + a + ", b = " + b);
    }
}
