package scanner.ex;

import java.util.Scanner;

public class ScannerEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("음식 이름 입력: ");
        String foodName = scanner.nextLine();

        System.out.printf("음식 가격 입력: ");
        int foodPrice = scanner.nextInt();

        System.out.printf("음식 수량 입력: ");
        int foodQuantity = scanner.nextInt();

        int totalPrice = foodPrice * foodQuantity;
        System.out.println(foodName + " " + foodQuantity + "개를 주문하셨습니다. 총 가격은 " + totalPrice + "원입니다.");
    }
}
