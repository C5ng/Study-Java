package poly.basic;

public class CastingMain3 {
    public static void main(String[] args) {
        // upcasting vs downcasting

        Child child = new Child();
        Parent parent1 = (Parent) child; // 업캐스팅은 생략이 가능하다. -> 권장이 관례
        Parent parent2 = child;

        parent1.parentMethod();
        parent2.parentMethod();
    }
}
