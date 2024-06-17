package poly.ex4;

public class Dog extends AbstractAnimal {
    @Override
    public void move() {
        System.out.println("멍멍이 이동");
    }

    @Override
    public void sound() {
        // 반드시 구현해야 하는 메서드 (부모에서 추상 메서드)
        System.out.println("멍멍");
    }
}
