package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("상품의 가격 입력 (-1 입력 시 종료): ");
            int price = sc.nextInt();

            if (price == -1) {
                break;
            }

            System.out.print("구매하려는 수량 :");
            int quantity = sc.nextInt();

            System.out.println(price * quantity);
        }
    }
}
