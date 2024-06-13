package poly.ex4;

// 순수 추상 클래스
public abstract class AbstractAnimal {
    public abstract void sound(); // 메서드 바디 존재 X, 호출되면 안 된다. -> 추상 메서드가 하나라도 존재하는 클래스는 추상 클래스로 만들어야 한다. (인스턴스 생성 불가능하게)

    public abstract void move();
}
