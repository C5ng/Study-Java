package lang.string.test;

public class TestString11 {
    public static void main(String[] args) {
        String fruits = "Hello Java";

        String reverse = new StringBuilder(fruits).reverse().toString();
        System.out.println("reverse = " + reverse);
    }
}
