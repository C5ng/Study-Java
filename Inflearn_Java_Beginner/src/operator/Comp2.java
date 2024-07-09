package operator;

public class Comp2 {
    public static void main(String[] args) {
        String str = "문자열1";
        String str2 = "문자열2";

        boolean result1 = "hello".equals("hello"); // 리터럴 비교
        boolean result2 = str.equals("문자열1"); // 변수, 리터럴 비교
        boolean result3 = str.equals(str2); // 문자열 비교

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
