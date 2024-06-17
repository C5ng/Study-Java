package extends1.super2;

public class ClassC extends ClassB {
    public ClassC() {
        super(10, 20); // ClassB에서 생성자를 정의했으니 기본생성자 존재 X -> super() 생략 불가
        System.out.println("ClassC 생성자");
    }
}
