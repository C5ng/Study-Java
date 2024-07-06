package collection.list.test.ex2;

import java.util.ArrayList;

public class ShoppingCart {
    ArrayList<Item> arrayList = new ArrayList<>();

    public void addItem(Item item) {
        arrayList.add(item);
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");

        int sum = 0;
        for (Item item : arrayList) {
            System.out.println("상품명: " + item.getName() + " 합계: " + item.getTotalPrice());
            sum += item.getTotalPrice();
        }

        System.out.println("전체 가격 합: " + sum);
    }
}
