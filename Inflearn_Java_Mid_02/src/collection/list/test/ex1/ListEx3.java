package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx3 {
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

        int sum = 0;
        for (Integer integer : arrayList) {
            sum += integer;
        }
        double average = (double) sum / arrayList.size();

        System.out.println("sum = " + sum);
        System.out.println("average = " + average);
    }
}
