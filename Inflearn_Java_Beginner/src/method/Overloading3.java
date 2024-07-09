package method;

public class Overloading3 {
    public static void main(String[] args) {
        System.out.println(add(2, 3));
        System.out.println(add(2.0, 3.0));
    }

    public static int add(int a, int b) {
        System.out.println("1번 호출");
        return a + b;
    }

    public static double add(double a, double b) {
        System.out.println("2번 호출");
        return a + b;
    }
}
