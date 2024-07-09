package array;

public class EnhancedFor1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // 기존 for
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.println(number);
        }

        // 향상된 for, iter + tap -> 향상된 for
        for (int i : numbers) {
            System.out.println(i);
        }

        // foreach 사용할 수 없는 경우 -> 증가하는 index 값 필요
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i + " " + numbers[i]);
        }
    }
}
