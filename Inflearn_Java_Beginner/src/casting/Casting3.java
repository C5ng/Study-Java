package casting;

public class Casting3 {
    public static void main(String[] args) {
        long maxIntValue = 2147483647; // int 최고값
        long maxIntOver = maxIntValue + 1; // int 최고값 + 1

        int intValue = 0;

        intValue = (int) maxIntValue;
        System.out.println(intValue);

        intValue = (int) maxIntOver; // 오버플로우가 발생 -> int의 가장 작은 값부터 다시 시작
        System.out.println(intValue);
    }
}
