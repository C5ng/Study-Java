package array.ex;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("입력받을 숫자의 개수를 입력하세요: ");
        int[] numbers = new int[sc.nextInt()];
        int sum = 0;
        double average;

        System.out.println(numbers.length + "개의 정수를 입력하세요.");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
            sum += numbers[i];
        }

        average = (double) sum / numbers.length;
        System.out.println(average);
    }
}
