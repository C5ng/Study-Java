package lang.string.equals;

public class StringEqualsMain2 {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("메서드 호출 비교 1: " + isSame(str1, str2));

        String str3 = "hello";
        String str4 = "hello";
        System.out.println("메서드 호출 비교 2: " + isSame(str3, str4));

        // 리터럴을 사용한 문자열이 사용될지, 생성자로 만들어진 문자열이 사용될지 모르니 항상 equals()를 사용해야 한다.
    }

    public static boolean isSame(String str1, String str2) {
        return str1 == str2;
    }
}
