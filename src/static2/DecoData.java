package static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
        // static 메서드

//        instanceValue++; // 인스턴스 변수 접근, compile error
//        instanceMerthod(); // 인스턴스 메서드 접근, compile error
        // 인스턴스가 생성해야 참조값을 가지는데 static 내에서는 인스턴스가 생성되지 않으니 접근할 수 없다.

        staticValue++; // 정적 변수 접근
        staticMethod(); // 정적 메서드 접근
    }

    public void instanceCall() {
        instanceValue++; // 인스턴스 변수 접근
        instanceMethod(); // 인스턴스 메서드 접근

        staticValue++; // 스태틱 변수 접근
        staticMethod(); // 스태틱 메서드 접근

        // 모두 가능
    }

    private void instanceMethod() {
        System.out.println("instanceValue = " + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue = " + staticValue);
    }
}
