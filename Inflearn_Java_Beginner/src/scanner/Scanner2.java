package scanner;

import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자: ");
        int num1 = scanner.nextInt();

        System.out.printf("두 번째 숫자: ");
        int num2 = scanner.nextInt();

        System.out.println(num1 + num2);
    }
}
