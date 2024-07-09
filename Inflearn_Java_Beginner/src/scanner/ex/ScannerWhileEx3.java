package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int input = 0;

        System.out.print("숫자를 입력하세요. 입력 중단하려면 -1을 입력하세요: ");
        while (true) {
            input = sc.nextInt();
            if (input == -1) {
                break;
            }
            sum += input;
            count++;
        }

        double average = (double) sum / count;
        System.out.println(sum);
        System.out.println(average);
    }
}
