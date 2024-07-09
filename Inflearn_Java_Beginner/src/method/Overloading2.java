package method;

public class Overloading2 {
    public static void main(String[] args) {
        add(2, 3.0);
        add(2.0, 3);
    }

    public static void add(int a, double b) {
        System.out.println("1번 호출");
    }

    public static void add(double a, int b) {
        System.out.println("2번 호출");
    }
}
