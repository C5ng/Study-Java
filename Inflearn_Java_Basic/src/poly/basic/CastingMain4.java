package poly.basic;

public class CastingMain4 {
    public static void main(String[] args) {
        // 다운캐스팅을 자동으로 하지 않는 이유
        Parent parent1 = new Child();
        Child child1 = (Child) parent1; // 자식 변수에 부모 인스턴스 참조 불가능. -> 다운캐스팅
        child1.childMethod();

        Parent parent2 = new Parent();
        Child child2 = (Child) parent2; // ClassCastException, Parent2에는 Child 인스턴스가 존재하지 않는다.
        child2.childMethod();
    }
}
