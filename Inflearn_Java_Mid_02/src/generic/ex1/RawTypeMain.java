package generic.ex1;

public class RawTypeMain {
    public static void main(String[] args) {
        GenericBox integerBox = new GenericBox();
//        GenericBox<Object> integerBox = new GenericBox<>(); // 권장
        integerBox.set(10);
        Object object = integerBox.get(); // 타입 지정을 하지 않으면 Object 타입으로 된다.
    }
}
