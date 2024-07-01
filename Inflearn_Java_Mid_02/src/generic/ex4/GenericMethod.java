package generic.ex4;

public class GenericMethod {
    public static Object objMethod(Object object) {
        System.out.println("Object print: " + object);
        return object;
    }

    public static <T> T genericMethod(T t) { // 메서드 안에서만 제네릭 메서드 임을 선언
        System.out.println("generic print: " + t);
        return t;
    }

    public static <T extends Number> T numberMethod(T t) { // 타입 매개변수 제한 가능
        System.out.println("bound print: " + t);
        return t;
    }
}
