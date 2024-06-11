package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;

    public void addItem(Item item) {
        // 검증 로직
        if (isOver(itemCount)) {
            System.out.println("상품은 최대 10개까지 담을 수 있습니다.");
            return;
        }

        // 실행 로직, 검증 로직에서 통과하지 못하면 실행로직이 작동 X -> 더 명확하게 구분 가능하게 된다.
        items[itemCount] = item;
        itemCount++;
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");

        for (Item item : items) {
            System.out.println("상품명: " + item.getName() + " 합계: " + item.getTotalPrice());
        }
    }

    private boolean isOver(int itemCount) {
        if (itemCount >= items.length) {
            return true;
        }

        return false;
    }
}
