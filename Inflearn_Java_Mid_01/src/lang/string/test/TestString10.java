package lang.string.test;

public class TestString10 {
    public static void main(String[] args) {
        String fruits = "apple,banana,mango";
        String[] split = fruits.split(",");

        String joinString = String.join("->", split);
        System.out.println("joinString = " + joinString);
    }
}
