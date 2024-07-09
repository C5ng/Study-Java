package scanner.ex;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("당신의 이름을 입력하세요: ");
        String name = sc.nextLine();

        System.out.print("나이: ");
        int age = sc.nextInt();

        System.out.println(name + " " + age);
    }
}
