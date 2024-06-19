package lang.string.method;

public class StringComparisonMain {
    public static void main(String[] args) {
        String str1 = "Hello Java"; // 대문자 일부 존재
        String str2 = "hello java"; // 모두 소문자
        String str3 = "Hello World";

        System.out.println("str1 equals str2: " + str1.equals(str2));
        System.out.println("str1 equalsIgnoreCase str2: " + str1.equalsIgnoreCase(str2));

        System.out.println("'b' compareTo 'a': " + "a".compareTo("c")); // 사전적으로 몇 개 차이나는지
        System.out.println("str1 compareTo str3: " + str1.compareTo(str3));
        System.out.println("str1 compareToIgnoreCase str2: " + str1.compareToIgnoreCase(str2));

        System.out.println("str1 starts with Hello: " + str1.startsWith("Hello"));
        System.out.println("str1 starts with Hello: " + str1.endsWith("Java"));


    }
}
