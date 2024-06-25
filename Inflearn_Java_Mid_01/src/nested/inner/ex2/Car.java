package nested.inner.ex2;

public class Car {
    private String model;
    private int chargeLevel;
    private Engine engine;

    public Car(String model, int chargeLevel) {
        this.model = model;
        this.chargeLevel = chargeLevel;
        this.engine = new Engine();
    }

    public void start() {
        engine.start();
        System.out.println(model + " 시작 완료");
    }

    private class Engine { // Engine은 Car에서만 사용되니 private으로 변경
        public void start() {
            System.out.println("(내부) 충전 레벨 확인: " + chargeLevel);
            System.out.println("(내부) " + model + "의 엔진을 구동합니다.");
        } // 내부 클래스는 바깥 클래스의 인스턴스에 접근할 수 있다.
    }
}
