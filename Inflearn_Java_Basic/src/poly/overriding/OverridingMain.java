package poly.overriding;

public class OverridingMain {
    public static void main(String[] args) {
        // 자식 변수가 자식 인스턴스 참조
        Child child = new Child();
        System.out.println("Child -> Child");
        System.out.println("value = " + child.value);
        child.method();

        // 부모 변수가 부모 인스턴스 참조
        Parent parent = new Parent();
        System.out.println("Parent -> Parent");
        System.out.println("value = " + parent.value);
        parent.method();

        // 부모 변수가 자식 인스턴스 참조
        Parent parent2 = new Child();
        System.out.println("Parent -> Child");
        System.out.println("value = " + parent2.value);
        parent2.method(); // 오버라이딩 된 메서드(Child.method()) 호드
    }
}
