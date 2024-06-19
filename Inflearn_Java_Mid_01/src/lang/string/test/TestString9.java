package lang.string.test;

public class TestString9 {
    public static void main(String[] args) {
        String str = "hello@example.com";
        String[] split = str.split("@");

        System.out.println("ID: " + split[0]);
        System.out.println("Domain: " + split[1]);
    }
}
