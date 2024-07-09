package method;

public class Method1Ref {
    public static void main(String[] args) {
        // 계산 1
        System.out.println(add(5, 10));

        // 계산 2
        System.out.println(add(15, 20));
    }

    // add 메서드
    public static int add(int a, int b) {
        System.out.println(a + " + " + b + " 수행");
        int sum = a + b;
        return sum;
    }
}
