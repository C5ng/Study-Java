package lang.string.immutable;

public class StringImmutable2 {
    public static void main(String[] args) {
        String str = "hello ";
        String concatStr = str.concat("java");// concat 메서드를 수행 후 다시 할당해줘야 한다.
        System.out.println("str = " + str);
        System.out.println("concatStr = " + concatStr);
    }
}
