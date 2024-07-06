package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();

        System.out.println("n개의 정수를 입력하세요 (종료 0)");
        while (true) {
            int n = sc.nextInt();

            if (n == 0) {
                break;
            }

            arrayList.add(n);
        }

        System.out.println("출력");

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i));

            if (i != arrayList.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}
