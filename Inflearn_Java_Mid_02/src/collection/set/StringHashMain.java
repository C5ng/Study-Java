package collection.set;

public class StringHashMain {
    static final int CAPACITY = 10;

    public static void main(String[] args) {
        // char
        char charA = 'A';
        char charB = 'B';
        System.out.println("charA = " + (int) charA);
        System.out.println("charB = " + (int) charB);

        // hashCode
        System.out.println("hashCode(\"A\") = " + hashCode("A"));
        System.out.println("hashCode(\"B\") = " + hashCode("B"));
        System.out.println("hashCode(\"AB\") = " + hashCode("AB"));
        System.out.println("hashCode(\"C5ng\") = " + hashCode("C5ng"));

        // hashIndex
        System.out.println("hashIndex(hashCode(\"A\")) = " + hashIndex(hashCode("A"))); // 65 % 10 == 5
        System.out.println("hashIndex(hashCode(\"A\")) = " + hashIndex(hashCode("B")));
        System.out.println("hashIndex(hashCode(\"A\")) = " + hashIndex(hashCode("AB")));

    }

    static int hashCode(String string) {
        char[] charArray = string.toCharArray();
        int sum = 0;
        for (char c : charArray) {
            sum += (int) c;
        }

        return sum;
    }

    static int hashIndex(int value) {
        return value % CAPACITY;
    }
}
