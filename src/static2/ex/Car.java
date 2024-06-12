package static2.ex;

public class Car {
    private static int carCount;

    public Car(String car) {
        System.out.println("차량 구입, 이름: " + car);
        carCount++;
    }

    public static void showTotalCards() {
        System.out.println("구매한 차량 수: " + carCount);
    }
}
