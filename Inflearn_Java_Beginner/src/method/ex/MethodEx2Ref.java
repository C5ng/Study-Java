package method.ex;

public class MethodEx2Ref {
    public static void main(String[] args) {
        printMessage("Hello, world!", 3);
        printMessage("Hello, world!", 5);
        printMessage("Hello, world!", 7);
    }

    private static void printMessage(String s, int i) {
        for (int j = 0; j < i; j++) {
            System.out.println(s);
        }
    }
}
