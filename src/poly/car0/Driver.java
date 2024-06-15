package poly.car0;

public class Driver {

    private K3Car k3Car; // 운전자가 K3Car를 의존하고 있다.

    public void setK3Car(K3Car k3Car) {
        this.k3Car = k3Car;
    }

    public void drive() {
        System.out.println("자동차를 운전합니다.");
        k3Car.startEngine();
        k3Car.pressAccelerator();
        k3Car.offEngine();
    }

}
