package lang.string.test;

public class TestString5 {
    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";

        int index = str.indexOf(ext);
        String substring = str.substring(0, index);
        String substring1 = str.substring(index);

        System.out.println("substring = " + substring);
        System.out.println("substring1 = " + substring1);
    }
}
