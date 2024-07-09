package operator;

public class Operator2 {
    public static void main(String[] args) {
        String result1 = "hello " + "world";
        System.out.println(result1); // 문자열 더하기

        String s1 = "string1";
        String s2 = "string2";
        System.out.println(s1 + s2); // 문자열 더하기

        String result3 = "a + b = " + 10; // 문자열과 숫자를 같이 더하면 자동으로 숫자를 문자로 형변환 시킨다.
        System.out.println(result3);

        int num = 20;
        String str = "a + b = ";
        String result4 = str + num;
        System.out.println(result4);
    }
}
