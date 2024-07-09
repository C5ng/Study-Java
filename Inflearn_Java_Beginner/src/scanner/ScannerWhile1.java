package scanner;

import java.util.Scanner;

public class ScannerWhile1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("문자열을 입력하세요: ");
            String command = scanner.nextLine();
            if (command.equals("exit")) {
                break;
            }

            System.out.println(command);
        }
    }
}
