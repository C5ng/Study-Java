package lang.string.method;

public class StringUtilsMain1 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        Object obj = new Object();
        String str = "Hello Java!";

        // valueOf 메서드
        String numStr = String.valueOf(num);
        System.out.println("숫자의 문자열 값 = " + numStr);
        String boolStr = String.valueOf(bool);
        System.out.println("불리언의 문자열 값 = " + boolStr);
        String objStr = String.valueOf(obj);
        System.out.println("objStr = " + objStr); // 인스턴스 주소 값

        String numStr2 = "" + num; // 문자 + 숫자 -> 문자로 처리된다.
        System.out.println("numStr2 = " + numStr2);

        // toCharArray 메서드
        char[] strCharArray = str.toCharArray(); // String 값을 char 배열로 만들어준다.
        System.out.println("strCharArray = " + strCharArray);
        for (char c : strCharArray) {
            System.out.print(c);
        }


    }
}
