package generic.ex4;

public class MethodMain1 {
    public static void main(String[] args) {
        Integer i = 10;
        Object object = GenericMethod.objMethod(i);
        Integer result = (Integer) GenericMethod.objMethod(i);

        // 타입 인자 (Type Argument) 명시적 전달
        System.out.println("명시적 타입 인자 전달");
        Integer result1 = GenericMethod.<Integer>genericMethod(i);
        System.out.println("result1 = " + result1);
        Integer integerValue = GenericMethod.<Integer>numberMethod(10);
        System.out.println("integerValue = " + integerValue);
        Double doubleValue = GenericMethod.<Double>numberMethod(20.0);
        System.out.println("doubleValue = " + doubleValue);

        // 타입 추론
        System.out.println("타입 추론");
        Integer result2 = GenericMethod.genericMethod(i);
        Integer integerValue2 = GenericMethod.numberMethod(10);
        Double doubleValue2 = GenericMethod.numberMethod(20.0); // 타입 인자를 직접 전달하지 않아도 된다.
    }
}
